package list.set;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        Cat HUAHUA = new Cat(0, "花花", 12, "英国短毛猫");
        Cat FANFAN = new Cat(1, "凡凡", 5, "美国短毛猫");
        //泛型是检测类型，设置类型限制,  集合当中与迭代器当中添加的数据都是Cat类型实例对象, 考虑安全
        Set<Cat> createObj = new HashSet<Cat>();
        createObj.add(HUAHUA);
        createObj.add(FANFAN);
        //遍历的时候使用迭代器, 显示猫的信息
        Iterator<Cat> createIt = createObj.iterator();
        while (createIt.hasNext()) {
            System.out.println(createIt.next());
        }

        //再添加一个与花花属性一样的猫
        Cat HUAHUA01 = new Cat(0, "花花", 12, "英国短毛猫");
        createObj.add(HUAHUA01);
        System.out.println("判断集合中对象，找到对象**********************");
        createIt = createObj.iterator();//重新获取迭代器，重新实例化
        while (createIt.hasNext()) {
            System.out.println(createIt.next());
        }

        //再集合中查找花花的信息并输出，根据名字查找，根据id查找

        //花花对象是否存在 , 集合当中是否存在花花的对象
        if (createObj.contains(HUAHUA)) {
            System.out.println("集合中找到了花花");
            System.out.println(HUAHUA);
        } else {
            System.out.println("花花没找到");
        }
        System.out.println("根据对象值判断，当前对象是否存在**********************");
        createIt = createObj.iterator();//重新获取迭代器，重新实例化
        boolean flag = false;
        Cat INFO = null; //全局下定义花花的信息
        //再集合中根据名字查找花花的信息
        while (createIt.hasNext()) {
            //通过next方法得到的是Object类型的对象
            INFO = (Cat) createIt.next(); //c中有花花的信息 ， 所以全局下定义 Cat info
            //判断名字
            if (INFO.getName().equals("花花")) {
                //输出花花的信息
                flag = true;//找到了 , 没找到flag=false
                break;//如果找到了花花，循环不要继续进行下去了
            }
        }

        if (flag) {
            System.out.println("花花找到了");
            System.out.println(INFO);
        } else {
            System.out.println("花花没找到了");
        }

        System.out.println("添加花花二代的信息**********************");
        Cat HUAHUA02 = new Cat(3, "花花二代", 16, "英国短毛猫二代");
        createObj.add(HUAHUA02);
        System.out.println("判断集合中对象，找到对象**********************");
        createIt = createObj.iterator();//重新获取迭代器，重新实例化
        while (createIt.hasNext()) {
            System.out.println(createIt.next());
        }
        System.out.println("删除元素**********************");

    }
}

class Cat {
    private int id;
    private String name;
    private int month;
    private String desc;

    public Cat(int id, String name, int month, String desc) {
        this.id = id;
        this.name = name;
        this.month = month;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", month=" + month +
                ", desc='" + desc + '\'' +
                '}';
    }
}