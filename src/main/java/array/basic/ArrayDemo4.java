package array.basic;

//二维数组
public class ArrayDemo4 {
    public static void main(String[] args) {
        //声明int 整形类型的二维数组
        int[][] intArray;
        float[][] floatArray;//声明float类型的二维数组
        double[][] doubleArary;//声明double类型的二维数组
        //创建二维数组
        intArray = new int[3][3];//三行三列的二维数组 ئۈچ قۇر . ئۈچ سىتون كاتەكچىدىن تەشكىل تاپقان سانلا گوروپپىسى
        // سانلار گوروپپىسى 0 چى ئېندىكىستىن باشلىنتى، شوڭا بىرىنچى قۇر ۋە بىرىنچى سىتون كاتەكچە 0 دىن باشلىندۇ
        intArray[0][0] = 9;
        intArray[0][1] = 16;
        intArray[0][2] = 5;
        System.out.printf("第一行第二例的元素：" + intArray[0][1]);
        // ئىككىنچى قۇر
        intArray[1][0] = 2;
        intArray[1][1] = 4;
        intArray[1][2] = 7;
        System.out.printf("第二行第一例的元素：" + intArray[1][0]);
        // ئۈچىنچى قۇر
        intArray[2][0] = 40;
        intArray[2][1] = 25;
        intArray[2][2] = 19;
        System.out.printf("第三行第三例的元素：" + intArray[2][2]);
    }
}
