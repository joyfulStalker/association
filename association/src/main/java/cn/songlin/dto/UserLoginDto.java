package cn.songlin.dto;

import cn.songlin.utils.StringUtils;

public class UserLoginDto {

	private String name;
	
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		//MD5加密
		return StringUtils.getMd5(password);
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
