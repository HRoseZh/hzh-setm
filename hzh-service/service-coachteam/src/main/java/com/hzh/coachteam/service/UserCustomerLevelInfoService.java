package com.hzh.coachteam.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.UserCustomerLevelInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户级别信息表 服务类
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
public interface UserCustomerLevelInfoService extends IService<UserCustomerLevelInfo> {

    IPage<UserCustomerLevelInfo> selectPage(Page<UserCustomerLevelInfo> page);
}
