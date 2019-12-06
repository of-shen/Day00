package com.james.response;

import com.james.pojo.Users;
import lombok.Data;

@Data
public class UserCode {

    private Users users;
    private String code;
}
