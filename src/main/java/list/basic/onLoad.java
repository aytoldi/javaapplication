package list.basic;

import java.util.ArrayList;

public class onLoad {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //添加
        list.add("Java");
        list.add("c++");
        list.add("go");
        list.add("python");
        //查看大小
        System.out.println("size:" + list.size());
        System.out.println("********************");
        //根据index获取索引, 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i:" + list.get(i));
        }
        list.remove(2);
        System.out.println("********************");
        System.out.printf("size:" + list.size());
    }
}

