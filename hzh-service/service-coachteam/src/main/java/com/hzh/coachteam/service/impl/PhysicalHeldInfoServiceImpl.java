package com.hzh.coachteam.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.PhysicalHeldInfo;
import com.hzh.common.mapper.PhysicalHeldInfoMapper;
import com.hzh.coachteam.service.PhysicalHeldInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 体育赛事举办信息表 服务实现类
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
@Service
public class PhysicalHeldInfoServiceImpl extends ServiceImpl<PhysicalHeldInfoMapper, PhysicalHeldInfo> implements PhysicalHeldInfoService {

    @Resource
    private PhysicalHeldInfoMapper physicalHeldInfoMapper;

    @Override
    public IPage<PhysicalHeldInfo> selectPage(Page<PhysicalHeldInfo> page) {
        return physicalHeldInfoMapper.selectPage(page,null);
    }
}
