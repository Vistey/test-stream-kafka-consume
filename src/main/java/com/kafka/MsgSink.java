package com.kafka;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * Created by Sai on 2017/7/17. this 12:16
 */
@EnableBinding(testChannel.class)
public class MsgSink {

  //监听绑定的通道名
  @StreamListener(testChannel.testInputString)
  public void process(Pojo vote) {
    System.out.println(vote);
  }

}
