package com.hzh.coachteam.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzh.common.pojo.po.ChinaCity;
import com.hzh.common.pojo.po.GlobalLocation;
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
public interface GlobalLocationService extends IService<GlobalLocation> {

    IPage<GlobalLocation> selectPage(Page<GlobalLocation> page);

    List<GlobalLocation> getAll();

    List<GlobalLocation> getChildByGlpId(int pid);
}
