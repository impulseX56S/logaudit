package com.ebowin.logaudit.bean;

import org.elasticsearch.index.VersionType;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "info_log_basic", shards = 1, versionType = VersionType.INTERNAL, createIndex = true)
public class BasicLog extends LogTemp{

    String logContent;

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }
}
