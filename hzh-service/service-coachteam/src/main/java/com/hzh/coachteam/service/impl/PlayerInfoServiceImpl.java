package com.hzh.coachteam.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.PlayerInfo;
import com.hzh.common.mapper.PlayerInfoMapper;
import com.hzh.coachteam.service.PlayerInfoService;
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
public class PlayerInfoServiceImpl extends ServiceImpl<PlayerInfoMapper, PlayerInfo> implements PlayerInfoService {

    @Resource
    private PlayerInfoMapper playerInfoMapper;

    @Override
    public IPage<PlayerInfo> selectPage(Page<PlayerInfo> page) {
        return playerInfoMapper.selectPage(page, null);
    }
}
