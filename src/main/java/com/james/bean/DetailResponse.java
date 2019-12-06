package com.james.bean;

import com.james.pojo.Users;
import com.james.pojo.Vehicle;

import lombok.Data;

import java.util.List;

@Data
public class DetailResponse {
    private Users users;
    private Vehicle vehicle;
    private List pics;
}
