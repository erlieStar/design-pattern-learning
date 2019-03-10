package structural.decorator.v1;

public class Test {

    public static void main(String[] args) {

        Battercake battercake = new Battercake();
        // 煎饼 销售价格:8
        System.out.println(battercake.getDesc() + " 销售价格:" + battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        // 煎饼 加一个鸡蛋 销售价格:9
        System.out.println(battercakeWithEgg.getDesc() + " 销售价格:" + battercakeWithEgg.cost());

        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        // 煎饼 加一个鸡蛋 加一根香肠 销售价格:11
        System.out.println(battercakeWithEggSausage.getDesc() + " 销售价格:" + battercakeWithEggSausage.cost());

    }
}
