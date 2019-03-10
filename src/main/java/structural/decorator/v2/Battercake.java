package structural.decorator.v2;

// 具体组件实现类
public class Battercake extends ABattercake {

    protected String getDesc() {
        return "煎饼";
    }

    protected int cost() {
        return 8;
    }
}
