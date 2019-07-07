package methods.basic;

//第3章 数组作为方法参数
public class MethodTest5 {
    public static void main(String[] args) {
        MethodTest5 test = new MethodTest5();
        int[] arr = {5,8,12,15,20};
        test.iniArray(arr);
    }

    public void iniArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + "\t");
        }
    }
}
