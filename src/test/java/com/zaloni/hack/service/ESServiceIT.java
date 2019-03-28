package com.zaloni.hack.service;

import com.zaloni.hack.domain.AuditInfo;
import io.jsonwebtoken.lang.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
public class ESServiceIT {

    @Autowired
    ESService esService;

    @Test
    public void testIndexDox() throws Exception{
        AuditInfo auditInfo= new AuditInfo(UUID.randomUUID().toString());
        AuditInfo savedDox= esService.save(auditInfo);
        Assert.notNull(savedDox);
    }
}
