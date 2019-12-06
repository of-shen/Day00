package com.james;

import com.james.controller.IUsersController;
import com.james.controller.VehicleController;
import com.james.pojo.Users;
import com.james.pojo.Vehicle;
import com.james.service.IUsersService;
import com.james.service.VehicleService;
import org.apache.catalina.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.security.auth.Subject;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(name = "Users")
public class testuser {
    @Resource
    private IUsersController usersController;
    @Resource
    private VehicleController vehicleController;

    @Resource
    private VehicleService vehicleService;

    @Test
    public void ressd(){
        Users users=new Users();
        users.setUname("add");
        users.setUpass("add");
        System.out.println(users);
        System.out.println(usersController.login(users));
    }
    @Test
    //注册
    public void test(){
        Users u =new Users();

        u.setUname("addk");
        u.setUpass("addk");
        System.out.println(usersController.register(u));
    }

    @Test
public void Stre(){

        String  vamr="宝马7系";
        System.out.println(vehicleController.getAllVehicleVname(vamr));
}
}
