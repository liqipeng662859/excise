package sample;

/**绘制特殊的平行四边形
 * 李启鹏 2019.3.10
 */

 interface DramImage {      //定义画图形接口
     public void dram();    //定义抽象方法“画”
}
class Rectangle implements DramImage {  //矩形类实现dramTest接口

    @Override
    public void dram() {  //矩形类中实现dram（）方法
        System.out.println("画矩形");
    }
}
class Square implements DramImage {

    @Override
    public void dram() {   //正方形类中实现dram()方法
        System.out.println("画正方形");
    }
}
class Diamond implements DramImage {    //菱形类实现了dramTest接口

    @Override
    public void dram() {               //菱形类中实现了dram()方法
        System.out.println("画菱形");
    }
}
