package com.ebowin.logaudit;

import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.common.UUIDs;

public class PattenTest {
    public static void main(String[] args) {
        String logMessage = "2020-10-13 09:34:01,314 INFO http-nio-8091-exec-1 [jsdoctor.mobileapi.controller.school.HealthLessonController] - </jsdoctor-mobile-api/conference/query use time: 134>";
        String timeAudio= "/jsdoctor-mobile-api/conference/query use time: 64";
        System.out.println(logMessage);
        String logDate = StringUtils.mid(logMessage, 0, 23);
        System.out.println(logDate);
        String logLevel = logMessage.split(StringUtils.SPACE)[2];
        System.out.println(logLevel);
        String className = StringUtils.substringBetween(logMessage, "[","]");
        System.out.println(className);
        String content = StringUtils.substringBetween(logMessage, "<",">");
        System.out.println(content);
        System.out.println(UUIDs.base64UUID());
        System.out.println(UUIDs.legacyBase64UUID());
        System.out.println(UUIDs.randomBase64UUID());
        System.out.println(UUIDs.randomBase64UUIDSecureString().toString());

        String[] split = timeAudio.split(" use time: ");
        System.out.println(split[0]+"             "+split[1]);

    }
}
