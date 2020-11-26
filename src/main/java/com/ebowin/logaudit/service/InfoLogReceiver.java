package com.ebowin.logaudit.service;

import com.ebowin.logaudit.bean.BasicLog;
import com.ebowin.logaudit.bean.TimeAuditLog;
import com.ebowin.logaudit.constant.DatePattern;
import com.ebowin.logaudit.dao.LogContentRepository;
import com.ebowin.logaudit.dao.TimeAuditLogRepository;
import com.ebowin.logaudit.stream.ConvergeMessageUtils;
import com.ebowin.logaudit.stream.InfoLogStream;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.common.UUIDs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

@Component
public class InfoLogReceiver {
    final static Logger logger = LoggerFactory.getLogger(InfoLogReceiver.class);

    @Autowired
    private LogContentRepository logContentRepository;

    @Autowired
    private TimeAuditLogRepository timeAuditLogRepository;

    @StreamListener(InfoLogStream.INPUT)
    public void handleGreetings(@Payload  String logMessage) {

        if(logMessage.contains("org.springframework") ){
            return;
        }
//        logger.info("Received logMessage: {}", logMessage);
        BasicLog logContent = initLogContent(logMessage);
        if(logMessage.contains("use time:")){
            saveTimeAuditLog(logContent);
            return;
        }

        saveBasicLog(logContent);
    }

    private void saveTimeAuditLog(BasicLog basicLog) {
        TimeAuditLog timeAuditLog = new TimeAuditLog();
        BeanUtils.copyProperties(basicLog,timeAuditLog);
        String logContent = basicLog.getLogContent();
        String[] splitContent = logContent.split(" use time: ");
        timeAuditLog.setUrl(splitContent[0]);
        timeAuditLog.setUseTime(Integer.parseInt(splitContent[1]));
        ArrayList<TimeAuditLog> timeAuditLogs = ConvergeMessageUtils.addTimeAuditLog(timeAuditLog,false);
        if(timeAuditLogs != null){
            timeAuditLogRepository.saveAll(timeAuditLogs);
        }
    }

    private void saveBasicLog(BasicLog logContent) {
        ArrayList<BasicLog> basicLogs = ConvergeMessageUtils.addBasicLog(logContent,false);
        if(basicLogs != null){
            logContentRepository.saveAll(basicLogs);
        }
    }


    private BasicLog initLogContent(String logMessage) {
        BasicLog logContent = new BasicLog();
        String logDateStr = StringUtils.mid(logMessage, 0, 23);
        String logLevel = logMessage.split(StringUtils.SPACE)[2];
        String className = StringUtils.substringBetween(logMessage, "[","]");
        String content = StringUtils.substringBetween(logMessage, "<",">");
        try {
            Date logDate = DatePattern.NORM_DATETIME_MS_FORMAT.parse(logDateStr);
            logContent.setLogTime(logDate);
            logContent.setTimestamp(logDate);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        logContent.setLogLevel(logLevel);
        logContent.setLogClass(className);
        logContent.setLogContent(content);
        logContent.setId(UUIDs.legacyBase64UUID());
        return logContent;
    }


}
