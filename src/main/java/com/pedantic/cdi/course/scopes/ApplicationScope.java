package com.pedantic.cdi.course.scopes;

import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;

@ApplicationScoped
public class ApplicationScope implements Serializable {

    private static final long serialVersionUID = 27080464521478L;

    public String getHashCode() {
        return this.hashCode() + " ";
    }
}
