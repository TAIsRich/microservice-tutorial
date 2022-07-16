package com.chuwa.basedomains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author b1go
 * @date 7/15/22 4:44 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private String orderId;
    private String name;
    private int qty;
    private double price;
}
