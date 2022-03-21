package com.hzh.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 响应枚举
 * @author: Hou Zhonghu
 * @createTime: 2021/10/20
 */
@Getter
@AllArgsConstructor
public enum ResultEnum {

    SUCCESS("AAAAAA", "操作成功"),
    INNER_EXCEPTION("EI0000", "系统内部异常！"),
    VALIDATE_ERROR("EV0001", "参数校验出错！"),
    SYSTEM_ERROR_NULL_HOST("ES0004","当前系统下没有主机"),


    PERIOD_WAS_USED("PU0000","该时间方案被占用"),
    PERIOD_NOT_USED("PU0001","该时间方案未被占用"),


    SERVER_FEIGN_FUSING("SFF000", "服务调用发生熔断！"),
    SCHEDULER_SS_EXCEPTION("ESS000", "调度器启停异常！"),
    JSS_BATCH_DATE_UNDEFINED("PUP000","调度平台批量日期未定义！"),
    JSS_JOBFLOW_CONF_UNDEFINED("PUJ000","调度平台作业流程未定义！"),
    JSS_JOBFLOW_UNABLE_REDO("UR0000","调度平台作业流程不能重做！"),
    JSS_JOBFLOW_UNABLE_CONCURRENT("UC0000","调度平台作业流程不能多实例！"),
    JSS_JOB_STATE_UNABLE_MANAGE("JSUM00", "JOB状态不能够进行管理！"),
    EXECUTOR_THREAD_POOL_REJECTED("ETPR00","执行器线程池拒绝线程入池！"),
    UPDATE_STATE_ERROR("EU0001","启用/停用更新失败！"),

    //参数为空
    PARAMETER_EMPTY("EP0001","参数为空");


    private String code;
    private String msg;

}
