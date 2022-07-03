package com.javashitang.strategy;

import org.springframework.stereotype.Service;

@Service
@MsgTypeHandler(value = MsgTypeEnum.IMAGE)
public class ImageMessageStrategy implements MessageStrategy {

    @Override
    public void handleMessage(MessageInfo messageInfo) {
        System.out.println("处理图片消息 " + messageInfo.getContent());
    }
}
