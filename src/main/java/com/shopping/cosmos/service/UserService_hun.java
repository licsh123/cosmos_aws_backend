package com.shopping.cosmos.service;

import com.shopping.cosmos.vo.UserVO_hun;

import java.util.List;

public interface UserService_hun {

    // 해당 유저 아이디에 맞는 유저 정보 들고오기
    public UserVO_hun UserByID(String user_email);
    
    // 해당 유저의 주소 모두 들고오기
    public List<UserVO_hun> UserAddressList(String user_email);

    // 해당 유저의 정보 수정
    public void UpdateUserInfo(UserVO_hun userVO);

    // 해당 유저 회원 탈퇴
    public void DeleteUserInfo(UserVO_hun userVO);

    // 해당 유저 환불 정보 등록
    public void InsertUserAccount(UserVO_hun userVO);

    // 해당 유저 환불 계좌 조회
    public UserVO_hun UserAccount(UserVO_hun userVO);

    // 해당 유저 환불 계좌 정보 수정
    public void UpdateUserAccount(UserVO_hun userVO);

    // 해당 유저의 소득공제용 번호 입력
    public void InsertUserRepay(UserVO_hun userVO);

    // 해당 유저의 소득공제용 번호 수정
    public void UpdateUserRepay(UserVO_hun userVO);

    // 해당 유저에 맞는 등록된 주소값 불러오기
    public UserVO_hun GetUserAddressBySeq(int address_seq);

    // 해당 유저의 주소값 수정
    public void UpdateUserAddress(UserVO_hun userVO);

    public void DeleteUserAddress(int address_seq);

    public void InsertUserAddress(UserVO_hun userVO);
}
