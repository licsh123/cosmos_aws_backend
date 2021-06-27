package com.shopping.cosmos.manager.service;

import com.shopping.cosmos.manager.mapper.ManagerMapper_jo;
import com.shopping.cosmos.manager.vo.ManagerItemsVO_jo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl_jo implements ManagerService_jo {

    @Autowired
    ManagerMapper_jo mapper;

    @Override
    public List<ManagerItemsVO_jo> managerItemsCnt(ManagerItemsVO_jo vo) {
        return mapper.managerItemsCnt(vo);
    }

}
