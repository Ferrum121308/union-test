package com.ferrum.vue.entity.vo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 描述：登录用户入参
 * 创建时间： 2023/4/15 11:09
 *
 * @author th
 * @version 1.0
 */

@Data
public class LoginUserVO implements Serializable {

	@NotBlank(message = "用户名不能为空")
	private String username;
	@NotBlank(message = "密码不能为空")
	@Length(min = 6, max = 16, message = "密码长度应在6~16位")
	private String password;

}
