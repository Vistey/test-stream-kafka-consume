package com.kafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * 测试用通道，用于自定义通道
 */
public interface testChannel {

  //用于定义通道名字 application.yml中的bindings：testInputString （）这里的testInputString就是通道名
  String testInputString = "testInputString";

  @Input(testChannel.testInputString)
  SubscribableChannel testInput();

}
