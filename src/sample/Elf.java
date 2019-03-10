package sample;

/**创建精灵接口
 * 李启鹏 2019.3.10
 */

public class Elf implements Move,Sing {

    @Override
    public void shift() {
        System.out.println("可移动");
    }

    @Override
    public void singsongs() {
        System.out.println("可唱歌");
    }


    public static void main(String[] args) {
        Elf elf = new Elf();
        System.out.println("精灵的爱好：");
        elf.shift();
        elf.singsongs();
    }
}
