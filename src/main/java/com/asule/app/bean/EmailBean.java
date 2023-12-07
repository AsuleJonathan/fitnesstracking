package com.asule.app.bean;

import com.asule.app.model.AuditLog;

import javax.enterprise.event.Observes;
import javax.inject.Singleton;
import java.io.Serializable;

@Singleton
public class EmailBean implements Serializable {

    public void email(@Observes AuditLog log){
        System.out.println("Emailing: " + log.getLogDetails());
    }
}
