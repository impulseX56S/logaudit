package com.ebowin.logaudit.dao;

import com.ebowin.logaudit.bean.BasicLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface LogContentRepository extends ElasticsearchRepository<BasicLog,String> {
}
