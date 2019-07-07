package array.basic;

//遍历二维数组
public class ArrayDemo5 {
    public static void main(String[] args) {
        int[][] intArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//创建三行三列的二维数组
        System.out.println("第一行第二列的元素：" + intArray[0][1]);
        System.out.println("intArray 数组的行数为：" + intArray.length);
        System.out.println("intArray 数组的列数为：" + intArray[0].length);
        System.out.println("循环输出二维数组的内容：");
        for (int i = 0; i < intArray.length; i++) {//行的长度 قۇرنىڭ ئۇزۇنلىقى
            for (int j = 0; j < intArray[i].length; j++) {//列的长度 سىتون كاتەكچىنىڭ ئۇزۇنلۇقى
                System.out.printf("第:" + i + "行" + "_第" + j + "列的元素为:" + intArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
