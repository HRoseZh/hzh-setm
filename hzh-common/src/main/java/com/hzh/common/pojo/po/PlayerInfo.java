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
@ApiModel(value="PlayerInfo对象", description="")
public class PlayerInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "球员编号")
    @TableId(value = "player_id", type = IdType.ASSIGN_ID)
    private Integer playerId;

    @ApiModelProperty(value = "球员名称")
    private String playerName;

    @ApiModelProperty(value = "入队时间")
    private Date playerTime;

    @ApiModelProperty(value = "球员身高")
    private Integer playerHeight;

    @ApiModelProperty(value = "球员体重")
    private Integer playerWeight;

    @ApiModelProperty(value = "球员国籍")
    private Integer playerCountry;

    @ApiModelProperty(value = "球员年龄")
    private Integer playerAge;

    @ApiModelProperty(value = "队服号码")
    private Integer playerUniformNumber;

    @ApiModelProperty(value = "球员位置")
    private String playerLocation;

    @ApiModelProperty(value = "所属球队")
    private Integer teamId;

    @ApiModelProperty(value = "教练编号")
    private Integer coachId;

    @ApiModelProperty(value = "从业时长")
    private Integer practitionersAge;

    @ApiModelProperty(value = "职业生涯开始时间")
    private Date practitionersYear;


}
