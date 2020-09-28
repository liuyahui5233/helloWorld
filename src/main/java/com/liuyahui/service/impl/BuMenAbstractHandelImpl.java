package com.liuyahui.service.impl;

import com.liuyahui.service.AbstractHandel;

import java.util.logging.Handler;

public class BuMenAbstractHandelImpl extends AbstractHandel {


    public String Request(double price, StringBuffer sb) {

        if (price <= 1000){
            sb.append("部门经理同意，批准" + price + "元经费，感谢!");
        }else {
            sb.append("超出部门经理权利范围");
            if (handler != null){
                return getHandler().Request(price, sb);
            }
        }
        return sb.toString();
    }
}
