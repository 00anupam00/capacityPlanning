package com.zaloni.hack.service;

import com.zaloni.hack.domain.AuditInfo;
import com.zaloni.hack.repository.AuditInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

@Service
public class ESService {

    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    AuditInfoRepository auditInfoRepository;

    public AuditInfo save(AuditInfo auditInfo){
        return auditInfoRepository.save(auditInfo);
    }
}
