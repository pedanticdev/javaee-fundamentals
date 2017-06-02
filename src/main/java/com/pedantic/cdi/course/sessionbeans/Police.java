package com.pedantic.cdi.course.sessionbeans;

import com.pedantic.cdi.course.interfaces.Salute;

import javax.ejb.Stateful;
import java.io.Serializable;

@Stateful
public class Police implements Salute, Serializable {
    @Override
    public String salute(String name) {
        return null;
    }
}
