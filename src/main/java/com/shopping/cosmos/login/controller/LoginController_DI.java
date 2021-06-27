package com.shopping.cosmos.login.controller;

import com.shopping.cosmos.login.service.LoginService_DI;
import com.shopping.cosmos.login.vo.UserVO_DI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/cosmos")
public class LoginController_DI {

    @Autowired
    private LoginService_DI loginService;

    /*로그인 후 UserVO 객체 리턴*/
    @PostMapping("/signIn")
    public UserVO_DI signIn(@RequestBody UserVO_DI user, HttpSession session, HttpServletResponse response){
        try{
            System.out.println("로그인 시도");
            if(loginService.getUserCntByPass(user) >0){
               /* UserVO 객체 받음*/
                UserVO_DI vo = loginService.getLogin(user);
                if(vo != null){
                   /* 세션, 쿠키 생성*/
                   loginService.sessionCreated(vo, session);
                    System.out.println("로그인 성공:"+ vo);
                    return vo;
                }else return null;
            }else return null;

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

   /* 사용자 이메일(아이디) 찾기*/
    @PostMapping("/findEmail")
    public List<UserVO_DI> findEmail(@RequestBody UserVO_DI user){

        try{
            System.out.println("이메일 찾기 시도");
            if(loginService.getEmailCnt(user)>0){
                if(loginService.getEmail(user) != null){
                    System.out.println("이메일 찾기 성공:"+loginService.getEmail(user));
                    return loginService.getEmail(user);
                }else return null;
            }else return null;

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /* 사용자 비밀번호 찾기*/
    @PostMapping("/findPW")
    public UserVO_DI findPassword(@RequestBody UserVO_DI user){
        UserVO_DI vo;
        try{
            System.out.println("비밀번호 찾기 시도");
            if(loginService.getPWCnt(user)>0){
                vo = loginService.getPassword(user);
                if(vo != null){
                    System.out.println("비밀번호 찾기 성공");
                    return vo;
                }else return null;
            }else return null;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    /*로그아웃*/
    @GetMapping("/signOut/{user_email}")
    public void signOut(@PathVariable String user_email, HttpServletRequest request){
        try {
            //기존의 세션값 불러옴
            HttpSession session = request.getSession(false);
            //세션 삭제
            session.invalidate();

            System.out.println("로그아웃 성공");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /*기존 session 확인*/
    @GetMapping("/checkSession")
    public String checkSession( HttpServletRequest request) {
        try {
            //기존 세션값만 받아옴
            HttpSession session = request.getSession(false);
            String user_email = (String) session.getAttribute("user_email");

            if(user_email != null){
                return "true";
            } else {
                System.out.println("세션 없음");
                return "false";
            }
        }catch (Exception e){

            System.out.println("checkSession 오류: 기존 세션없음");
            return "false";
        }
    }

}
