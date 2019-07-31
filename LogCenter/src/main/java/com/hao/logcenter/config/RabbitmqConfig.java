package com.hao.logcenter.config;

import com.hao.commonmodel.Model.Log.constants.LogQueue;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * rabbitmq配置
 * 
 * @author 小威老师
 *
 */
@Configuration
public class RabbitmqConfig {

	/**
	 * 声明队列
	 * 
	 * @return
	 */
	@Bean
	public Queue logQueue() {
		Queue queue = new Queue(LogQueue.LOG_QUEUE);

		return queue;
	}
}