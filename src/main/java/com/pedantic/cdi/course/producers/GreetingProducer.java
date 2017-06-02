package com.pedantic.cdi.course.producers;

import javax.enterprise.inject.Produces;
import java.util.ArrayList;
import java.util.List;

public class GreetingProducer {

    /**
     * Producer methods are very useful for when the concrete type to
     * to be injected varies at runtime. This provides polymorphic injection
     * at runtime. Think of CDI producers as the Factory Pattern.
     *
     * Producers are also a way to transform beans we don't own into contextual instances
     *
     * Default scope of produced object is Dependent Scope. Could be altered by
     * annotating the method accordingly.
     **/
    @Produces
    public List<String> getLuckyDish() {

        List<String> dishes = new ArrayList<>();

        dishes.add("Ampesi");
        dishes.add("Tuo Zaafi");
        dishes.add("Banku");
        dishes.add("Fufu");
        dishes.add("Red Red");
        dishes.add("Gari Foto");
        dishes.add("Ebunu Ebunu");
        dishes.add("Fante Fante");
        dishes.add("Mpotompoto");
        return dishes;

    }
}
