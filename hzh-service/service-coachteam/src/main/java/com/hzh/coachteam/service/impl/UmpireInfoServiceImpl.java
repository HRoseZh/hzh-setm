package com.hzh.coachteam.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.UmpireInfo;
import com.hzh.common.mapper.UmpireInfoMapper;
import com.hzh.coachteam.service.UmpireInfoService;
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
public class UmpireInfoServiceImpl extends ServiceImpl<UmpireInfoMapper, UmpireInfo> implements UmpireInfoService {

    @Resource
    private UmpireInfoMapper umpireInfoMapper;

    @Override
    public IPage<UmpireInfo> selectPage(Page<UmpireInfo> page) {
        return umpireInfoMapper.selectPage(page,null);
    }
}
