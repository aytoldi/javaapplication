package array.basic;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        //定义一个整形类型的额数组
        int[] intArray = new int[5];
        Scanner input = new Scanner(System.in);
        //从键盘接受数据，为数组元素赋值
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("请输入" + (i + 1) + "第几个元素");
            int getNum = input.nextInt();
            intArray[i] = getNum;
        }
        //数组元素的内容
        int sum = 0;
        for (int j = 0; j < intArray.length; j++) {
            sum += intArray[j];
        }
        System.out.printf("" + sum);
    }
}
