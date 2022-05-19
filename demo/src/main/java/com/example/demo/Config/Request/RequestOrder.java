package com.example.demo.Config.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequestOrder {
    private String productName ;
    private String address ;
    private int countProduct ;
}
