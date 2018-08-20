package cn.songlin.conf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

import cn.songlin.entity.UserLog;
import cn.songlin.mapper.UserLogMapper;

@Component
public class ReceiverListener {
	private static final Logger logger = LoggerFactory.getLogger(ReceiverListener.class);
	@Autowired
	private UserLogMapper userLogMapper;

	@RabbitListener(queues = "track") // 监听器监听访问记录
	public void userTrack(String userLog) {
		// 监听到消息
		logger.info("开始处理访问记录");
		UserLog tracklog = JSONObject.parseObject(userLog, UserLog.class);
		userLogMapper.insertSelective(tracklog);
		logger.info("处理访问记录结束");
	}
}
