package com.shopping.cosmos.login.service;

import com.shopping.cosmos.login.vo.UserVO_DI;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

public interface LoginService_DI {
     public int getUserCntByPass(UserVO_DI user);
     public UserVO_DI getLogin(UserVO_DI user);
     public int getEmailCnt(UserVO_DI user);
     public List<UserVO_DI> getEmail(UserVO_DI user);
     public int getPWCnt(UserVO_DI user);
     public UserVO_DI getPassword(UserVO_DI user);
     public void sessionCreated(UserVO_DI vo, HttpSession session);

}
