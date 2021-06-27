package com.shopping.cosmos.user.controller;

import com.shopping.cosmos.user.service.UserService_jo;
import com.shopping.cosmos.user.vo.UserVO_jo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/cos")
public class UserInsertController_jo {

    @Autowired
    UserService_jo userservice;

    //프론트에서 post방식으로 '/signUp'으로 들왔을시
    @PostMapping("/signUp")
    void insertUser(@RequestBody UserVO_jo user) {
        System.out.println("insertUser접근");
        System.out.println(user);
        userservice.insertUser(user);
        userservice.insertUserAddress(user);
        System.out.println("insert성공");
    }

    //프론트에서 get방식으로 '/signUp/user_email'으로 들왔을시
    @GetMapping("/signUp/{user_email}")
    int userEmailCheck(UserVO_jo user) {
        System.out.println(user);
        System.out.println("userEmailCheck접근");
        //이메일이 있다면 0보다 큰걸 가져옴
        return userservice.userEmailCheck(user);
    }

}
