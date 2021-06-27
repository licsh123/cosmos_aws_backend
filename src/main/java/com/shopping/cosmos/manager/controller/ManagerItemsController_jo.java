package com.shopping.cosmos.manager.controller;

import com.shopping.cosmos.manager.service.ManagerService_jo;
import com.shopping.cosmos.manager.vo.ManagerItemsVO_jo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/cos")
public class ManagerItemsController_jo {

    @Autowired
    private ManagerService_jo service;

    @GetMapping("/manager")
    List<ManagerItemsVO_jo> getManagerItems(ManagerItemsVO_jo vo) {
        System.out.println("getManagerItems 접근");
        return service.managerItemsCnt(vo);
    }

}
