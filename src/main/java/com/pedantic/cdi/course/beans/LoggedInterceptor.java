package com.pedantic.cdi.course.beans;

import com.pedantic.cdi.course.qualifiers.Logged;

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
        logger.log(Level.INFO, "User " + user + " invoked " + context.getMethod().getName() + " method at " + LocalDate.now());
        return context.proceed();
    }
}
