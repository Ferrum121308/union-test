package com.ferrum.vue.controller;

import cn.hutool.core.util.RandomUtil;
import com.ferrum.common.constant.SystemConstant;
import com.ferrum.common.entity.CommonResult;
import com.ferrum.common.exception.BusinessException;
import com.ferrum.vue.entity.dto.LoginUserDTO;
import com.ferrum.vue.entity.vo.LoginUserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：登录接口
 * 创建时间： 2023/4/15 11:07
 *
 * @author th
 * @version 1.0
 */

@Slf4j
@RestController
public class LoginController {

	@CrossOrigin
	@PostMapping("/login")
	public CommonResult<LoginUserDTO> login(@Validated @RequestBody LoginUserVO user) {
		LoginUserDTO userInfo = new LoginUserDTO();
		if (user.getUsername().equals("111")) {
			throw new BusinessException("测试错误返回");
		}
		log.info(SystemConstant.LOG_PREFIX + "接收参数：{}", user);
		userInfo.setToken(RandomUtil.randomString(18));
		return CommonResult.success(userInfo);
	}

}
