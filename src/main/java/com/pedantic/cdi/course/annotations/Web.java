package com.pedantic.cdi.course.annotations;

import javax.enterprise.inject.Stereotype;
import javax.faces.view.ViewScoped;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ViewScoped
@Stereotype
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Web {
}
