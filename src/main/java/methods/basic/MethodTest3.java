package methods.basic;
//第2章 方法类型
//求值最大值得方法
public class MethodTest3 {
    public static void main(String[] args) {
        MethodTest3 test = new MethodTest3();
        test.maxValue(5, 60);
    }

    //带参数无返回值方法
    public void maxValue(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("两个数:" + a + "和" + b + "\t最大值为：" + max);
    }
}
