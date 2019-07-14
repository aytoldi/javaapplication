package oop.Demo1;

public class Demo1 {
    public static void main(String[] args) {
        /*
         * 学校开始了一个专业，计算机科学与应用专业，专业的编号j0001，学制4年；
         * 现在三个学生报名学习这个专业
         * 面向对象的思想实现这样的场景
         * */

        /*
         * 写代码之前分析场景：
         * 计算机科学与应用是一个对象 （属性：编号，学制）
         * 学生是一个对象（属性：学生id，姓名，性别，学号）
         * */

        Subject sub1 = new Subject("计算机科学与应用", "j001", 4);
        System.out.println(sub1.toString());
        Student stu1 = new Student("张三", "20190307", '男', 25);
        Student stu2 = new Student("老二", "20180408", '男', 27);
        System.out.println(stu1.toString("计算机科学与应用", "4"));
        System.out.println(stu2.toString(sub1));
    }
}
