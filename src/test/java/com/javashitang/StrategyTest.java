package com.javashitang;

import com.javashitang.strategy.simple.MsgService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

/**
 * @author lilimin
 * @since 2020-08-08
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyTest {

    /**
     * 启动后map中的元素为beanName->MsgService对应的实现类
     * imageMsgService -> ImageMsgService
     * textMsgService -> TextMsgService
     */
    @Autowired
    private Map<String, MsgService> handlerMap;

    /**
     * 测试输出
     * handler image
     */
    @Test
    public void test() {
        String msgType = "image";
        if (msgType.equals("image")) {
            handlerMap.get("imageMsgService").handleMessage();
        } else if (msgType.equals("text")) {
            handlerMap.get("textMsgService").handleMessage();
        }
    }
}
