package sample;

/**创建去工厂类
 * 李启鹏 2019.3.10
 */

public class GoFactory {
    public static void main(String[] args) {
        Factory factory = new CarFactory();
        factory.name = "汽车";
        factory.production();
        factory = new ShoeFactory();
        factory.name = "鞋子";
        factory.production();


    }
}
