package com.hzh.coachteam.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.UserCustomerInfo;
import com.hzh.common.mapper.UserCustomerInfoMapper;
import com.hzh.coachteam.service.UserCustomerInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
@Service
public class UserCustomerInfoServiceImpl extends ServiceImpl<UserCustomerInfoMapper, UserCustomerInfo> implements UserCustomerInfoService {

    @Resource
    public UserCustomerInfoMapper userCustomerInfoMapper;

    @Override
    public IPage<UserCustomerInfo> selectPage(Page<UserCustomerInfo> page) {
        return userCustomerInfoMapper.selectPage(page,null);
    }
}
