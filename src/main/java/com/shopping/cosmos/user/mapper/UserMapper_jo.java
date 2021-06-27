package com.shopping.cosmos.user.mapper;

import com.shopping.cosmos.user.vo.UserSearchVO_jo;
import com.shopping.cosmos.user.vo.UserStateVO_jo;
import com.shopping.cosmos.user.vo.UserVO_jo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper //xml에서 선언된 namespace가 여기라는 것을 알림
public interface UserMapper_jo {

    //회원가입
    void insertUser(UserVO_jo vo);

    void insertUserAddress(UserVO_jo vo);
    //회원가입 이메일체크
    int userEmailCheck(UserVO_jo vo);

    //유저리스트
    List<UserVO_jo> getUserList(UserVO_jo vo);

    //검색 유저리스트
    List<UserSearchVO_jo> userSearch(UserSearchVO_jo vo);

    //유저 상태
    List<UserStateVO_jo> userState(UserStateVO_jo vo);

    //유저 수
    int userCount();

    //유저로그수
    public int userLogCount();

    //유저상태검색
    public List<UserSearchVO_jo> userStateSearch(UserSearchVO_jo user);
}
