package oop.Demo3;

/*
 * @param    subjectName     学科名称
 * @param    subjectNo       学科编号
 * @param    subjectLife     学科年限
 * @param    myStudents      报名选修的学生信息, 学生数组
 * */

public class Subject {
    private String subjectName;
    private String subjectNo;
    private int subjectLife;
    //保存多个学生的信息
    private Student[] myStudents;//数组的默认值也是null，跟对象一样,所以需要初始化，否则输出未初始化的问题

    //报名的选修的学生个数问题, 学生个数，统计值
    private int studentNum;

    public Subject() {
    }

    public Subject(String subjectName, String subjectNo, int subjectLife) {
        this.subjectName = subjectName;
        this.subjectNo = subjectNo;
        this.subjectLife = subjectLife;
    }


    public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudents) {
        this.subjectName = subjectName;
        this.subjectNo = subjectNo;
        this.subjectLife = subjectLife;
        this.myStudents = myStudents;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public int getSubjectLife() {
        return subjectLife;
    }

    public void setSubjectLife(int subjectLife) {
        this.subjectLife = subjectLife;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    //获取选修专业的学生信息,如果保存学生信息的数组未被初始化，则，先初始化，长度为200，保存学生信息的数组
    public Student[] getMyStudents() {
        //初始化
        if (this.myStudents == null) {
            this.myStudents = new Student[200];
        }
        return myStudents;
    }

    public void setMyStudents(Student[] myStudents) {
        this.myStudents = myStudents;
    }

    /*
     * 1——将学生保存到数组中
     * 2——将学生个数保存到studentNum中
     * 也可以用无返回值方式，也可以用int返回值, addStudents方法被执行的时候，将学生存储到学生数组中
     * */
    public void addStudents(Student stu) {
        int i;
        for (i = 0; i < this.getMyStudents().length; i++) {
            //如果下标的成员为空,代表这个位置还没有学生存放进去的
            if (this.getMyStudents()[i] == null) {
                this.getMyStudents()[i] = stu;
                break;
            }
        }
        this.studentNum = i + 1;
    }
}
