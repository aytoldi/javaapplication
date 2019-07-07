package list.set;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

/*
 *set基础知识
 * 用HashSet存储多个表示颜色的英文单词，并输出。
 * 单词包括：blue，red，black，white
 *
 * */

public class Test1 {
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
        //集合当中的字存储到迭代器中, iterator()返回的是一个Iterator对象，我们Iterator对象中获取对应的值
        Iterator newIt = createColor.iterator();
        //迭代器当中是否有元素
        while (newIt.hasNext()) {
            System.out.println(newIt.next() + "-");//读入下一个
        }
    }
}


