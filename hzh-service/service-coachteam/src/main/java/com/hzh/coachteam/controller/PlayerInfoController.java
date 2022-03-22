package com.hzh.coachteam.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.coachteam.service.GlobalLocationService;
import com.hzh.coachteam.service.PlayerInfoService;
import com.hzh.common.pojo.po.GlobalLocation;
import com.hzh.common.pojo.po.PlayerInfo;
import com.hzh.common.pojo.vo.ResultVO;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.web.bind.annotation.*;

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
public class PlayerInfoController {

    @Resource
    private PlayerInfoService playerInfoService;

    @PostMapping("/player/getAll")
    public ResultVO getAll(@RequestBody HashMap map){
        int current = null == map.get("current") ? 1 : Integer.parseInt(map.get("current").toString());
        int size = null == map.get("size") ? 10 : Integer.parseInt(map.get("size").toString());
        Map res = new HashMap();
        //current 当前页  size 每页显示数量
        Page<PlayerInfo> page= new Page<PlayerInfo>(current,size);
        IPage<PlayerInfo> playerInfoIPage = playerInfoService.selectPage(page);
        return ResultVO.ok(playerInfoIPage);
    }




}

