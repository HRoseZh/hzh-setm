package com.hzh.coachteam.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.coachteam.service.ChinaCityService;
import com.hzh.common.pojo.po.ChinaCity;
import com.hzh.common.pojo.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
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
@Api("中国城市配置接口")
@Slf4j
public class ChinaCityController {

    @Resource
    private ChinaCityService chinaCityService;

    @PostMapping("/china/getAllPage")
    @ApiOperation("分页查询所有中国城市")
    public ResultVO getAll(@RequestBody HashMap map){
        int current = null == map.get("current") ? 1 : Integer.parseInt(map.get("current").toString());
        int size = null == map.get("size") ? 10 : Integer.parseInt(map.get("size").toString());
        Map res = new HashMap();
        Page<ChinaCity> page= new Page<>(current, size);
        IPage<ChinaCity> chinaCityIPage = chinaCityService.selectPage(page);
        return ResultVO.ok(chinaCityIPage);
    }

    @GetMapping("/china/getAll")
    @ApiOperation("查询所有中国城市")
    public ResultVO getAll(){
        List<ChinaCity> all = chinaCityService.getAll();
        return ResultVO.ok(all);
    }

    @PostMapping("/china/getChildByPid")
    @ApiOperation("根据父ip查询子级城市")
    public ResultVO  getChildByPid(@RequestBody HashMap map){
        int pid = null == map.get("pid") ? 1 : Integer.parseInt(map.get("pid").toString());
        List<ChinaCity> chinaCities =  chinaCityService.getChildByPid(pid);
        return ResultVO.ok(chinaCities);
    }

    @PostMapping("/china/urdChina")
    @ApiOperation("对中国城市的曾，删，改")
    private ResultVO urdChina(@RequestBody HashMap map){
        String event = map.get("event").toString();
        HashMap res = new HashMap();
        ChinaCity chinaCity = ChinaCity.builder()
                .id(Integer.parseInt(map.get("id").toString()))
                .pid(Integer.parseInt(map.get("pid").toString()))
                .cityname(map.get("city_name").toString())
                .type(Integer.valueOf(map.get("type").toString()))
                .build();
        switch (event){
            case "1" :
                QueryWrapper<ChinaCity> queryWrapper = new QueryWrapper<>();
                queryWrapper.select("max(id) as id");
                Map<String, Object> map1 = chinaCityService.getMap(queryWrapper);
                int maxid = Integer.parseInt(map1.get("id").toString());
                int saveid = maxid + 1;
                chinaCity.setId(saveid);
                boolean save = chinaCityService.save(chinaCity);
                if (save){
                    return ResultVO.ok();
                }else{
                    res.put("msg","新增失败");
                    return ResultVO.ok(res);
                }

            case  "2" :
                if (ObjectUtils.isNotEmpty(Integer.parseInt(map.get("id").toString()))){
                    boolean updateById = chinaCityService.updateById(chinaCity);
                    if (updateById){
                        return ResultVO.ok();
                    }else{
                        log.error("更新失败");
                        res.put("msg","更新失败");
                        return ResultVO.ok(res);
                    }
                }else {
                    log.error("china_city id 为空!");
                    res.put("msg","china_city id 为空!");
                    return ResultVO.ok(res);
                }

            case  "3" :
                if (ObjectUtils.isNotEmpty(Integer.parseInt(map.get("id").toString()))){
                    boolean delete = chinaCityService.removeById(chinaCity.getId());
                    if (delete){
                        return ResultVO.ok();
                    }else{
                        log.error("删除失败，该城市具有子级城市");
                        res.put("msg","删除失败，该城市具有子级城市");
                        return ResultVO.ok(res);
                    }
                }else {
                    log.error("china_city id 为空!");
                    res.put("msg","china_city id 为空!");
                    return ResultVO.ok(res);
                }
        }
        return ResultVO.ok();
    }

}

