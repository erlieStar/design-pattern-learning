package com.javashitang.strategy.simple;

import org.springframework.stereotype.Service;

/**
 * @author lilimin
 * @since 2020-08-08
 */
@Service
public class ImageMsgService implements MsgService {
    @Override
    public void handleMessage() {
        System.out.println("handler image");
    }
}
