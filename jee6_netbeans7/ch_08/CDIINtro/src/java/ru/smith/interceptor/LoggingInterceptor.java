package ru.smith.interceptor;

import ru.smith.interceptorbinding.LoggingInterceptorBinding;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@LoggingInterceptorBinding
@Interceptor
public class LoggingInterceptor {

    private static final Logger logger = Logger.getLogger(
            LoggingInterceptor.class.getName());

    @AroundInvoke
    public Object logMethodCall(InvocationContext invocationContext)
            throws Exception {

        logger.log(Level.INFO, new StringBuilder("entering ").append(
                invocationContext.getMethod().getName()).append(
                " method").toString());

        Object retVal = invocationContext.proceed();

        logger.log(Level.INFO, new StringBuilder("leaving ").append(
                invocationContext.getMethod().getName()).append(
                " method").toString());

        return retVal;
    }
}
