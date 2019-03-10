package structural.decorator.v2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {
        ABattercake aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        // 煎饼 加一个鸡蛋 加一个鸡蛋 加一根香肠 销售价格为: 12
        System.out.println(aBattercake.getDesc() + " 销售价格为: " + aBattercake.cost());

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("D:/test.txt")));
    }
}
