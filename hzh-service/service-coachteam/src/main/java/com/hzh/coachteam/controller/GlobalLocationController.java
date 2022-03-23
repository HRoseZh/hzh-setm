package com.hzh.coachteam.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.coachteam.service.GlobalLocationService;
import com.hzh.common.pojo.po.ChinaCity;
import com.hzh.common.pojo.po.GlobalLocation;
import com.hzh.common.pojo.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
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
@Api("全球城市配置接口")
public class GlobalLocationController {

    @Resource
    private  GlobalLocationService globalLocationService;

    @PostMapping("/global/getAllPage")
    @ApiOperation("分页查询全球城市以及国家")
    public ResultVO getAll(@RequestBody HashMap map){
        int current = null == map.get("current") ? 1 : Integer.parseInt(map.get("current").toString());
        int size = null == map.get("size") ? 10 : Integer.parseInt(map.get("size").toString());
        Map res = new HashMap();
        Page<GlobalLocation> page= new Page<>(current, size);
        IPage<GlobalLocation> globalLocationIPage = globalLocationService.selectPage(page);
        return ResultVO.ok(globalLocationIPage);
    }

    @GetMapping("/global/getAll")
    @ApiOperation("查询全球城市以及国家")
    public ResultVO getAll(){
        List<GlobalLocation> all = globalLocationService.getAll();
        return ResultVO.ok(all);
    }

    @PostMapping("/global/getChildByGlPid")
    @ApiOperation("根据父ip查询子级城市")
    public ResultVO  getChildByPid(@RequestBody HashMap map){
        int pid = null == map.get("glpId") ? 1 : Integer.parseInt(map.get("glpId").toString());
        List<GlobalLocation> chinaCities =  globalLocationService.getChildByGlpId(pid);
        return ResultVO.ok(chinaCities);
    }



}

