package com.shopping.cosmos.user.service;

import com.shopping.cosmos.user.mapper.UserMapper_jo;
import com.shopping.cosmos.user.vo.UserSearchVO_jo;
import com.shopping.cosmos.user.vo.UserStateVO_jo;
import com.shopping.cosmos.user.vo.UserVO_jo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl_jo implements UserService_jo {
	
	@Autowired
    UserMapper_jo mapper;

    @Override
	public List<UserVO_jo> getUserList(UserVO_jo vo) {
		return mapper.getUserList(vo);
	}

	@Override
	public List<UserSearchVO_jo> userSearch(UserSearchVO_jo vo) {
		return mapper.userSearch(vo);
	}
	@Override
	public List<UserStateVO_jo> userState(UserStateVO_jo vo) {
		return mapper.userState(vo);
	}
	
	@Override
	public void insertUser(UserVO_jo vo) {
		System.out.println("service insertUser접근");
		mapper.insertUser(vo);
	}

	@Override
	public void insertUserAddress(UserVO_jo vo) {
		mapper.insertUserAddress(vo);
	}


	@Override
	public int userEmailCheck(UserVO_jo vo) {
		System.out.println("service userEmailCheck접근");
		return mapper.userEmailCheck(vo);
	}

	@Override
	public int userCount() {
		return mapper.userCount();
	}

	@Override
	public int userLogCount() {
		return mapper.userLogCount();
	}

	@Override
	public List<UserSearchVO_jo> userStateSearch(UserSearchVO_jo user) {
		return mapper.userStateSearch(user);
	}

}
