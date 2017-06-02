package com.pedantic.cdi.course.sessionbeans;

import com.pedantic.cdi.course.interfaces.Salute;

import javax.ejb.Stateless;

@Stateless
public class Soldier implements Salute {
    @Override
    public String salute(String name) {
        return null;
    }
}
