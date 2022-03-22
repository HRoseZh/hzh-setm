package com.hzh.coachteam.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.UserCustomerLevelInfo;
import com.hzh.common.mapper.UserCustomerLevelInfoMapper;
import com.hzh.coachteam.service.UserCustomerLevelInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 用户级别信息表 服务实现类
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
@Service
public class UserCustomerLevelInfoServiceImpl extends ServiceImpl<UserCustomerLevelInfoMapper, UserCustomerLevelInfo> implements UserCustomerLevelInfoService {

    @Resource
    private UserCustomerLevelInfoMapper userCustomerLevelInfoMapper;


    @Override
    public IPage<UserCustomerLevelInfo> selectPage(Page<UserCustomerLevelInfo> page) {
        return userCustomerLevelInfoMapper.selectPage(page,null);
    }
}
