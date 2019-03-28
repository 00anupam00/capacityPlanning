package com.zaloni.hack.repository;

import com.zaloni.hack.domain.AuditInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditInfoRepository extends ElasticsearchRepository<AuditInfo, String> {

    //Page<AuditInfo> findAuditInfoVos(String id, Pageable pageable);
}
