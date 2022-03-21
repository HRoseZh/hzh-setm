package com.hzh.common.pojo.vo;

import com.hzh.common.enums.ResultEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

/**
 * 表现层对象
 *
 * @author Hou Zhonghu
 * @since 2022/3/20 19:31
 */
@Data
@ApiModel
@NoArgsConstructor //使用FeignClient时必须要用无参构造
public class ResultVO<T> {
    @ApiModelProperty("响应码")
    private String code;
    @ApiModelProperty("响应信息")
    private String msg;
    @ApiModelProperty("响应数据")
    private T data;

    // 构造
    public ResultVO(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }
    // 构造
    public ResultVO(ResultEnum resultEnum,T data) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
        this.data = data;
    }

    // 成功响应（无响应体）
    public static <T> ResultVO<T> ok() {
        return new ResultVO<T>(ResultEnum.SUCCESS);
    }

    // 成功响应（有响应体）
    public static <T> ResultVO<T> ok(@NonNull T data) {
        return new ResultVO<T>(ResultEnum.SUCCESS, data);
    }

    // 其他响应（无响应体）
    public static <T> ResultVO<T> status(ResultEnum resultEnum) {
        return new ResultVO<T>(resultEnum);
    }

    // 其他响应（有响应体）
    public static <T> ResultVO<T> status(ResultEnum resultEnum,@NonNull T data) {
        return new ResultVO<T>(resultEnum, data);
    }

}