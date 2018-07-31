package cn.songlin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.songlin.annotation.Monitor;
import cn.songlin.dto.UserAccountDto;
import cn.songlin.service.UserAaccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("userAccount")
@Api("用户管理")
public class UserAccountController {

	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private UserAaccountService userAaccountService;

	@PostMapping("register")
	@Monitor
	@ApiOperation(value = "用户注册")
	public ResponseEntity<Void> register(UserAccountDto userAccountDto) {
		userAaccountService.register(userAccountDto);
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
//
//	@PostMapping("login")
//	@Monitor
//	@ApiOperation(value = "用户登录")
//	public ResponseEntity<String> login(UserLoginDto userLoginDto) {
//		UserAccount userAccount = userAaccountService.login(userLoginDto);
//		if (userAccount != null) {// 登陆成功
//			// 写入缓存
//			HttpSession session = request.getSession();
//			session.setMaxInactiveInterval(120);// 设置30s
//			session.setAttribute("sessionId", userAccount);
//			return new ResponseEntity<>("1", HttpStatus.OK);
//		}
//		return new ResponseEntity<>("0", HttpStatus.OK);
//	}

}
