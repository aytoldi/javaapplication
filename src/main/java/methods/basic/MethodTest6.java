package methods.basic;

//第3章 数组作为方法参数
public class MethodTest6 {
    public static void main(String[] args) {
        MethodTest6 test = new MethodTest6();
        int[] arr = {50, 90, 120, 505, 500};
        boolean res = test.searchElement(arr, 50);
        //res.sout 编辑器输出方法 res.log
        if (res) {
            System.out.println("找到了" + res);
        } else {
            System.out.println("没找到" + res);
        }
    }

    //سانلار گوروپپىسى ئىچىدىن قىممەت ئىزدەپ تېپىش
    // اونكىسيەنىڭ پارامتىردا سانلار گوروپپىسى بولىدۇ ، يەنە ئىزدەيدىغان قىممەت بولىدۇ
    // اونكىيسەنىڭ قايتىلما جىممىتىگە نىسبەتەن ئېيىتسقاق . ئىزدەپ تاپالىدى  ياكى ئىزدەپ تاپامدى دەپ بولىدۇ ، يەنى قىممەت بار ياكى يوق
    // بۇنداق ئەھۋالغا ، سانلىق قىممەت تىپدىن بور تىپى ماس كېلىدۇ

    public boolean searchElement(int[] arr, int val) {
        //默认是没找到
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                flag = true;//找到了
                break;//循环结束 , 但是代码下面会执行 ， 如果用return false ， 代码下面不会执行
            }
        }
        return flag;
    }
}
