package com.shopping.cosmos.cart.service;

import com.shopping.cosmos.cart.domain.CartVO;
import com.shopping.cosmos.cart.mapper.CartMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CartServiceImpl implements CartService {
     private CartMapper cartMapper;

    @Override
    public void insert(CartVO vo) {

        cartMapper.insertCart(vo);
    }

    @Override
    public List<CartVO> listCart(String userId) {

        return cartMapper.listCart(userId);
    }

    @Override
    public void deleteCart(int cartId) {
        cartMapper.deleteCart(cartId);
    }

    @Override
    public void deleteCartAll(String userId) {
        cartMapper.deleteCartAll(userId);
    }

    @Override
    public void modifyCart(CartVO vo) {
        cartMapper.modifyCart(vo);
    }

    @Override
    public int sumMoney(String userId) {
        return cartMapper.sumMoney(userId);
    }

    @Override
    public int countCart(CartVO vo) {
        return cartMapper.countCart(vo);
    }

    @Override
    public void updateCart(CartVO vo) {
        cartMapper.updateCart(vo);

    }
}
