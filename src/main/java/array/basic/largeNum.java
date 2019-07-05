package array.basic;

public class largeNum {
    public static void main(String[] args) {
        //查找数组当中的最大值
        int[] initNum = {32, 40, 45, 10, 15};
        int max = initNum[0];
        for (int i = 0; i < initNum.length; i++) {
            if (initNum[i] > max) {
                max = initNum[i];
            }
        }
        System.out.printf("" + max);
    }
}
