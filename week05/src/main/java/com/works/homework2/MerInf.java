package com.works.homework2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @ClassName MerInf
 * @Description TODO
 * @Author yqr
 * @Date 2021/6/3 17:27
 */
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MerInf {
    private String merName;
    private String merId;
}
