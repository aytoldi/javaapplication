package methods.basic;

//数组作为方法参数的传值问题 , 参数传递问题
public class MethodTest10 {
    public static void main(String[] args) {
        MethodTest10 test = new MethodTest10();
        int[] arr = {10, 15, 20, 35, 144, 185};
        System.out.println("方法调用之前数组arr元素为：");
        for (int i : arr) {
            System.out.print("\t" + i);
        }
        System.out.println();//研究一下
        test.updateArray(arr);
    }

    //    定义一个用于修改某个数组元素值得方法
    public void updateArray(int[] arr) {
        arr[3] = 15;//修改数组索引下表等于3的元素
        System.out.println("输出数组修改后的值");
        for (int n : arr) {
            System.out.println(n + "\t");
        }
        System.out.println();
    }
}
