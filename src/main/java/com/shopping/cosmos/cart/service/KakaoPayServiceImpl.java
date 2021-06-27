package com.shopping.cosmos.cart.service;

import com.shopping.cosmos.cart.domain.*;
import com.shopping.cosmos.cart.mapper.CartMapper;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Service
@Log
public class KakaoPayServiceImpl implements KakaoPayService{

    @Autowired
    private CartMapper cartMapper;

    private KaKaoPayReadyVO kakaoPayReadyVO;
    private KaKaoPayApprovalVO kakaoPayApprovalVO;
    @Override
    public String kakaoPayReady(String userId) {
        int total_price = cartMapper.sumMoney(userId);
        if(total_price<50000){
            total_price+=3000;
        }
        List<CartVO> cartVO = cartMapper.listCart(userId);

        RestTemplate restTemplate = new RestTemplate();

        // 서버로 요청할 Header
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization","KakaoAK 641a1109e19b6636e2214a0ebbf0aba4");
        headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
        // 서버로 요청할 Body
        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
        params.add("cid", "TC0ONETIME");
        params.add("partner_order_id", "1001");
        params.add("partner_user_id", "gorany");
        params.add("item_name", cartVO.get(0).getProductName()+"외 "+(cartVO.size()-1)+"종");
        params.add("quantity", "1");
        params.add("total_amount", Integer.toString(total_price));
        params.add("tax_free_amount", "100");
        params.add("approval_url", "http://localhost:3000/order/kakaoPaySuccess");
        params.add("cancel_url", "http://localhost:3000/order/cancel");
        params.add("fail_url", "http://localhost:3000/order/fail");

        HttpEntity<MultiValueMap<String, String>> body = new HttpEntity<>(params, headers);

        try {
//            String result = restTemplate.postForObject(new URI("https://kapi.kakao.com/v1/payment/ready"), body, String.class);
//            log.info(result);

            kakaoPayReadyVO = restTemplate.postForObject(new URI("https://kapi.kakao.com/v1/payment/ready"), body, KaKaoPayReadyVO.class);

            log.info("" + kakaoPayReadyVO);

            log.info(kakaoPayReadyVO.getNext_redirect_pc_url());


            return kakaoPayReadyVO.getNext_redirect_pc_url();

        } catch (RestClientException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return "/pay";
    }

    @Override
    public KaKaoPayApprovalVO kakaoPayInfo(String pg_token,String userId) {
        int total_price = cartMapper.sumMoney(userId);
        log.info("KakaoPayInfoVO............................................");
        log.info("-----------------------------");
        RestTemplate restTemplate = new RestTemplate();

        // 서버로 요청할 Header
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization","KakaoAK 641a1109e19b6636e2214a0ebbf0aba4");
        headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");

        // 서버로 요청할 Body
        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
        params.add("cid", "TC0ONETIME");
        params.add("tid", kakaoPayReadyVO.getTid());
        params.add("partner_order_id", "1001");
        params.add("partner_user_id", "gorany");
        params.add("pg_token", pg_token);
        params.add("total_amount", Integer.toString(total_price));

        HttpEntity<MultiValueMap<String, String>> body = new HttpEntity<MultiValueMap<String, String>>(params, headers);

        try {
            kakaoPayApprovalVO = restTemplate.postForObject(new URI("https://kapi.kakao.com/v1/payment/approve"), body, KaKaoPayApprovalVO.class);
            log.info("" + kakaoPayApprovalVO);
            cartMapper.deleteCartAll(userId);

            return kakaoPayApprovalVO;

        } catch (RestClientException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<AddressVO> listAddress(String userId) {
        return cartMapper.listAddress(userId);
    }

    @Override
    public UserVO userOrderData(String userId) {
        return cartMapper.userOrderData(userId);
    }

}