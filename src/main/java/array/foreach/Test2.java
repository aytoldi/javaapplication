package array.foreach;

/*
 * 冒泡排序
 * 对一组整数按照由小到大的顺序进行排序
 * */

public class Test2 {
    public static void main(String[] args) {
        int[] intArray = {34, 53, 12, 32, 56, 17};
        System.out.println("排序前的数组元素：");
        for (int n : intArray) {
            System.out.printf(n + ",");
        }
        System.out.println("排序后的数组元素：");
        int temp;
        // 有多少个元素，排多少, 数组长度6个，但是我们现在比较5次，由于索引从0开始的，所以减去-1
        for (int i = 0; i < intArray.length - 1; i++) {
            // 内重循环控制每趟排序,进行比较操作
            for (int j = 0; j < intArray.length - i - 1; j++) {
                // 去找出每一趟排序的最大值,每一趟排序结束之后，最后的不用比较,所以减去-i
                // 如果前面的值后面的值比大
                if (intArray[j] > intArray[j + 1]) {
                    // 最大值存储到 内存中的temp变量
                    temp = intArray[j];
                    // 最小值赋值给前面,设置了最小值
                    intArray[j] = intArray[j + 1];
                    // 后面的值拿到内存中的临时变量的，这个值程序每次刷新的时候重新初始化
                    intArray[j + 1] = temp;
                    //每次最大值放到数组的末尾
                }
            }
        }

        //排序后的值
        for (int k : intArray) {
            System.out.printf(k + ",");
        }
    }
}


