package altashna.java.computer2019623;

public class OnLoad {
    public static void main(String[] args) {
        Computer c = new Computer("apple", "block", "12562.50", "程序正在运行中");
        c.open();
        c.clsoe();
        c.stop();
    }
}

class Computer {
    String Name;
    String Color;
    String Price;
    String State;

    //初始化无参数状态  Computer c = new Compute();
    public Computer() {
        System.out.printf("");
    }

    //初始化有参数状态 Computer c = new Computer("apple","block","12562.50","程序正在运行中");
    public Computer(String Name, String Color, String Price, String State) {
        this.Name = Name;
        this.Color = Color;
        this.Price = Price;
        this.State = State;
    }

    void open() {
        System.out.printf("开启");
    }

    void clsoe() {
        System.out.printf("关闭");
    }

    void stop() {
        System.out.printf("睡觉");
    }
}