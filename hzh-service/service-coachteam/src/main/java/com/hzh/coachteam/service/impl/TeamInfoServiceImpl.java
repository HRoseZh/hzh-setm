package com.hzh.coachteam.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.TeamInfo;
import com.hzh.common.mapper.TeamInfoMapper;
import com.hzh.coachteam.service.TeamInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
@Service
public class TeamInfoServiceImpl extends ServiceImpl<TeamInfoMapper, TeamInfo> implements TeamInfoService {

    @Resource
    private TeamInfoMapper teamInfoMapper;

    @Override
    public IPage<TeamInfo> selectPage(Page<TeamInfo> page) {
        return teamInfoMapper.selectPage(page,null);
    }
}
