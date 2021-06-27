package com.shopping.cosmos.user.service;

import com.shopping.cosmos.user.vo.UserSearchVO_jo;
import com.shopping.cosmos.user.vo.UserStateVO_jo;
import com.shopping.cosmos.user.vo.UserVO_jo;

import java.util.List;

public interface UserService_jo {

	List<UserVO_jo> getUserList(UserVO_jo vo);

	List<UserSearchVO_jo> userSearch(UserSearchVO_jo vo);

	List<UserStateVO_jo> userState(UserStateVO_jo vo);

	// 유저 insert
	void insertUser(UserVO_jo vo);
	void insertUserAddress(UserVO_jo vo);
	// 이메일 체크
	int userEmailCheck(UserVO_jo vo);

	int userCount();

	public int userLogCount();

	List<UserSearchVO_jo> userStateSearch(UserSearchVO_jo user);

}
