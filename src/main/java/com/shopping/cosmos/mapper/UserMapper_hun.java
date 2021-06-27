package com.shopping.cosmos.mapper;

import com.shopping.cosmos.vo.UserVO_hun;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper_hun {

    // 해당 회원의 정보 출력
    UserVO_hun UserByID(String user_email);

    // 해당 회원의 주소 리스트 출력
    List<UserVO_hun> UserAddressList(String user_email);

    // 해당 회원 정보 수정
    void UpdateUserInfo(UserVO_hun userVO);

    // 해당 회원 탈퇴
    void DeleteUserInfo(UserVO_hun userVO);

    // 해당 유저 환불 정보 등록
    void InsertUserAccount(UserVO_hun userVO);

    // 해당 유저 환불 계좌 조회
    UserVO_hun UserAccount(UserVO_hun userVO);
    
    // 해당 유저의 계좌 정보 수정
    void UpdateUserAccount(UserVO_hun userVO);

    // 해당 유저의 소득공제용 정보 입력
    void InsertUserRepay(UserVO_hun userVO);

    // 해당 유저의 소득공제용 정보 수정
    void UpdateUserRepay(UserVO_hun userVO);

    // 해당 유저에 맞는 등록된 주소값 불러오기
    UserVO_hun GetUserAddressBySeq(int address_seq);

    void UpdateUserAddress(UserVO_hun userVO);

    void DeleteUserAddress(int address_seq);

    void InsertUserAddress(UserVO_hun userVO);
}