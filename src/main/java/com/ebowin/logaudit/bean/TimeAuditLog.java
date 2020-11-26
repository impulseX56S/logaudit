package com.ebowin.logaudit.bean;

import org.elasticsearch.index.VersionType;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "time_audit_log", shards = 1, versionType = VersionType.INTERNAL, createIndex = true)
public class TimeAuditLog extends LogTemp {
    String url;
    Integer useTime;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getUseTime() {
        return useTime;
    }

    public void setUseTime(Integer useTime) {
        this.useTime = useTime;
    }
}
