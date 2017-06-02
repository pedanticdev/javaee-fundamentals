package com.pedantic.cdi.course.beans;

import com.pedantic.cdi.course.interfaces.Salute;
import com.pedantic.cdi.course.qualifiers.Police;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class QualifierBean {

    @Inject
    @Police
    private Salute policeSalute;

    @Inject
    @Police
    private Salute soldierSalute;

    private String police;
    private String soldier;


    public void policeSalutation(String name) {
        police = policeSalute.salute(name);
    }

    public void solidierSalutation(String name) {
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
}
