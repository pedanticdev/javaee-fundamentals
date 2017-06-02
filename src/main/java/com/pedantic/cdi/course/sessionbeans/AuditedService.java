package com.pedantic.cdi.course.sessionbeans;

import com.pedantic.cdi.course.qualifiers.Logged;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.logging.Level;
import java.util.logging.Logger;

@Stateless
public class AuditedService {

    @Inject
    private Logger logger;

    @PostConstruct
    private void init() {
        auditedMethod();
    }

    @Logged
    public void auditedMethod() {
        logger.log(Level.INFO, "OK so we are able to call this method after auditing took place");
    }
}
