package methods.basic;

//第4章 方法重载 , 方法名相同，参数列表不同
public class MethodTest7 {
    public static void main(String[] args) {
        MethodTest7 test = new MethodTest7();

        int a = 1;
        int b = 2;
        int c = test.plus(a, b);
        System.out.println("int 类型的方法：" + c);

        double i = 5.0;
        double j = 8.0;
        double k = test.plus(i, j);
        System.out.println("double类型的方法：" + k);

        int[] arr = {5, 8, 12, 14, 16};
        int result = test.plus(arr);
        System.out.println("int类型的数组方法：" + result);

    }

    //求int类型两个数的和
    public int plus(int x, int y) {
        return x + y;
    }

    //求double类型两个数的和
    public double plus(double x, double y) {
        return x + y;
    }

    //求数组元素的累加和
    public int plus(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
