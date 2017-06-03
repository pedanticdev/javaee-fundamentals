package com.pedantic.cdi.course.sessionbeans;

import com.pedantic.cdi.course.interfaces.Salute;
import com.pedantic.cdi.course.annotations.ServiceMan;

import javax.ejb.Stateless;
import java.text.MessageFormat;

@Stateless
@ServiceMan(value = ServiceMan.ServiceType.SOLDIER)
@com.pedantic.cdi.course.annotations.Soldier
public class Soldier implements Salute {

    @Override
    public String salute(String name) {
        return MessageFormat.format("Aye Aye Capt {0}", name);
    }

}
