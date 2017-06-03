package com.pedantic.cdi.course.beans;

import com.pedantic.cdi.course.annotations.Admin;
import com.pedantic.cdi.course.annotations.PopularStand;
import com.pedantic.cdi.course.annotations.Web;
import com.pedantic.cdi.course.events.EventData;
import com.pedantic.cdi.course.events.User;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import java.time.LocalDateTime;

@Web
public class EventBean {
    @Inject
    private EventData eventData;
    @Inject
    private User user;

    @Inject
    @PopularStand
    private Event<EventData> eventDataEvent;

    @Inject
    @Admin
    private Event<EventData> conditionalEvent;

    public void login() {
        //Do credentials checking to login in user then fire login event

        //someSecurityManager.loginUser(user.getEmail, user.getPassword)

        eventDataEvent.fire(new EventData(user.getEmail(), LocalDateTime.now()));
        //Qualified Observer
        conditionalEvent.fire(new EventData(user.getEmail(), LocalDateTime.now()));
       

    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
