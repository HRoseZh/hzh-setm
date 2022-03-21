package com.hzh.coachteam.service.impl;

import com.hzh.coachteam.pojo.BasketballTeamInfo;
import com.hzh.coachteam.mapper.BasketballTeamInfoMapper;
import com.hzh.coachteam.service.BasketballTeamInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Hzh
 * @since 2022-03-20
 */
@Service
public class BasketballTeamInfoServiceImpl extends ServiceImpl<BasketballTeamInfoMapper, BasketballTeamInfo> implements BasketballTeamInfoService {

    @Resource
    private BasketballTeamInfoMapper basketballTeamInfoMapper;

    @Override
    public List<BasketballTeamInfo> getAll() {
        List<BasketballTeamInfo> basketballTeamInfos = basketballTeamInfoMapper.selectList(null);
        return basketballTeamInfos;
    }
}
