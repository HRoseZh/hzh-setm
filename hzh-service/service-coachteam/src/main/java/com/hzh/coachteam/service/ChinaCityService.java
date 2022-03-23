package com.hzh.coachteam.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.ChinaCity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
public interface ChinaCityService extends IService<ChinaCity> {

    IPage<ChinaCity> selectPage(Page<ChinaCity> page);

    List<ChinaCity> getAll();

    List<ChinaCity> getChildByPid(int pid);

}
