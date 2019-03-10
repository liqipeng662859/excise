package sample;

/**定义一个GoShopping类
 * 李启鹏 2019.3.10
 */

public class GoShopping {
    public static void main(String[] args) {
        Market market  = new WallMarket();  //使用派生类对象创建抽象类对象
        market.name="沃尔玛";
        market.goods = "七匹狼西服";
        market.shop();
        market = new TaobaoMarket();      //使用派生类对象创建抽象类对象
        market.name = "淘宝";
        market.goods = "韩都衣舍花裙";
        market.shop();
    }
}
