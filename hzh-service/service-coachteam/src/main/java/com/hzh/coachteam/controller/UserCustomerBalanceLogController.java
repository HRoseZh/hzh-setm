package com.hzh.coachteam.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.coachteam.service.UmpireInfoService;
import com.hzh.coachteam.service.UserCustomerBalanceLogService;
import com.hzh.common.pojo.po.UmpireInfo;
import com.hzh.common.pojo.po.UserCustomerBalanceLog;
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
 * 用户余额变动表 前端控制器
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
@RestController
@RequestMapping("/team")
@Api("用户余额变动信息配置接口")
public class UserCustomerBalanceLogController {

    @Resource
    private UserCustomerBalanceLogService userCustomerBalanceLogService;

    @PostMapping("/userCustomerBalanceLog/getAll")
    public ResultVO getAll(@RequestBody HashMap map){
        int current = null == map.get("current") ? 1 : Integer.parseInt(map.get("current").toString());
        int size = null == map.get("size") ? 10 : Integer.parseInt(map.get("size").toString());
        Map res = new HashMap();
        //current 当前页  size 每页显示数量
        Page<UserCustomerBalanceLog> page= new Page<>(current, size);
        IPage<UserCustomerBalanceLog> userCustomerBalanceLogIPage = userCustomerBalanceLogService.selectPage(page);
        return ResultVO.ok(userCustomerBalanceLogIPage);
    }

}

