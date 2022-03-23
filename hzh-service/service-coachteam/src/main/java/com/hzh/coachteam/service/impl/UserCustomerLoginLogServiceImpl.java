package com.hzh.coachteam.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.UserCustomerLoginLog;
import com.hzh.common.mapper.UserCustomerLoginLogMapper;
import com.hzh.coachteam.service.UserCustomerLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 用户登陆日志表 服务实现类
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
@Service
public class UserCustomerLoginLogServiceImpl extends ServiceImpl<UserCustomerLoginLogMapper, UserCustomerLoginLog> implements UserCustomerLoginLogService {

    @Resource
    private UserCustomerLoginLogMapper userCustomerLoginLogMapper;

    @Override
    public IPage<UserCustomerLoginLog> selectPage(Page<UserCustomerLoginLog> page) {
        return userCustomerLoginLogMapper.selectPage(page,null);
    }
}
