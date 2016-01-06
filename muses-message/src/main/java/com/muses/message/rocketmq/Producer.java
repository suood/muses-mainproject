package com.muses.message.rocketmq;


import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.muses.logger.LoggerUtil;

/**
 * Created by Alexander on 15/12/7.
 */
public class Producer {
    public static void main(String[] args){
        DefaultMQProducer producer = new DefaultMQProducer("Producer");
        producer.setNamesrvAddr("123.57.206.88:9876");
        try {
            producer.start();

            for (int i = 0; i < 10000000; i++) {


              Message msg = new Message("PushTopic",
                      "push",
                      ""+i,
                      "Just for test.".getBytes());

              SendResult result = producer.send(msg);
//              System.out.println("id:" + result.getMsgId() +
//                      " result:" + result.getSendStatus());
//
//              msg = new Message("PushTopic",
//                      "push",
//                      ""+i,
//                      "Just for test.".getBytes());
//
//              result = producer.send(msg);
//              System.out.println("id:" + result.getMsgId() +
//                      " result:" + result.getSendStatus());
//
//              msg = new Message("PullTopic",
//                      "pull",
//                      "1",
//                      "Just for test.".getBytes());
//
//              result = producer.send(msg);
              LoggerUtil.messageLog("id:" + result.getMsgId() +
                      " result:" + result.getSendStatus());
          }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            producer.shutdown();
        }
    }
}
