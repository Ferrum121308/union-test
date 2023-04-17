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
	public CommonResult<String> handleBusinessException(BusinessException exception) {
		log.info("进入异常处理方法");
		log.error("业务异常：" + exception.getMsg());
		return CommonResult.failed(exception.getMsg());
	}

	@ExceptionHandler(RuntimeException.class)
	public CommonResult<String> handleRuntimeException(RuntimeException exception) {
		log.error("程序异常：" + exception.getMessage());
		return CommonResult.failed(exception.getMessage());
	}

	@ExceptionHandler(NullPointerException.class)
	public CommonResult<Void> handleNullPointerException(NullPointerException exception) {
		log.error("空指针异常：{}", exception.getMessage());
		return CommonResult.failed(exception.getMessage());
	}

}
