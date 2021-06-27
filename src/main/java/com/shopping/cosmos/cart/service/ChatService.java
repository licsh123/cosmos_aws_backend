package com.shopping.cosmos.cart.service;


import com.shopping.cosmos.cart.domain.ChatVO;

import java.util.List;

public interface ChatService {
    //채팅 리스트 가져오기
    public List<ChatVO> listChat(String fromEmail, String toEmail, int chatId);
    //최근 채팅 리스트 가져오기
    public List<ChatVO> listChatRecent(String fromEmail,String toEmail,int chatId);
    // 채팅 전송
    public int submitChat(String fromEmail, String toEmail, String chatContent);
}
