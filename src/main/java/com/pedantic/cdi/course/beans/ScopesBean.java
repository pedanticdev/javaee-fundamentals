package com.pedantic.cdi.course.beans;

import com.pedantic.cdi.course.scopes.ApplicationScope;
import com.pedantic.cdi.course.scopes.DependentScope;
import com.pedantic.cdi.course.scopes.RequestScope;
import com.pedantic.cdi.course.scopes.SessionScope;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class ScopesBean {

    //Field injection point
    @Inject
    private RequestScope requestScope;
    @Inject
    private ApplicationScope applicationScope;

    private SessionScope sessionScope;

    private DependentScope dependentScope;

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
