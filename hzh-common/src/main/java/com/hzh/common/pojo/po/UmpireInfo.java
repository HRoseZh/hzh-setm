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
@ApiModel(value="UmpireInfo对象", description="")
public class UmpireInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "裁判团队编号")
    @TableId(value = "umpire_id", type = IdType.ASSIGN_ID)
    private Integer umpireId;

    @ApiModelProperty(value = "裁判编号")
    private Integer refereeId;

    @ApiModelProperty(value = "裁判名称")
    private String refereesName;

    @ApiModelProperty(value = "裁判位置 1-主裁判 2-助理裁判 3-其他裁判")
    private String refereesLocation;

    @ApiModelProperty(value = "裁判身高")
    private Integer refereeHeight;

    @ApiModelProperty(value = "裁判体重")
    private Integer refereeWeight;

    @ApiModelProperty(value = "裁判国籍")
    private Integer refereeCountry;

    @ApiModelProperty(value = "裁判年龄")
    private Integer refereeAge;

    @ApiModelProperty(value = "从业时长")
    private Integer practitionersAge;


}
