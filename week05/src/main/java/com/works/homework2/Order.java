package com.works.homework2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName Order
 * @Description TODO
 * @Author yqr
 * @Date 2021/6/3 16:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private String orderId;

    private String payType;

}
