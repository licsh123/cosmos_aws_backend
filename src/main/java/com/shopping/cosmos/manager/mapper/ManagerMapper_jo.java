package com.shopping.cosmos.manager.mapper;

import com.shopping.cosmos.manager.vo.ManagerItemsVO_jo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManagerMapper_jo {
	
	List<ManagerItemsVO_jo> managerItemsCnt(ManagerItemsVO_jo vo);
}
