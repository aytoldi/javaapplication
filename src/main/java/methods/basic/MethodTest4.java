package methods.basic;
//第2章 方法类型
public class MethodTest4 {
    public static void main(String[] args) {
        MethodTest4 test = new MethodTest4();
        int result = test.factory(5);
        System.out.printf("5!" + result);
        //求!1+!2+!3+!4+!5
        for (int i = 1; i < 5; i++) {
            result = test.factory(i);
        }
        System.out.printf("结构：" + result);
    }

    //根据参数值，遍历循环几次，然后循环计算出来的值返回外面出去
    public int factory(int n) {
        int s = 1;
        for (int i = 1; i < n; i++) {
            s = s * i;
        }
        return s;
    }
}
