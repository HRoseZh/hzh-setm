package com.hzh.common.pojo.po;

import java.math.BigDecimal;
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
 * 用户信息表
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserCustomerInfo对象", description="用户信息表")
public class UserCustomerInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增主键ID")
    @TableId(value = "customer_info_id", type = IdType.AUTO)
    private Integer customerInfoId;

    @ApiModelProperty(value = "customer_login表的自增ID")
    private Integer customerId;

    @ApiModelProperty(value = "用户真实姓名")
    private String customerName;

    @ApiModelProperty(value = "证件类型：1 身份证，2 军官证，3 护照")
    private Integer identityCardType;

    @ApiModelProperty(value = "证件号码")
    private String identityCardNo;

    @ApiModelProperty(value = "手机号")
    private String mobilePhone;

    @ApiModelProperty(value = "邮箱")
    private String customerEmail;

    @ApiModelProperty(value = "性别")
    private String gender;

    @ApiModelProperty(value = "用户积分")
    private Integer userPoint;

    @ApiModelProperty(value = "注册时间")
    private Date registerTime;

    @ApiModelProperty(value = "会员生日")
    private Date birthday;

    @ApiModelProperty(value = "会员级别：1 普通会员，2 青铜，3白银，4黄金，5钻石")
    private Integer customerLevel;

    @ApiModelProperty(value = "用户余额")
    private BigDecimal userMoney;

    @ApiModelProperty(value = "最后修改时间")
    private Date modifiedTime;

    @ApiModelProperty(value = "用户状态 1 正常 2 被锁定  3黑名单")
    private Integer userState;


}
