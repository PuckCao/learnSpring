package com.cao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Puck Cao
 * @date 2023/1/5 2:32 PM
 */
public class app_proxy implements InvocationHandler {

    private Object target;

    public app_proxy(Object o) {
        this.target = o;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long l = System.currentTimeMillis();
        method.invoke(target,args);
        System.out.println(System.currentTimeMillis() -l);
        return null;
    }
}
