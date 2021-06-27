package com.shopping.cosmos.login.service;


import com.shopping.cosmos.login.mapper.UserMapper_DI;
import com.shopping.cosmos.login.vo.UserVO_DI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class LoginServiceImpl_DI implements LoginService_DI {

    @Autowired
    UserMapper_DI userMapper;

    @Override
    public int getUserCntByPass(UserVO_DI user) {
        return userMapper.getUserCntByPass(user);
    }

    @Override
    public UserVO_DI getLogin(UserVO_DI user) {
        return userMapper.getUser(user);
    }

    @Override
    public int getEmailCnt(UserVO_DI user) {
        return userMapper.getEmailCnt(user);
    }

    @Override
    public List<UserVO_DI> getEmail(UserVO_DI user) {
            return userMapper.getEmail(user);
    }

    @Override
    public int getPWCnt(UserVO_DI user) {
        return userMapper.getPWCnt(user);
    }

    @Override
    public UserVO_DI getPassword(UserVO_DI user) {
        return userMapper.getPW(user);
    }

    @Override
    public void sessionCreated(UserVO_DI vo, HttpSession session) {
        try {
            /* 세션 유효시간 정하기 (/s)*/
            session.setMaxInactiveInterval(1800);

            /* 세션에 아이디 저장*/
            String user_email = vo.getUser_email();
            session.setAttribute("user_email",user_email);
            System.out.println("세션 생성 완료:" + user_email);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}





