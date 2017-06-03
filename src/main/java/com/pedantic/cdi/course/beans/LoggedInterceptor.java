package com.pedantic.cdi.course.beans;

import com.pedantic.cdi.course.annotations.Logged;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

//Bind interceptor to this class
@Logged
@Interceptor
@Priority(Interceptor.Priority.APPLICATION)
public class LoggedInterceptor {

    @Inject
    private Logger logger;

    //Could populate this from DB or security manager
    // with name of currently executing user
    private String user = "Luqman";

    //This method will be called and passed invocation context by container
    @AroundInvoke
    public Object logMethodCall(InvocationContext context) throws Exception {
        //Log for example user who called method and time
        logger.log(Level.INFO, "User {0} invoked {1} method at {2}", new Object[]{user, context.getMethod().getName(), LocalDate.now()});
        return context.proceed();
    }

//    @PostConstruct
//    private void init(InvocationContext context) {
//
//    }
//
//    @PreDestroy
//    private void kill(InvocationContext context) {
//
//    }
}
