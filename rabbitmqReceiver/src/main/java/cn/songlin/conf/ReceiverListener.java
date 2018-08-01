package cn.songlin.conf;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

import cn.songlin.entity.UserLog;
import cn.songlin.mapper.UserLogMapper;

@Component
public class ReceiverListener {

	@Autowired
	private UserLogMapper userLogMapper;

	@RabbitListener(queues = "track") // 监听器监听访问记录
	public void userTrack(String userLog) {
		// 监听到消息
		System.out.println("开始处理访问记录");
		UserLog tracklog = JSONObject.parseObject(userLog, UserLog.class);
		userLogMapper.insertSelective(tracklog);
		System.out.println("处理访问记录结束");
	}

	@RabbitListener(queues = "message") // 监听器监听指定的Queue
	public void process(String str) {
		System.out.println("接收message:" + str);
	}
}
