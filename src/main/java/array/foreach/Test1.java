package array.foreach;

/*增强型for循环基础知识*/
public class Test1 {
    public static void main(String[] args) {

        /*
         * 第一次arr[0]存储到变量n当中,进行输出
         * 第二次arr[1]存储到变量n当中，在输出
         * 第三次arr[2]存储到变量n当中，在输出
         * 第四次arr[3]存储到变量n当中，在输出
         * 循环把数组遍历一遍之后会终止
         * */

        int[] intArray = {50, 10, 30, 50, 60};
        //增强型for循环
        for (int n : intArray) {
            System.out.println("n:" + n);
        }

    }
}
