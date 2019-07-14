package oop.Demo1;

/*
 * @param    stuName 学生姓名
 * @param    stuId   学生学号
 * @param    stuSex  学生性别
 * @param    stuAge  学生年龄
 * */
public class Student {
    private String stuName;
    private String stuId;
    private char stuSex;
    private int stuAge;

    //无参数构造函数
    public Student() {
    }

    //多参数构造函数，实现姓名，学号赋值
    public Student(String stuName, String stuId) {
        this.stuName = stuName;
        this.stuId = stuId;
    }

    //多参数构造函数，实现姓名，学号，性别，年龄赋值
    public Student(String stuName, String stuId, char stuSex, int stuAge) {
        this.stuName = stuName;
        this.stuId = stuId;
        this.stuSex = stuSex;
        this.stuAge = stuAge;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public char getStuSex() {
        return stuSex;
    }

    public void setStuSex(char stuSex) {
        this.stuSex = stuSex;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    //自我介绍
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuId='" + stuId + '\'' +
                ", stuSex=" + stuSex +
                ", stuAge=" + stuAge +
                '}';
    }

    /*
     *第一种解决方法
     * @param    subjectName     所学专业名称
     * @param    @subjectLife    学制年限
     * */

    public String toString(String subjectName, String subjectLife) {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuId='" + stuId + '\'' +
                ", stuSex=" + stuSex +
                ", stuAge=" + stuAge +
                ", subjectName=" + subjectName +
                ", subjectLife=" + subjectLife +
                '}';
    }

    /*
     * 第二种解决方案
     * @param   subjectName      所学专业名称
     * @param    subjectLife    学制年限
     * 传入Subject类型的对象以后，也一样获取 subjectName,subjectLife,因为这些Subject类下的属性
     * */
    public String toString(Subject mySubject) {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuId='" + stuId + '\'' +
                ", stuSex=" + stuSex +
                ", stuAge=" + stuAge +
                ", subjectName=" + mySubject.getSubjectName() +
                ", subjectLife=" + mySubject.getSubjectLife() +
                '}';
    }

}
