package com.hzh.coachteam.controller;


import com.hzh.coachteam.pojo.BasketballTeamInfo;
import com.hzh.coachteam.service.BasketballTeamInfoService;
import com.hzh.coachteam.service.impl.BasketballTeamInfoServiceImpl;
import com.hzh.common.pojo.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Hzh
 * @since 2022-03-20
 */
@RestController
@RequestMapping("/team")
@Api("教练组相关配置")
public class BasketballTeamInfoController {




    @Resource
    private BasketballTeamInfoService basketballTeamInfoService;


    @GetMapping("/coach/getAll")
    @ApiOperation("获取所有教练信息")
    public ResultVO getAll(){
        List<BasketballTeamInfo> all = basketballTeamInfoService.getAll();
        return ResultVO.ok(all);
    }


}

