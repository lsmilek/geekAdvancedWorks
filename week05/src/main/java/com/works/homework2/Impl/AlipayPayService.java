package com.works.homework2.Impl;

import com.works.homework2.PayService;
import org.springframework.stereotype.Service;

/**
 * @ClassName AlipayPayService
 * @Description TODO
 * @Author yqr
 * @Date 2021/6/3 16:51
 */
@Service
public class AlipayPayService implements PayService {
    public void pay() {
        System.out.println("This is alipayPay.");
    }
}
