package com.hzh.coachteam.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.UserCustomerBalanceLog;
import com.hzh.common.mapper.UserCustomerBalanceLogMapper;
import com.hzh.coachteam.service.UserCustomerBalanceLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 用户余额变动表 服务实现类
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
@Service
public class UserCustomerBalanceLogServiceImpl extends ServiceImpl<UserCustomerBalanceLogMapper, UserCustomerBalanceLog> implements UserCustomerBalanceLogService {

    @Resource
    public UserCustomerBalanceLogMapper userCustomerBalanceLogMapper;

    @Override
    public IPage<UserCustomerBalanceLog> selectPage(Page<UserCustomerBalanceLog> page) {
        return userCustomerBalanceLogMapper.selectPage(page,null);
    }
}
