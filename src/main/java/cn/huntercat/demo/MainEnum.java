package cn.huntercat.demo;

public class MainEnum {
    public static void main(String[] args) {
        // 输出枚举类
        System.out.println(Color.RED);
        // 迭代枚举类
        for (Color color : Color.values()) {
            System.out.print(color);
            // 返回枚举索引
            System.out.println(color.ordinal());
        }
        // 返回指定字符串值的枚举常量
        System.out.println(Color.valueOf("BLUE").ordinal() + "," +
                Color.valueOf("RED").ordinal() + "," +
                Color.valueOf("BLACK").ordinal()
        );
    }
}
