package com.tensquare.sms.listener;

import com.aliyuncs.exceptions.ClientException;
import com.tensquare.sms.utils.SmsUtil;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author: Quan
 * @program: tensquare_parent
 * @description:
 * @create: 2019-04-14 16:10
 **/
@Component
@RabbitListener(queues = "sms")
public class SmsListener {

    @Autowired
    private SmsUtil smsUtil;

    @Value("${aliyun.sms.template_code}")
    private String template_code;//模板编号

    @Value("${aliyun.sms.sign_name}")
    private String sign_name;//签名
    /**
     * 发送短信
     * @param map
     */
    @RabbitHandler
    public void sendSms(Map<String,String> map){
        System.out.println("手机号："+map.get("mobile"));
        System.out.println("验证码："+map.get("checkCode"));
        System.out.println(template_code);
        System.out.println(sign_name);
        try {
            smsUtil.sendSms(map.get("mobile"),template_code,sign_name,"{\"checkCode\":\""+ map.get("checkCode") +"\"}");
            } catch (ClientException e) {
                e.printStackTrace();
            }
        }
}
