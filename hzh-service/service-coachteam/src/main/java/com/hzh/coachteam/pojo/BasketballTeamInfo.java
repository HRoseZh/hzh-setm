package com.hzh.coachteam.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Hzh
 * @since 2022-03-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="BasketballTeamInfo对象", description="")
public class BasketballTeamInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "球队编号")
    @TableId(value = "team_id", type = IdType.ASSIGN_ID)
    private Integer teamId;

    @ApiModelProperty(value = "球队名称")
    private String teamName;

    @ApiModelProperty(value = "建队时间")
    private String teamTime;

    @ApiModelProperty(value = "球队人数")
    private Integer teamPeoples;

    @ApiModelProperty(value = "球队地址")
    private String teamAddress;

    @ApiModelProperty(value = "球队主教练id")
    private String teamCoach;

    @ApiModelProperty(value = "球队历史胜场总数")
    private Integer teamHistoryWin;

    @ApiModelProperty(value = "球队历史败场总数")
    private Integer teamHistoryLose;

    @ApiModelProperty(value = "球队总冠军次数")
    private Integer teamOutright;

    @ApiModelProperty(value = "球队分区冠军次数")
    private Integer teamDivisionChampion;


}
