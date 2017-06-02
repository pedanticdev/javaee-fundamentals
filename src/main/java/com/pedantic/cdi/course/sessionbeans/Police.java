package com.pedantic.cdi.course.sessionbeans;

import com.pedantic.cdi.course.interfaces.Salute;
import com.pedantic.cdi.course.qualifiers.ServiceMan;

import javax.ejb.Stateful;
import java.io.Serializable;

@Stateful
@ServiceMan(value = ServiceMan.ServiceType.POLICE)
@com.pedantic.cdi.course.qualifiers.Police
public class Police implements Salute, Serializable {
    @Override
    public String salute(String name) {
        return "Yes sir! " + name;
    }
}
