package cn.songlin.mapper;

import org.apache.ibatis.annotations.Param;

import cn.songlin.entity.UserAccount;
import tk.mybatis.mapper.common.BaseMapper;

public interface UserAccountMapper extends BaseMapper<UserAccount> {
	
	/**
	* 检查用户名是否存在
	* @author liusonglin
	* @date 2018年7月30日
	* @return
	*/
		
	int checkUserName(@Param("name")String name);
}