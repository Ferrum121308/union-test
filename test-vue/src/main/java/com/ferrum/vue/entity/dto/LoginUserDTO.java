package com.ferrum.vue.entity.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 描述：登录用户返回体
 * 创建时间： 2023/4/15 11:08
 *
 * @author th
 * @version 1.0
 */

@Data
public class LoginUserDTO implements Serializable {

	private String token;

}
