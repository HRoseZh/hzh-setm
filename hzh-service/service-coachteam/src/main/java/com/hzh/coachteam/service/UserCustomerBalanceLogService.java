package com.hzh.coachteam.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.UserCustomerBalanceLog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户余额变动表 服务类
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
public interface UserCustomerBalanceLogService extends IService<UserCustomerBalanceLog> {

    IPage<UserCustomerBalanceLog> selectPage(Page<UserCustomerBalanceLog> page);
}
