package com.hzh.coachteam.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.UserCustomerLoginLog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户登陆日志表 服务类
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
public interface UserCustomerLoginLogService extends IService<UserCustomerLoginLog> {

    IPage<UserCustomerLoginLog> selectPage(Page<UserCustomerLoginLog> page);
}
