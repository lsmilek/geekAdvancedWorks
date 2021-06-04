package com.works.homework2;

import com.works.homework2.Impl.AlipayPayService;
import com.works.homework2.Impl.WechantPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ClassName PayController
 * @Description TODO
 * @Author yqr
 * @Date 2021/6/3 18:41
 */
@Controller
public class PayController {
    @Autowired
    private AlipayPayService alipayPayService;
    @Autowired
    private WechantPayService wechantPayService;

    public void pay(String payType){
        if("1".equals(payType)){
            alipayPayService.pay();
        }else if("2".equals(payType)){
            wechantPayService.pay();
        }else{
            System.out.println("payType ERROR!!!");
        }
    }

}
