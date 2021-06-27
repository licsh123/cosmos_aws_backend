package com.shopping.cosmos.cart.service;

import com.shopping.cosmos.cart.domain.CartVO;
import com.shopping.cosmos.cart.domain.OrderDetailVO;
import com.shopping.cosmos.cart.domain.OrderVO;
import com.shopping.cosmos.cart.mapper.CartMapper;
import com.shopping.cosmos.cart.mapper.OrderMapper;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log
@AllArgsConstructor
public class OrderServiceImpl implements OrderSerivce{

    private OrderMapper orderMapper;
    private CartMapper cartMapper;
    @Override
    public void insertOrder(OrderVO vo) {
        List<CartVO> list = cartMapper.listCart(vo.getUserId());
        Long total=0L;
        for(CartVO cartVO : list){
            total+=cartVO.getMoney();

        }
        vo.setTotalPrice(total);
        System.out.println(vo);

        orderMapper.insertOrder(vo);

    }

    @Override
    public void insertOrderDetail(OrderDetailVO orderDetailVO, String userId) {
        List<CartVO> list = cartMapper.listCart(userId);
        for(CartVO cartVO : list){

            orderDetailVO.setProductId(cartVO.getProductId());
            orderDetailVO.setMoney(cartVO.getMoney());
            orderDetailVO.setAmount(cartVO.getAmount());
            System.out.println(orderDetailVO);
            orderMapper.insertOrderDetail(orderDetailVO);

        }
    }
}
