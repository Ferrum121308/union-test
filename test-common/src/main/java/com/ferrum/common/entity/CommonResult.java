package com.ferrum.common.entity;

import com.ferrum.common.enums.ResultCodeEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述：统一返回体
 * 创建时间： 2023/4/14 17:30
 *
 * @author th
 * @version 1.0
 */

@Data
@NoArgsConstructor
public class CommonResult<T> {

	private Integer code;
	private String message;
	private T data;
	private Long timestamp = System.currentTimeMillis();

	public CommonResult(ResultCodeEnum resultCode) {
		this.code = resultCode.code();
		this.message = resultCode.msg();
	}

	public static <T> CommonResult<T> success() {
		return new CommonResult<>(ResultCodeEnum.SUCCESS);
	}

	public static <T> CommonResult<T> success(String msg) {
		CommonResult<T> result = new CommonResult<>();
		result.setCode(ResultCodeEnum.SUCCESS.code());
		result.setMessage(msg);
		return result;
	}

	public static <T> CommonResult<T> success(T data) {
		CommonResult<T> result = new CommonResult<>(ResultCodeEnum.SUCCESS);
		result.setData(data);
		return result;
	}

	public static <T> CommonResult<T> success(String msg, T data) {
		CommonResult<T> result = new CommonResult<>();
		result.setCode(ResultCodeEnum.SUCCESS.code());
		result.setMessage(msg);
		result.setData(data);
		return result;
	}

	public static <T> CommonResult<T> failed() {
		return new CommonResult<>(ResultCodeEnum.FAILED);
	}

	public static <T> CommonResult<T> failed(String msg) {
		CommonResult<T> result = new CommonResult<>();
		result.setCode(ResultCodeEnum.FAILED.code());
		result.setMessage(msg);
		return result;
	}

	public static <T> CommonResult<T> failed(ResultCodeEnum resultCode) {
		return new CommonResult<>(resultCode);
	}

}
