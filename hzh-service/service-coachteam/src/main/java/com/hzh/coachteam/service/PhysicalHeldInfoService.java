package com.hzh.coachteam.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.PhysicalHeldInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 体育赛事举办信息表 服务类
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
public interface PhysicalHeldInfoService extends IService<PhysicalHeldInfo> {

    IPage<PhysicalHeldInfo> selectPage(Page<PhysicalHeldInfo> page);
}
