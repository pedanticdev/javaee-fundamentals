package com.pedantic.cdi.course.events;

import com.pedantic.cdi.course.annotations.Admin;
import com.pedantic.cdi.course.annotations.PopularStand;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.enterprise.event.TransactionPhase;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

@RequestScoped
public class EventObserver implements Serializable{

    @Inject
    private Logger logger;

    void userLoggedIn(@Observes @PopularStand EventData eventData) {
        //Persist in databse, send to another application outside your app
        //Essentially you can do whatever you want with the event data here.
        //We will just log it
        logger.log(Level.INFO, "User {0} logged in at {1}",
                new Object[]{eventData.getEmail(), eventData.getLoginTime()});
    }

    void conditionalObserver(@Observes(notifyObserver = Reception.IF_EXISTS,
            during = TransactionPhase.AFTER_COMPLETION) @Admin EventData eventData) {
        logger.log(Level.INFO, "The CEO {0} logged in at {1}",
                new Object[]{eventData.getEmail(), eventData.getLoginTime()});
    }
}
