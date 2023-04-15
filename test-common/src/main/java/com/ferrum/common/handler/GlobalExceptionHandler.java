package com.ferrum.common.handler;

import com.ferrum.common.entity.CommonResult;
import com.ferrum.common.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 描述：全局异常拦截处理
 * 创建时间： 2023/4/15 10:01
 *
 * @author th
 * @version 1.0
 */

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(BusinessException.class)
	public CommonResult<Void> handleBusinessException(BusinessException e) {
		log.error("异常：" + e.getMsg());
		return CommonResult.failed(e.getMsg());
	}

}
