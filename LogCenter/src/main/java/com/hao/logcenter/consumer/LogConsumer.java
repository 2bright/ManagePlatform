package com.hao.logcenter.consumer;

import com.hao.commonmodel.log.Log;
import com.hao.commonmodel.log.constants.LogQueue;
import com.hao.logcenter.service.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 从mq队列消费日志数据
 */
@Component
@RabbitListener(queues = LogQueue.LOG_QUEUE) // 监听队列
public class LogConsumer {

	private static final Logger logger = LoggerFactory.getLogger(LogConsumer.class);

	@Autowired
	private LogService logService;

	/**
	 * 处理消息
	 *
	 * @param log
	 */
	@RabbitHandler
	public void logHandler(Log log) {
		try {
			logService.save(log);
		} catch (Exception e) {
			logger.error("保存日志失败，日志：{}，异常：{}", log, e);
		}

	}
}
