package oop.Demo2;

public class Demo {
    public static void main(String[] args) {
        Subject sub = new Subject("计算机科学与应用", "j001", 4);
        Student stu = new Student("张三", "20190506", '男', 25, sub);
        System.out.println(stu.classInfo());
    }
}
