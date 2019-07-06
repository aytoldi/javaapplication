package array.basic;

/*数组入门*/
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] intArray;//声明一个整形类型的数组
        String[] stringArray;//声明一个字符类型串数组
        float[] floatArray;//声明一个浮点值类型数组
        intArray = new int[5];//长度为5的整形类型的数组
        stringArray = new String[10];//长度为10的字符串类型的数组
        floatArray = new float[20];//长度为20的浮点值类型的数组
        char[] charArray = {'a', 'b', 'c', 'd'};//声明单个字符值类型的数组

        for (int i=0;i<5;i++){
            intArray[i]=i+1;
        }

        for (int i=0;i<5;i++){
            System.out.println(intArray[i]);
        }

    }
}
