package aytoldi.calc;

//创建一个类模型，设计计算器的模型
public class Calc {
    //主函数 main methods , main entry methods
    public static void main(String args[]) {
        //主函数中创建一个类 yarn install --ignore-engines
        Calc initObj = new Calc();
        //调用类身体的行为
        int result = initObj.area(5, 9);
        System.out.println(result);
    }

    //创建一个Calc类的计算行为;
    public int area(int x, int y) {
        return x + y;
    }
}
