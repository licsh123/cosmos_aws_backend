package com.shopping.cosmos.login.mapper;

import com.shopping.cosmos.login.vo.UserVO_DI;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper_DI {

    //로그인 시 회원 유무 체크
    public int getUserCntByPass(UserVO_DI user);
    //회원 정보 받기
    public UserVO_DI getUser(UserVO_DI user);
    //아이디 찾기 체크
    public int getEmailCnt(UserVO_DI user);
    //아이디 찾기 조건
    public List<UserVO_DI> getEmail(UserVO_DI user);
    //비밀번호 찾기 체크
    public int getPWCnt(UserVO_DI user);
    //비밀번호 찾기 조건
    public UserVO_DI getPW(UserVO_DI user);
}
