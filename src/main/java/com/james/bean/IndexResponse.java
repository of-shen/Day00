package com.james.bean;

import lombok.Data;

import java.util.List;

@Data
public class IndexResponse {

    private Long total;
    private List cars;
}
