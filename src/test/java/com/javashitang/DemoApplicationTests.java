package com.javashitang;

import com.javashitang.strategy.MSG_TYPE;
import com.javashitang.strategy.MessageInfo;
import com.javashitang.strategy.MessageService;
import com.javashitang.strategy.MessageServiceContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    MessageServiceContext messageServiceContext;

    @Test
    public void contextLoads() {
        // 构建一个文本消息
        MessageInfo messageInfo = new MessageInfo(MSG_TYPE.TEXT.code, "消息内容");
        MessageService messageService = messageServiceContext.getMessageService(messageInfo.getType());
        // 处理文本消息 消息内容
        // 可以看到文本消息被文本处理类所处理
        messageService.handleMessage(messageInfo);
    }
}
