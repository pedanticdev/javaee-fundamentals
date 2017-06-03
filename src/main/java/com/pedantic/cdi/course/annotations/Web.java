package com.pedantic.cdi.course.annotations;

import javax.enterprise.inject.Stereotype;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Stereotype
@RequestScoped
@Named
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Web {
}
