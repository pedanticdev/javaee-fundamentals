package com.pedantic.cdi.course.sessionbeans;

import com.pedantic.cdi.course.interfaces.Salute;
import com.pedantic.cdi.course.qualifiers.ServiceMan;

import javax.ejb.Stateless;

@Stateless
@ServiceMan(value = ServiceMan.ServiceType.SOLDIER)
@com.pedantic.cdi.course.qualifiers.Soldier
public class Soldier implements Salute {

    @Override
    public String salute(String name) {
        return "Aye Aye Capt'n " + name;
    }

}
