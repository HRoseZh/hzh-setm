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
 * 订单主表
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="OrderMaster对象", description="订单主表")
public class OrderMaster implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "订单ID")
    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;

    @ApiModelProperty(value = "订单编号 yyyymmddnnnnnnnn")
    private Long orderSn;

    @ApiModelProperty(value = "下单人ID")
    private Integer customerId;

    @ApiModelProperty(value = "下单人姓名")
    private String shippingUser;

    @ApiModelProperty(value = "举办国")
    private Integer holdProvince;

    @ApiModelProperty(value = "举办地")
    private Integer holdCity;

    @ApiModelProperty(value = "举办主场方")
    private Integer holdDistrict;

    @ApiModelProperty(value = "举办场馆")
    private String holdCourt;

    @ApiModelProperty(value = "支付方式：1现金，2余额，3网银，4支付宝，5微信")
    private Integer paymentMethod;

    @ApiModelProperty(value = "订单金额")
    private BigDecimal orderMoney;

    @ApiModelProperty(value = "优惠金额")
    private BigDecimal districtMoney;

    @ApiModelProperty(value = "支付金额")
    private BigDecimal paymentMoney;

    @ApiModelProperty(value = "下单时间")
    private Date createTime;

    @ApiModelProperty(value = "支付时间")
    private Date payTime;

    @ApiModelProperty(value = "订单状态")
    private Integer orderStatus;

    @ApiModelProperty(value = "订单积分")
    private Integer orderPoint;

    @ApiModelProperty(value = "发票抬头")
    private String invoiceTime;

    @ApiModelProperty(value = "最后修改时间")
    private Date modifiedTime;


}
