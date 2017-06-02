package com.pedantic.cdi.course.scopes;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class SessionScope implements Serializable {
    private static final long serialVersionUID = 440804699990999L;

    public String getHashCode() {
        return this.hashCode() + " ";
    }
}
