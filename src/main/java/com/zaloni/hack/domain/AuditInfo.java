package com.zaloni.hack.domain;

import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;
import java.util.StringJoiner;


@Document(indexName = "auditInfo", type = "audit")
public class AuditInfo {

    @Id
    private String id;

    public AuditInfo(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AuditInfo.class.getSimpleName() + "[", "]")
            .add("id='" + id + "'")
            .toString();
    }
}
