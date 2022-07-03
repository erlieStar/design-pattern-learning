package com.javashitang.strategy;

import org.springframework.stereotype.Service;

@Service
@MsgTypeHandler(value = MsgTypeEnum.TEXT)
public class TextMessageStrategy implements MessageStrategy {

    @Override
    public void handleMessage(MessageInfo messageInfo) {
        System.out.println("处理文本消息 " + messageInfo.getContent());
    }
}
