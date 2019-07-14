package oop.Demo3;

public class Demo {
    public static void main(String[] args) {
        Subject sub1 = new Subject("计算机科学与应用", "j001", 4);
        Student stu1 = new Student("张三", "20190506", '男', 25, sub1);
        Student stu2 = new Student("张四", "20190106", '男', 25, sub1);
        System.out.println(stu1.classInfo());
        System.out.println(stu2.classInfo());
        sub1.addStudents(stu1);
        sub1.addStudents(stu2);
        System.out.println(sub1.getSubjectName() + "\t所专业中已经有、\t" + sub1.getStudentNum() + "学生\t");
    }
}
