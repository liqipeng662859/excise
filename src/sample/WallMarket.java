package sample;

/**定义一个WallMarket类
 * 李启鹏 2019.3.10
 */

public class WallMarket extends Market {
    @Override
    public void shop() {
        System.out.println(name + "实体店购买" + goods);
    }
}
