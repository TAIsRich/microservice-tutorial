package com.chuwa.basedomains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author b1go
 * @date 7/15/22 4:46 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {

    private String message;
    private String status;
    private Order order;
}
