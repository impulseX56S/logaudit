package com.ebowin.logaudit.dao;

import com.ebowin.logaudit.bean.TimeAuditLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface TimeAuditLogRepository extends ElasticsearchRepository<TimeAuditLog,String> {
}
