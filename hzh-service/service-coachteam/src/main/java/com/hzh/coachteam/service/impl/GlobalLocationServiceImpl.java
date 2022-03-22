package com.hzh.coachteam.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.GlobalLocation;
import com.hzh.common.mapper.GlobalLocationMapper;
import com.hzh.coachteam.service.GlobalLocationService;
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
public class GlobalLocationServiceImpl extends ServiceImpl<GlobalLocationMapper, GlobalLocation> implements GlobalLocationService {

    @Resource
    private GlobalLocationMapper globalLocationMapper;

    @Override
    public IPage<GlobalLocation> selectPage(Page<GlobalLocation> page) {
        return globalLocationMapper.selectPage(page, null);
    }
}
