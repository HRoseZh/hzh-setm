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
@ApiModel(value="WarInfo对象", description="")
public class WarInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "对战编号")
    @TableId(value = "war_id", type = IdType.ASSIGN_ID)
    private Integer warId;

    @ApiModelProperty(value = "对战时间")
    private Date warTime;

    @ApiModelProperty(value = "对战名称")
    private String warName;

    @ApiModelProperty(value = "主场球队")
    private Integer homeTeam;

    @ApiModelProperty(value = "客场球队")
    private Integer awayTeam;

    @ApiModelProperty(value = "最终比分")
    private Integer warScore;

    @ApiModelProperty(value = "主队得分")
    private Integer homeTeamScore;

    @ApiModelProperty(value = "客队得分")
    private Integer awayTeamScore;

    @ApiModelProperty(value = "胜方")
    private Integer warWon;

    @ApiModelProperty(value = "比赛场地")
    private Integer warLocation;

    @ApiModelProperty(value = "主队犯规次数")
    private Integer homeTeamFoul;

    @ApiModelProperty(value = "客队犯规次数")
    private Integer awayTeamFoul;

    @ApiModelProperty(value = "主队犯规球员")
    private String homePlayerFoul;

    @ApiModelProperty(value = "客队犯规次数")
    private String awayPlayerFoul;

    @ApiModelProperty(value = "主队罚球次数")
    private Integer homeTeamPenalty;

    @ApiModelProperty(value = "客队罚球次数")
    private Integer awayTeamPenalty;

    @ApiModelProperty(value = "主队罚球得分")
    private Integer homeTeamPenaltyScore;

    @ApiModelProperty(value = "客队罚球得分")
    private Integer awayTeamPenaltyScore;

    @ApiModelProperty(value = "裁判团队")
    private Integer umpireId;

    @ApiModelProperty(value = "赛事类型")
    private String sportsType;


}
