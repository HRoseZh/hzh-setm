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
 * 用户级别信息表
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserCustomerLevelInfo对象", description="用户级别信息表")
public class UserCustomerLevelInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "会员级别ID")
    @TableId(value = "customer_level", type = IdType.AUTO)
    private Integer customerLevel;

    @ApiModelProperty(value = "会员级别名称")
    private String levelName;

    @ApiModelProperty(value = "该级别最低积分")
    private Integer minPoint;

    @ApiModelProperty(value = "该级别最高积分")
    private Integer maxPoint;

    @ApiModelProperty(value = "最后修改时间")
    private Date modifiedTime;


}
