package sample;

/**定义一个TaobaoMarket类
 * 李启鹏 2019.3.10
 */
public class TaobaoMarket extends  Market {
    @Override
    public void shop() {
        System.out.println(name + "网购" + goods);

    }
}
