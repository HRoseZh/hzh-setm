package com.hzh.common.pojo.po;

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
 * @since 2022-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="FoulInfo对象", description="")
public class FoulInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "犯规信息编号")
    @TableId(value = "foul_id", type = IdType.ASSIGN_ID)
    private Integer foulId;

    @ApiModelProperty(value = "对战编号")
    private Integer warId;

    @ApiModelProperty(value = "犯规球员编号")
    private Integer foulPlayerId;

    @ApiModelProperty(value = "犯规球员名称")
    private String foulPlayerName;

    @ApiModelProperty(value = "被犯规球员编号")
    private Integer fouledPlayerId;

    @ApiModelProperty(value = "被犯规球员名称")
    private String fouledPlayerName;

    @ApiModelProperty(value = "判罚裁判团队")
    private Integer umpireId;

    @ApiModelProperty(value = "判罚裁判")
    private Integer penaltyId;

    @ApiModelProperty(value = "判罚等级   1-1级恶意  2-技术犯规  3-普通犯规")
    private Integer penaltyLevel;

    @ApiModelProperty(value = "判罚方式   1-驱逐出场  2-判罚下场  3-犯规累积")
    private Integer sentencingMethods;


}
