package com.shopping.cosmos.cart.mapper;

import com.shopping.cosmos.cart.domain.ChatVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChatMapper {

    List<ChatVO> listChat(String fromEmail, String toEmail, int chatId);

    List<ChatVO> listChatRecent(String fromEmail,String toEmail,int chatId);

    int submitChat(String fromEmail, String toEmail, String chatContent);
}
