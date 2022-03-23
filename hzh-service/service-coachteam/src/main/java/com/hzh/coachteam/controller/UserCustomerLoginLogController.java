package com.hzh.coachteam.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.coachteam.service.UserCustomerLevelInfoService;
import com.hzh.coachteam.service.UserCustomerLoginLogService;
import com.hzh.common.pojo.po.UserCustomerLevelInfo;
import com.hzh.common.pojo.po.UserCustomerLoginLog;
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
 * 用户登陆日志表 前端控制器
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
@RestController
@RequestMapping("/team")
@Api("用户登陆日志信息配置接口")
public class UserCustomerLoginLogController {

    @Resource
    private UserCustomerLoginLogService userCustomerLoginLogService;

    @PostMapping("/userCustomerLoginLog/getAll")
    public ResultVO getAll(@RequestBody HashMap map){
        int current = null == map.get("current") ? 1 : Integer.parseInt(map.get("current").toString());
        int size = null == map.get("size") ? 10 : Integer.parseInt(map.get("size").toString());
        Map res = new HashMap();
        Page<UserCustomerLoginLog> page= new Page<>(current,size);
        IPage<UserCustomerLoginLog> userCustomerLoginLogIPage = userCustomerLoginLogService.selectPage(page);
        return ResultVO.ok(userCustomerLoginLogIPage);
    }

}

