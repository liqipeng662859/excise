package sample;

public class SpecialParallelogram{
    public static void main(String[] args) {
        //接口也可以进行向上转型操作
        DramImage[] images = {new Rectangle(),new Square(),new Diamond()};
        //遍历“画图形”接口类型数组
        for (int i = 0; i < images.length; i++) {
            images[i].dram();                //调用dram()方法
        }
    }

}
