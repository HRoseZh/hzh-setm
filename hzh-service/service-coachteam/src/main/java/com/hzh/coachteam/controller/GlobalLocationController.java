package com.hzh.coachteam.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.coachteam.service.GlobalLocationService;
import com.hzh.common.pojo.po.GlobalLocation;
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
public class GlobalLocationController {


    @Resource
    private  GlobalLocationService globalLocationService;

    @PostMapping("/global/getAll")
    public ResultVO getAll(@RequestBody HashMap map){
        int current = null == map.get("current") ? 1 : Integer.parseInt(map.get("current").toString());
        int size = null == map.get("size") ? 10 : Integer.parseInt(map.get("size").toString());
        Map res = new HashMap();
        Page<GlobalLocation> page= new Page<GlobalLocation>(current,size);
        IPage<GlobalLocation> globalLocationIPage = globalLocationService.selectPage(page);
        if (ObjectUtils.isNotEmpty(globalLocationIPage)){
            return ResultVO.ok(globalLocationIPage);
        }else {
            res.put("code","0");
            res.put("data","查询失败");
            return ResultVO.ok(res);
        }
    }


}

