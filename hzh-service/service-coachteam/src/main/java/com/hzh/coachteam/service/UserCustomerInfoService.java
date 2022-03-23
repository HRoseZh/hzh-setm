package com.hzh.coachteam.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.UserCustomerInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
public interface UserCustomerInfoService extends IService<UserCustomerInfo> {

    IPage<UserCustomerInfo> selectPage(Page<UserCustomerInfo> page);
}
