package cn.songlin.dto;

import cn.songlin.utils.StringUtils;

public class UserLoginDto {

	private String userName;

	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		// MD5加密
		return StringUtils.getMd5(password);
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
