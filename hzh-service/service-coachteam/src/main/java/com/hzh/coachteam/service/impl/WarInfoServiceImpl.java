package com.hzh.coachteam.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.WarInfo;
import com.hzh.common.mapper.WarInfoMapper;
import com.hzh.coachteam.service.WarInfoService;
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
public class WarInfoServiceImpl extends ServiceImpl<WarInfoMapper, WarInfo> implements WarInfoService {

    @Resource
    private WarInfoMapper warInfoMapper;

    @Override
    public IPage<WarInfo> selectPage(Page<WarInfo> page) {
        return warInfoMapper.selectPage(page,null);
    }
}
