package oop.Demo3;

/*
*
* 计算机科学与应用专业到底有多少个学生进行了报名,多少个学生学了这个专业
* 使用一个容器，然后取出来一个一个就行, 数组存放多个学生
* */
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
    /*
     *第三种解决方案
     *专业也属于大学学生的一个成员属性，因为一个大学生一定要选一个专业的
     * @param    Subject studentSubject
     * Subject的默认值null，不要忘记这一点
     * 关联属性，因为学生的信息与专业关联
     * */
    private Subject studentSubject;

    //无参数构造函数的重要性
    public Student() {
    }

    public Student(String stuName, String stuId, char stuSex, int stuAge, Subject studentSubject) {
        this.stuName = stuName;
        this.stuId = stuId;
        this.stuSex = stuSex;
        this.stuAge = stuAge;
        this.studentSubject = studentSubject;
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

    //获取专业对象,如果没有实例化，先实例化再返回专业对象的信息
    public Subject getStudentSubject() {
        /*考虑安全，如果没有实例化的情况下，它值会null*/
        if (this.studentSubject == null) {
            /*
             * 我去先给它，实例化Subject类，然后再返回专业对象的信息
             * 我们并不知道新产生的对象有什么特性，无参数的构造函数的场景出来了
             * */
            this.studentSubject = new Subject();
        }
        return studentSubject;
    }

    public void setStudentSubject(Subject studentSubject) {
        this.studentSubject = studentSubject;
    }

    //当前对象的信息
    public String classInfo() {
        String str = "学生信息下：\n姓名" + this.getStuName() +
                "\n学号" + this.getStuId() +
                "\n性别" + this.getStuSex() +
                "\n年龄" + this.getStuAge() +//在这儿注意注意
                "\n所报专业名称" + this.getStudentSubject().getSubjectName() +
                "\n所报专业限制" + this.getStudentSubject().getSubjectLife();
        return str;
    }
}
