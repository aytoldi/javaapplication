package methods.basic;

//第4章 方法重载
public class MethodTest8 {
    public static void main(String[] args) {
        MethodTest8 test = new MethodTest8();
        //主方法必须是对象的名字进行调用类里面的方法
        // ئاساسىي ئۇسۇلدا تۈرنىڭ ئىچدىكى ئۇسۇلنى ئىشلەتكەندە ، ئاۋال تۈرنى قۇرۇپ ئاندىن ئىشلىتمىز
        int a = 5;
        int b = 8;
        test.swap(a, b);
        test.swapTest();
    }

    //交换两个变量的值，قىممەت ئالماشتۇرۇش نىمە دىگەن گگپ دىگەندە ، ئىككى ئۆزگەرگۈچى مىقدارنىڭ قىممىتنى بر بىرىگە ئالماشتۇرۇشنى كۆرسىتىدۇ.
    public void swap(int x, int y) {
        System.out.println("交换前————"+"x的值：" + x + "\t y的值：" + y);
        //ئىچكى ساقلىغۇچقا ۋاقىتلىق بىردانە ئۆزگەرگۈچى مىقدار ئېنىقلاپ ، ئۇنىڭغا قىممەتنى ساقلايمىز
        int temp = 0;
        temp = x;
        x = y;
        y = temp;
        System.out.println("交换后————"+"x的值：" + x + "\t y的值：" + y);
    }

    //普通的方法里面调用其他方法
    public void swapTest(){
        //如果当前方法一个类当中的话，直接调用方法可以了
        int a=20;int b=40;
        swap(a,b);
    }
}
