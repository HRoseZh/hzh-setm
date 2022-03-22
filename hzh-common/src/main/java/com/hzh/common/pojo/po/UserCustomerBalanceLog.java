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
 * 用户余额变动表
 * </p>
 *
 * @author Hzh
 * @since 2022-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserCustomerBalanceLog对象", description="用户余额变动表")
public class UserCustomerBalanceLog implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "余额日志ID")
    @TableId(value = "balance_id", type = IdType.AUTO)
    private Integer balanceId;

    @ApiModelProperty(value = "用户ID")
    private Integer customerId;

    @ApiModelProperty(value = "记录来源：1订单，2退货单")
    private Integer source;

    @ApiModelProperty(value = "相关单据ID")
    private Integer sourceSn;

    @ApiModelProperty(value = "记录生成时间")
    private Date createTime;

    @ApiModelProperty(value = "变动金额")
    private BigDecimal amount;


}
