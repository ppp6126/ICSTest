package com.example.demo.Config.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequestFilterOrder {
    private Date datestart;
    private Date dateend;
    private String status;
}
