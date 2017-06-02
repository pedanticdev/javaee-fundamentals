package com.pedantic.cdi.course.beans;

import com.pedantic.cdi.course.interfaces.Salute;
import com.pedantic.cdi.course.annotations.Police;
import com.pedantic.cdi.course.annotations.Soldier;
import com.pedantic.cdi.course.annotations.Web;

import javax.inject.Inject;
import java.io.Serializable;

@Web
public class QualifierBean implements Serializable {

    @Inject
    @Police
    private Salute policeSalute;

    @Inject
    @Soldier
    private Salute soldierSalute;

    private String police;
    private String soldier;
    private String name;

    public void policeSalutation() {
        police = policeSalute.salute(name);
    }

    public void solidierSalutation() {
        soldier = soldierSalute.salute(name);
    }

    public String getPolice() {
        return police;
    }

    public void setPolice(String police) {
        this.police = police;
    }

    public String getSoldier() {
        return soldier;
    }

    public void setSoldier(String soldier) {
        this.soldier = soldier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
