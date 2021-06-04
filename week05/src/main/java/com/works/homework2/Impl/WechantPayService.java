package com.works.homework2.Impl;

import com.works.homework2.PayService;
import org.springframework.stereotype.Service;

/**
 * @ClassName WechantPayService
 * @Description TODO
 * @Author yqr
 * @Date 2021/6/3 16:54
 */
@Service
public class WechantPayService implements PayService {
    public void pay() {
        System.out.println("This is wechantPay.");
    }
}
