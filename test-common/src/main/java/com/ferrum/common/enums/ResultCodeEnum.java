package com.ferrum.common.enums;

/**
 * 描述：结果枚举
 * 创建时间： 2023/4/14 17:38
 *
 * @author th
 * @version 1.0
 */
public enum ResultCodeEnum {

	SUCCESS(0, "请求成功"),
	FAILED(-1, "请求失败"),
	;

	private final Integer code;
	private final String msg;

	ResultCodeEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer code() {
		return code;
	}

	public String msg() {
		return msg;
	}

}
