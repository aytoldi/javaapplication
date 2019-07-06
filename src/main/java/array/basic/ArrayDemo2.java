package array.basic;

//数组中查找最大值
public class ArrayDemo2 {
    public static void main(String[] args) {
        //查找数组当中的最大值
        int[] initNum = {32, 40, 45, 10, 15};
        int max = initNum[0];//假设第一个值最大
        for (int i = 0; i < initNum.length; i++) {
            if (initNum[i] > max) {
                max = initNum[i];
            }
        }
        System.out.printf("" + max);
    }
}
