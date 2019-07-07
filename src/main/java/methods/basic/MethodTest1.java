package methods.basic;

//第2章 方法类型
public class MethodTest1 {
    //无参数无返回值方法
    public void printInfo() {
        System.out.printf("输出头信息");
    }

    public static void main(String[] args) {
        MethodTest1 test = new MethodTest1();
        test.printInfo();//调用类当中的方法
        System.out.printf("Hello , world");
    }
}
