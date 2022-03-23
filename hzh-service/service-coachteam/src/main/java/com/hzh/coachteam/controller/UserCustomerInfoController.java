package com.hzh.coachteam.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.coachteam.service.UmpireInfoService;
import com.hzh.coachteam.service.UserCustomerInfoService;
import com.hzh.common.pojo.po.UmpireInfo;
import com.hzh.common.pojo.po.UserCustomerInfo;
import com.hzh.common.pojo.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
@RestController
@RequestMapping("/team")
@Api("用户信息配置接口")
public class UserCustomerInfoController {

    @Resource
    private UserCustomerInfoService userCustomerInfoService;

    @PostMapping("/userCustomerInfo/getAll")
    public ResultVO getAll(@RequestBody HashMap map){
        int current = null == map.get("current") ? 1 : Integer.parseInt(map.get("current").toString());
        int size = null == map.get("size") ? 10 : Integer.parseInt(map.get("size").toString());
        Map res = new HashMap();
        //current 当前页  size 每页显示数量
        Page<UserCustomerInfo> page= new Page<>(current, size);
        IPage<UserCustomerInfo> customerInfoIPage = userCustomerInfoService.selectPage(page);
        return ResultVO.ok(customerInfoIPage);
    }

}

