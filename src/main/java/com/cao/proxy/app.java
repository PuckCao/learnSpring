package com.cao.proxy;

/**
 * @author Puck Cao
 * @date 2023/1/5 2:30 PM
 */
public class app implements Shop{
    @Override
    public void mai() {
        System.out.println("买");
    }

    @Override
    public void tui() {
        System.out.println("退");
    }
}
