package com.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 这是一个kafka的消费端，通道需要与topic名字相绑定
 *
 * 绑定属性使用格式spring.cloud.stream.bindings.<channelName>.<property>=<value>提供
 * <channelName>表示正在配置的通道的名称（例如Source的output）
 * <property> = destination: topicName
 */
@SpringBootApplication
public class TmpKafkaConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmpKafkaConsumeApplication.class, args);
	}
}
