package com.pedantic.cdi.course.scopes;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class RequestScope {


    public String getHashCode() {

        return this.hashCode() + " ";
    }

    @PostConstruct
    private void init() {
        System.out.println("******************************************************");
        System.out.println("Post Construct Method of RequestScope Bean called :-) ");
        System.out.println("******************************************************");
    }
}
