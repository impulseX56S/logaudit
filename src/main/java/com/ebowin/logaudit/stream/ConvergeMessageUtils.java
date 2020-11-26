package com.ebowin.logaudit.stream;

import com.ebowin.logaudit.bean.BasicLog;
import com.ebowin.logaudit.bean.TimeAuditLog;

import java.util.ArrayList;

public class ConvergeMessageUtils {
    public static ArrayList<TimeAuditLog> timeAuditLogs= new ArrayList<>(5000);
    public static ArrayList<BasicLog> basicLogs= new ArrayList<>(1000);

    public synchronized static ArrayList<TimeAuditLog>  addTimeAuditLog(TimeAuditLog timeAuditLog,boolean flushFlag){
        if(timeAuditLog != null){
            timeAuditLogs.add(timeAuditLog);
        }
        ArrayList<TimeAuditLog> clone = null ;
        if(flushFlag ||timeAuditLogs.size() >= 5000){
            clone = (ArrayList<TimeAuditLog>) timeAuditLogs.clone();
            timeAuditLogs.clear();
        }
        return clone;
    }

    public synchronized  static ArrayList<BasicLog>  addBasicLog(BasicLog basicLog,boolean flushFlag){
        if(basicLog != null ){
            basicLogs.add(basicLog);
        }
        ArrayList<BasicLog> clone = null ;
        if(flushFlag || basicLogs.size() >= 1000){
            clone = (ArrayList<BasicLog>) basicLogs.clone();
            basicLogs.clear();
        }
        return clone;
    }

}
