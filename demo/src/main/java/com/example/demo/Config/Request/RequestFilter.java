package com.example.demo.Config.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequestFilter {
    private String gender[];
    private String category[];
    private String size[];
    private int countProduct ;

}
