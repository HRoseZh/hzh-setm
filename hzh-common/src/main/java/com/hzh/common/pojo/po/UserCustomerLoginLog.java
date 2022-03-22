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
 * 用户登陆日志表
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserCustomerLoginLog对象", description="用户登陆日志表")
public class UserCustomerLoginLog implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "登陆日志ID")
    @TableId(value = "login_id", type = IdType.AUTO)
    private Integer loginId;

    @ApiModelProperty(value = "登陆用户ID")
    private Integer customerId;

    @ApiModelProperty(value = "用户登陆时间")
    private Date loginTime;

    @ApiModelProperty(value = "登陆IP")
    private String loginIp;

    @ApiModelProperty(value = "登陆类型：0未成功，1成功")
    private Integer loginType;


}
