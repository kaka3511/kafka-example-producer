package com.kaka.controller;

import com.alibaba.fastjson.JSONObject;
import com.kaka.config.KafkaProducerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: TODO
 * @Author fuwei
 * @Date Created in  2018/12/11 9:52
 */
@RestController
public class ProducerController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @GetMapping("/send/{msg}")
    public void send(@PathVariable("msg") String msg) {
        System.out.println(String.format("发送到：topic = {%s} 的消息 msg = {%s}", KafkaProducerConfig.topic, msg));
        kafkaTemplate.send(KafkaProducerConfig.topic, JSONObject.toJSONString(msg));
    }
}
