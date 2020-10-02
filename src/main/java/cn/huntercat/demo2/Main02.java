package cn.huntercat.demo2;

/**
 * 案例 2 对象和类
 * <p>
 * Java中的对象
 * 多态、继承、封装、抽象、类、对象、实例、方法、重载
 * <p>
 * Java 中的类
 * 局部变量：在方法、构造方法或者语句块中定义的变量被称为局部变量。变量声明和初始化都是在方法中，方法结束后，变量就会自动销毁。
 * 成员变量：成员变量是定义在类中，方法体之外的变量。这种变量在创建对象的时候实例化。成员变量可以被类中方法、构造方法和特定类的语句块访问。
 * 类变量：类变量也声明在类中，方法体之外，但必须声明为 static 类型。
 * <p>
 * 构造方法
 * <p>
 * 创建对象
 * <p>
 * 访问实例变量和方法
 * <p>
 * 源文件声明规则
 */
public class Main02 {


    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.breed = "Hello";
        System.out.println(dog.breed);
    }

    /**
     * 这是一个类
     */
    static class Dog {

        String breed;
        int age;
        String color;

        void barking() {
        }

        void hungry() {
        }

        void sleeping() {
        }
    }

}
