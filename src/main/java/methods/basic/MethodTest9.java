package methods.basic;

//封装主方法里的方法 ， 封装核心的业务逻辑代码
public class MethodTest9 {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("调用主方法的n值 ：start方法调用前n的值：" + n);
        MethodTest9 test = new MethodTest9();
        test.add(n);
        System.out.println("调用主方法的n值 ：end方法调用后n的值：" + n);
    }

    public void add(int n) {
        n++;
        System.out.println("方法中的n：" + n);
    }
}


