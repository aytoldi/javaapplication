package methods.phone;

//main 方法相似window.onlaod=function(){}
public class PhoneMain {
    //初始化
    public static void main(String args[]) {
        //返回值 Phone = 对象实例化 new Phone()
        Phone apple = new Phone();
        //初始化对象的值
        apple.name = "apple";
        apple.type = "x10";
        apple.color = "white";
        apple.price = 5000F;//5000F 等于 5000.0
        apple.call = "打电话";
        apple.stop = "断开";
        //调用对象的行为
        apple.showName();
        apple.showType();
        apple.showColor();
        apple.showPrice();
        apple.call();
        apple.stop();
        //获取返回值，无参数
        String get_info = apple.getIfo();
        System.out.println("get_info:" + get_info);
        //获取返回值，有参数函数
        int get_result = apple.getSum(100);
        System.out.printf("get_result:" + get_result);
    }
}

class Phone {
    String name;
    String type;
    String color;
    float price;
    String call;
    String stop;

    //初始化无参数状态
    public Phone(){
        System.out.printf("");
    }

    //各种按钮的功能
    void showName() {
        System.out.println("name:" + this.name);
    }

    //显示类型
    void showType() {
        System.out.println("type:" + this.type);
    }

    //显示颜色
    void showColor() {
        System.out.println("color:" + this.color);
    }

    //显示价格
    void showPrice() {
        System.out.println("price:" + this.price);
    }

    //打电话
    void call() {
        System.out.println("call:" + this.call);
    }

    //断开
    void stop() {
        System.out.println("stop:" + this.stop);
    }

    //获取信息
    String getIfo() {
        return this.name + "___:" + this.type + "___:" + this.color;
    }

    //计算行为，1到100的累加
    int getSum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

