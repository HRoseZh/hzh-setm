package com.hzh.coachteam.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.coachteam.service.ChinaCityService;
import com.hzh.coachteam.service.UserCustomerLevelInfoService;
import com.hzh.common.pojo.po.ChinaCity;
import com.hzh.common.pojo.po.UserCustomerLevelInfo;
import com.hzh.common.pojo.vo.ResultVO;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 用户级别信息表 前端控制器
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
@RestController
@RequestMapping("/team")
public class UserCustomerLevelInfoController {

    @Resource
    private UserCustomerLevelInfoService userCustomerLevelInfoService;

    @PostMapping("/userlevel/getAll")
    public ResultVO getAll(@RequestBody HashMap map){
        int current = null == map.get("current") ? 1 : Integer.parseInt(map.get("current").toString());
        int size = null == map.get("size") ? 10 : Integer.parseInt(map.get("size").toString());
        Map res = new HashMap();
        Page<UserCustomerLevelInfo> page= new Page<UserCustomerLevelInfo>(current,size);
        IPage<UserCustomerLevelInfo> userCustomerLevelInfoIPage = userCustomerLevelInfoService.selectPage(page);
        return ResultVO.ok(userCustomerLevelInfoIPage);
    }


}

