package list.set;

import java.util.Set;
import java.util.HashSet;

/*
 *
 * 用HashSet存储多个表示颜色的英文单词，并输出。
 * 单词包括：blue，red，black，white
 * */

public class onload {
    public static void main(String[] args) {
        /*
         * HashSet 是 Set 对象的构造器
         * */
        Set createColor = new HashSet();
        createColor.add("red");
        createColor.add("block");
        createColor.add("bloack");
        createColor.add("white");
        System.out.println("输出元素的内容-------------");
    }
}


