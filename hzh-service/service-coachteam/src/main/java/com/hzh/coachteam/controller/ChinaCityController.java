package com.hzh.coachteam.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.coachteam.service.ChinaCityService;
import com.hzh.common.pojo.po.ChinaCity;
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
public class ChinaCityController {

    @Resource
    private ChinaCityService chinaCityService;

    @PostMapping("/china/getAll")
    public ResultVO getAll(@RequestBody HashMap map){
        int current = null == map.get("current") ? 1 : Integer.parseInt(map.get("current").toString());
        int size = null == map.get("size") ? 10 : Integer.parseInt(map.get("size").toString());
        Map res = new HashMap();
        Page<ChinaCity> page= new Page<ChinaCity>(current,size);
        IPage<ChinaCity> chinaCityIPage = chinaCityService.selectPage(page);
        return ResultVO.ok(chinaCityIPage);
    }


}

