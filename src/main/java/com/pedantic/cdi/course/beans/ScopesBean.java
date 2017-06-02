package com.pedantic.cdi.course.beans;

import com.pedantic.cdi.course.qualifiers.Web;
import com.pedantic.cdi.course.scopes.ApplicationScope;
import com.pedantic.cdi.course.scopes.DependentScope;
import com.pedantic.cdi.course.scopes.RequestScope;
import com.pedantic.cdi.course.scopes.SessionScope;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

@Web
public class ScopesBean implements Serializable{

    //Field injection point
    @Inject
    private RequestScope requestScope;
    @Inject
    private ApplicationScope applicationScope;
    @Inject
    private Logger logger;

    private SessionScope sessionScope;

    private DependentScope dependentScope;

    //Lifecyle callback
    @PostConstruct
    private void init() {
        logger.log(Level.INFO, "*******************************************");
        logger.log(Level.INFO, "Scopes bean called");
        logger.log(Level.INFO, "********************************************");

    }

    //Constructor injection point
    @Inject
    private ScopesBean(DependentScope dependentScope) {
        this.dependentScope = dependentScope;
    }

    //Method injection point
    @Inject
    private void setSessionScope(SessionScope sessionScope) {
        this.sessionScope = sessionScope;
    }

    public String requestScopeHashCode() {
        return requestScope.getHashCode();
    }

    public String applicatioinScopeHashCode() {
        return applicationScope.getHashCode();
    }

    public String sessionScopeHashCode() {
        return sessionScope.getHashCode();
    }

    public String dependentScopeHashCode() {
        return dependentScope.getHashCode();
    }

}
