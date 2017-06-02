package com.pedantic.cdi.course.scopes;

import java.io.Serializable;

public class DependentScope implements Serializable {

    public String getHashCode() {
        return this.hashCode() + " ";
    }
}
