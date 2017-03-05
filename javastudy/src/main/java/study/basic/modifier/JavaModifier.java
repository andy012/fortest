package study.basic.modifier;

/**
 * Created by andy on 05/03/2017.
 */


// Java访问限制修饰符
public class JavaModifier {

    // private :私有,内部访问
    private String name ;
    // public: 公有,外部可以访问
    public int age ;
    // static： 静态变量，不需创建对象就可以访问
    public static String say = "Hello World";
    public JavaModifier(String name) {
        this.name = name;
    }
    // public: 公有,都可以访问
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
