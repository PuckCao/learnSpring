package com.cao.proxy;

import java.lang.reflect.Proxy;

/**
 * @author Puck Cao
 * @date 2023/1/5 2:31 PM
 */
public class main {
    public static void main(String[] args) {
        Shop target = new app();
        Shop proxyInstance = (Shop)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new app_proxy(target));
        proxyInstance.mai();
        proxyInstance.tui();

    }
}
