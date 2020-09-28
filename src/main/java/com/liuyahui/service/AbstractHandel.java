package com.liuyahui.service;

import java.util.logging.Handler;

public abstract class AbstractHandel {

    // 传递对象标志
    protected AbstractHandel handler = null;

    public abstract String Request(double price, StringBuffer sb);

    public AbstractHandel getHandler() {
        return handler;
    }

    public void setHandler(AbstractHandel handler) {
        this.handler = handler;
    }
}
