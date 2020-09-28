package com.liuyahui.service.impl;

import com.liuyahui.service.AbstractHandel;

public class ZongJingliAbstractHandelImpl extends AbstractHandel {


    public String Request(double price, StringBuffer sb) {

        if (price <= 5000){
            sb.append("总经理同意，批准" + price + "元经费，感谢!");
        }else {

            if (handler != null){
                sb.append("超出总经理权利范围");
                return Request(price,sb);
            }
        }

        return sb.toString();
    }
}
