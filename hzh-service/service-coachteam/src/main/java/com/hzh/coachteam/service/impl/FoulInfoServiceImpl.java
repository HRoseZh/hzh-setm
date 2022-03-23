package com.hzh.coachteam.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.FoulInfo;
import com.hzh.common.mapper.FoulInfoMapper;
import com.hzh.coachteam.service.FoulInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzh.common.pojo.po.GlobalLocation;
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
public class FoulInfoServiceImpl extends ServiceImpl<FoulInfoMapper, FoulInfo> implements FoulInfoService {

    @Resource
    private FoulInfoMapper foulInfoMapper;

    @Override
    public IPage<FoulInfo> selectPage(Page<FoulInfo> page) {
        return foulInfoMapper.selectPage(page,null);
    }
}
