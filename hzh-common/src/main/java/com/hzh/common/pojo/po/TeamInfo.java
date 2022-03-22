package com.hzh.common.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
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
 * @since 2022-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TeamInfo对象", description="")
public class TeamInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "球队编号")
    @TableId(value = "team_id", type = IdType.ASSIGN_ID)
    private Integer teamId;

    @ApiModelProperty(value = "球队名称")
    private String teamName;

    @ApiModelProperty(value = "建队时间")
    private Date teamTime;

    @ApiModelProperty(value = "球队类型")
    private String teamType;

    @ApiModelProperty(value = "球队人数")
    private Integer teamPeoples;

    @ApiModelProperty(value = "球队地址")
    private String teamAddress;

    @ApiModelProperty(value = "球队教练id")
    private String teamCoachId;

    @ApiModelProperty(value = "该队最高荣誉")
    private String teamBaseHonor;

    @ApiModelProperty(value = "该队分区荣誉")
    private String teamPartitionLose;

    @ApiModelProperty(value = "其他荣誉")
    private String teamOrtherHonor;

    @ApiModelProperty(value = "该队最高荣誉总数")
    private Integer teamBaseHonorNum;

    @ApiModelProperty(value = "该队分区荣誉总数")
    private Integer teamPartitionHonorNum;

    @ApiModelProperty(value = "该队其他荣誉总数")
    private Integer teamOrtherHonorNum;


}
