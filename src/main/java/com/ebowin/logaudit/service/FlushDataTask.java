package com.ebowin.logaudit.service;

import com.ebowin.logaudit.bean.BasicLog;
import com.ebowin.logaudit.bean.TimeAuditLog;
import com.ebowin.logaudit.dao.LogContentRepository;
import com.ebowin.logaudit.dao.TimeAuditLogRepository;
import com.ebowin.logaudit.stream.ConvergeMessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;

@Component
public class FlushDataTask {

    @Autowired
    LogContentRepository logContentRepository;
    @Autowired
    TimeAuditLogRepository timeAuditLogRepository;

    @Scheduled(fixedDelay = 10000)
    private void flush(){
        ArrayList<BasicLog> basicLogs = ConvergeMessageUtils.addBasicLog(null, true);
        if(!CollectionUtils.isEmpty(basicLogs)){
            logContentRepository.saveAll(basicLogs);
        }
        ArrayList<TimeAuditLog> timeAuditLogs = ConvergeMessageUtils.addTimeAuditLog(null, true);
        if(!CollectionUtils.isEmpty(timeAuditLogs)){
            timeAuditLogRepository.saveAll(timeAuditLogs);
        }
    }
}
