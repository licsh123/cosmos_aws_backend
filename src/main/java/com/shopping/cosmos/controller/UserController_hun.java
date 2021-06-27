package com.shopping.cosmos.controller;

import com.shopping.cosmos.service.UserService_hun;
import com.shopping.cosmos.vo.UserVO_hun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/mycos")
public class UserController_hun {

    @Autowired
    UserService_hun userService;


    @GetMapping("/userinfo/{user_email}")
    public UserVO_hun UserByID(@PathVariable String user_email){
        System.out.println("UserInfo Success!");
        System.out.println("user_email : "+user_email);
        System.out.println(userService.UserByID(user_email));
        return userService.UserByID(user_email);
    }

    @GetMapping("/useraddressinfo/{user_email}")
    public List<UserVO_hun> UserAddressList(@PathVariable String user_email){
        System.out.println("UserAddressInfo Success!");
        return userService.UserAddressList(user_email);
    }

    @PostMapping("/updateuserinfo")
    public void UpdateUserInfo(@RequestBody UserVO_hun userVO){
        System.out.println("회원 정보 수정 user_email : "+userVO.getUser_email());
        System.out.println("회원 정보 수정 change_email : "+userVO.getChange_email());
        System.out.println("회원 정보 수정 change_phone : "+userVO.getChange_phone());
        System.out.println("회원 정보 수정 change_password : "+userVO.getChange_password());
        System.out.println("회원 정보 수정 UpdateUserInfo Success!");
        userService.UpdateUserInfo(userVO);
    }

        @PostMapping("/deleteuserinfo")
        public void DeleteUserInfo(@RequestBody UserVO_hun userVO){
        System.out.println("회원탈퇴 user_email : "+userVO.getUser_email());
        System.out.println("회원탈퇴 DeleteUserInfo Success!");
        userService.DeleteUserInfo(userVO);
    }

    @PostMapping("/insertuseraccount")
    public void InsertUserAccount(@RequestBody UserVO_hun userVO){
        System.out.println("user account insert");
        System.out.println("회원 환불 계좌 등록 : "+userVO.getUser_email());
        System.out.println("회원 환불 계좌 등록 : "+userVO.getUser_name());
        System.out.println("회원 환불 계좌 등록 : "+userVO.getUser_bank());
        System.out.println("회원 환불 계좌 등록 : "+userVO.getUser_account());
        userService.InsertUserAccount(userVO);
    }

    @GetMapping("/useraccount/{user_email}")
    public UserVO_hun UserAccount(@PathVariable String user_email){
        UserVO_hun userVO = new UserVO_hun();
        userVO.setUser_email(user_email);
        System.out.println("user account select");
        System.out.println("회원 환불 계좌 조회 : "+userVO.getUser_email());
        return userService.UserAccount(userVO);
    }

    @PostMapping("/updateuseraccount")
    public void UpdateUserAccount(@RequestBody UserVO_hun userVO){
        System.out.println("user account select");
        System.out.println("EMAIL : "+userVO.getUser_email());
        System.out.println("NAME : "+userVO.getUser_name());
        System.out.println("BANK : "+userVO.getUser_bank());
        System.out.println("ACCOUNT : "+userVO.getUser_account());
        userService.UpdateUserAccount(userVO);
    }

    @PostMapping("/insertuserrepay")
    public void InsertUserRepay(@RequestBody UserVO_hun userVO){
        System.out.println("InsertUserAccountREPAY success!");
        System.out.println("EMAIL : "+userVO.getUser_email());
        System.out.println("PHONE : "+userVO.getUser_repay());
        userService.InsertUserRepay(userVO);
    }

    @PostMapping("/updateuserrepay")
    public void UpdateUserRepay(@RequestBody UserVO_hun userVO){
        System.out.println("UpdateUserRepay Start!");
        System.out.println("EMAIL : "+userVO.getUser_email());
        System.out.println("REPAY : "+userVO.getUser_repay());
        userService.UpdateUserRepay(userVO);
    }

    @PostMapping("/useraddressbyseq/{address_seq}")
    public UserVO_hun GetUserAddressBySeq(@PathVariable int address_seq){
        System.out.println("GetUserAddressBySeq Success!");
        System.out.println("Address_Seq : "+address_seq);
        return userService.GetUserAddressBySeq(address_seq);
    }

    @PostMapping("/updateuseraddress")
    public void UpdateUserAddress(@RequestBody UserVO_hun userVO){
        System.out.println("UpdateUserAddress Start!");
        System.out.println("Address_seq : "+userVO.getAddress_seq());
        System.out.println("EMAIL : "+userVO.getUser_email());
        System.out.println("PHONE : "+userVO.getUser_phone());
        System.out.println("ADDRESS_NAME : "+userVO.getAddress_name());
        System.out.println("PHONE2 : "+userVO.getAddress_phone2());
        System.out.println("POST_CODE : "+userVO.getPost_code());
        System.out.println("ADDRESS : "+userVO.getAddress());
        System.out.println("DETAIL_ADDRESS : "+userVO.getDetail_address());
        userService.UpdateUserAddress(userVO);
    }

    @GetMapping("/deleteuseraddress/{address_seq}")
    public void DeleteUserAddress(@PathVariable int address_seq){
        System.out.println("DeleteUserAddress Start");
        userService.DeleteUserAddress(address_seq);
    }

    @PostMapping("/insertuseraddress")
    public void InsertUserAddress(@RequestBody UserVO_hun userVO){
        System.out.println("InsertUserAdderss Start");
        System.out.println("Address_seq : "+userVO.getAddress_seq());
        System.out.println("EMAIL : "+userVO.getUser_email());
        System.out.println("PHONE : "+userVO.getUser_phone());
        System.out.println("ADDRESS_NAME : "+userVO.getAddress_name());
        System.out.println("PHONE2 : "+userVO.getAddress_phone2());
        System.out.println("POSTCODE : "+userVO.getPost_code());
        System.out.println("ADDRESS : "+userVO.getAddress());
        System.out.println("DETAILADDRESS : "+userVO.getDetail_address());
        userService.InsertUserAddress(userVO);
    }
}