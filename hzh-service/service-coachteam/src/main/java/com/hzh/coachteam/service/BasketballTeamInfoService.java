package com.hzh.coachteam.service;

import com.hzh.coachteam.pojo.BasketballTeamInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Hzh
 * @since 2022-03-20
 */
public interface BasketballTeamInfoService extends IService<BasketballTeamInfo> {

    List<BasketballTeamInfo> getAll();
}
