package com.hzh.coachteam.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.coachteam.service.UserCustomerLoginLogService;
import com.hzh.coachteam.service.WarInfoService;
import com.hzh.common.pojo.po.UserCustomerLoginLog;
import com.hzh.common.pojo.po.WarInfo;
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
 *  前端控制器
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
@RestController
@RequestMapping("/team")
@Api("对战信息配接口")
public class WarInfoController {

    @Resource
    private WarInfoService warInfoService;

    @PostMapping("/warInfo/getAll")
    public ResultVO getAll(@RequestBody HashMap map){
        int current = null == map.get("current") ? 1 : Integer.parseInt(map.get("current").toString());
        int size = null == map.get("size") ? 10 : Integer.parseInt(map.get("size").toString());
        Map res = new HashMap();
        Page<WarInfo> page= new Page<>(current,size);
        IPage<WarInfo> warInfoIPage = warInfoService.selectPage(page);
        return ResultVO.ok(warInfoIPage);
    }


}

