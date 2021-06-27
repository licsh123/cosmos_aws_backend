package com.shopping.cosmos.service;

import com.shopping.cosmos.mapper.UserMapper_hun;
import com.shopping.cosmos.vo.UserVO_hun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl_hun implements UserService_hun {

    @Autowired
    UserMapper_hun userMapper;

    @Override
    public UserVO_hun UserByID(String user_email) {
        return userMapper.UserByID(user_email);
    }

    @Override
    public List<UserVO_hun> UserAddressList(String user_email) {
        return userMapper.UserAddressList(user_email);
    }

    @Override
    public void UpdateUserInfo(UserVO_hun userVO) {
        userMapper.UpdateUserInfo(userVO);
    }

    @Override
    public void DeleteUserInfo(UserVO_hun userVO) {
        userMapper.DeleteUserInfo(userVO);
    }

    @Override
    public void InsertUserAccount(UserVO_hun userVO) {
        userMapper.InsertUserAccount(userVO);
    }

    @Override
    public UserVO_hun UserAccount(UserVO_hun userVO) {
        return userMapper.UserAccount(userVO);
    }

    @Override
    public void UpdateUserAccount(UserVO_hun userVO) {
        userMapper.UpdateUserAccount(userVO);
    }

    @Override
    public void InsertUserRepay(UserVO_hun userVO) {
        userMapper.InsertUserRepay(userVO);
    }

    @Override
    public void UpdateUserRepay(UserVO_hun userVO) {
        userMapper.UpdateUserRepay(userVO);
    }

    @Override
    public UserVO_hun GetUserAddressBySeq(int address_seq) {
        return userMapper.GetUserAddressBySeq(address_seq);
    }

    @Override
    public void UpdateUserAddress(UserVO_hun userVO) {
        userMapper.UpdateUserAddress(userVO);
    }

    @Override
    public void DeleteUserAddress(int address_seq) {
        userMapper.DeleteUserAddress(address_seq);
    }

    @Override
    public void InsertUserAddress(UserVO_hun userVO) {
        userMapper.InsertUserAddress(userVO);
    }


}
