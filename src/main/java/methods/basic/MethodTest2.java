package methods.basic;
//第2章 方法类型
//求长方形的面积
public class MethodTest2 {
    public static void main(String[] args) {
        MethodTest2 test = new MethodTest2();
        int result = test.area();
        System.out.printf("result:" + result);
    }

    //无参数带返回值方法， 长方形面积的方法
    public int area() {
        int length = 5;
        int width = 5;
        int getArea = length * width;
        return getArea;
    }
}
