package com.javashitang;

import com.javashitang.strategy.MsgTypeEnum;
import com.javashitang.strategy.MessageInfo;
import com.javashitang.strategy.MessageStrategy;
import com.javashitang.strategy.MsgTypeHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    private Map<MsgTypeEnum, MessageStrategy> messageStrategyMap;

    @Resource
    private void setRoleMenuMap(List<MessageStrategy> messageStrategies) {
        messageStrategyMap = messageStrategies.stream().collect(
                Collectors.toMap(item -> AnnotationUtils.findAnnotation(item.getClass(), MsgTypeHandler.class).value(), v -> v));
    }

    @Test
    public void contextLoads() {
        MessageInfo messageInfo = new MessageInfo(MsgTypeEnum.TEXT, "这是一个文本消息");
        MessageStrategy messageStrategy = messageStrategyMap.get(messageInfo.getType());
        // 处理文本消息 这是一个文本消息
        messageStrategy.handleMessage(messageInfo);
    }

    @Test
    public void test2() {
        MessageInfo messageInfo = new MessageInfo(MsgTypeEnum.IMAGE, "这是一个图片消息");
        MessageStrategy messageStrategy = messageStrategyMap.get(messageInfo.getType());
        // 处理图片消息 这是一个图片消息
        messageStrategy.handleMessage(messageInfo);
    }
}
