package com.pedantic.cdi.course.sessionbeans;

import com.pedantic.cdi.course.interfaces.Salute;
import com.pedantic.cdi.course.annotations.ServiceMan;

import javax.ejb.Stateful;
import java.io.Serializable;
import java.text.MessageFormat;

@Stateful
@ServiceMan(value = ServiceMan.ServiceType.POLICE)
@com.pedantic.cdi.course.annotations.Police
public class Police implements Salute, Serializable {
    @Override
    public String salute(String name) {
        return MessageFormat.format("Yes sir! ", name);
    }
}
