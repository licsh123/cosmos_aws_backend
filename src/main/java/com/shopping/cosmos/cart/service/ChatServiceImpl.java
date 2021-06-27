package com.shopping.cosmos.cart.service;

import com.shopping.cosmos.cart.domain.ChatVO;
import com.shopping.cosmos.cart.mapper.ChatMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChatServiceImpl implements ChatService{
    private ChatMapper chatMapper;
    @Override
    public List<ChatVO> listChat(String fromEmail, String toEmail, int chatId) {
        return chatMapper.listChat(fromEmail,toEmail,chatId);
    }

    @Override
    public List<ChatVO> listChatRecent(String fromEmail, String toEmail, int chatId) {
        return chatMapper.listChatRecent(fromEmail,toEmail,chatId);
    }

    @Override
    public int submitChat(String fromEmail, String toEmail, String chatContent) {
        return chatMapper.submitChat(fromEmail,toEmail,chatContent);
    }
}
