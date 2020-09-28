package com.liuyahui.controller;

import com.liuyahui.service.AbstractHandel;
import com.liuyahui.service.impl.BuMenAbstractHandelImpl;
import com.liuyahui.service.impl.ZongJingliAbstractHandelImpl;

public class ChainOfResponsiblity {


    public static void main(String[] args) {

        AbstractHandel buMenAbstractHandel = new BuMenAbstractHandelImpl();
        AbstractHandel zongJingliAbstractHandel = new ZongJingliAbstractHandelImpl();

        zongJingliAbstractHandel.setHandler(buMenAbstractHandel);

        StringBuffer sb = new StringBuffer();

        System.out.println(buMenAbstractHandel.Request(1001, sb));
    }
}

