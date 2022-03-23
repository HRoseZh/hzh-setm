package com.hzh.coachteam.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.ChinaCity;
import com.hzh.common.mapper.ChinaCityMapper;
import com.hzh.coachteam.service.ChinaCityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
@Service
public class ChinaCityServiceImpl extends ServiceImpl<ChinaCityMapper, ChinaCity> implements ChinaCityService {

    @Resource
    private ChinaCityMapper chinaCityMapper;

    @Override
    public IPage<ChinaCity> selectPage(Page<ChinaCity> page) {
        return chinaCityMapper.selectPage(page, null);
    }

    @Override
    public List<ChinaCity> getAll() {
        return chinaCityMapper.selectList(null);
    }

    @Override
    public List<ChinaCity> getChildByPid(int pid) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("pid",pid);
        return chinaCityMapper.selectMaps(queryWrapper);
    }


}
