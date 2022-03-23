package com.hzh.coachteam.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.FoulInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hzh.common.pojo.po.GlobalLocation;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
public interface FoulInfoService extends IService<FoulInfo> {

    IPage<FoulInfo> selectPage(Page<FoulInfo> page);
}
