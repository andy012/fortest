package study.basic.modifier;

/**
 * Created by andy on 05/03/2017.
 */


// Java访问限制修饰符
public class JavaModifierMain {

    public static void main(String[] args) {

        // 访问静态公有变量，不需要创建类JavaModifier的对象
        System.out.println(JavaModifier.say);
        // 访问公有非静态变量,需要先创建类JavaModifier的对象
        JavaModifier javaModifier = new JavaModifier("Tom");
        System.out.println(javaModifier.age);
        // 不能访问私有非静态变量
        // System.out.println(javaModifier.name);



    }

}
