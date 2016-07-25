package demo.kotlincdemo;

/**
 * Created by dumh on 16/6/18.
 */
public class DemoInJava {
    public void foo() {
        System.out.println("DemoInJava");
//        new DemoKt();
        DemoKt.foo();
    }

    public static void main(String[] args) {
        new DemoInJava().foo();
    }
}
