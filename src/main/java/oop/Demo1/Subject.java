package oop.Demo1;
/*
 * @param subjectName 学科名称
 * @param subjectName 编号
 * @param subjectName 学制
 * */

//学校有关的
public class Subject {
    private String subjectName;
    private String subjectNo;
    private int subjectLife;


    public Subject() {

    }

    public Subject(String subjectName, String subjectNo, int subjectLife) {
        this.subjectName = subjectName;
        this.subjectNo = subjectNo;
        this.subjectLife = subjectLife;
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

    //设定限制
    public void setSubjectLife(int subjectLife) {
        if (subjectLife <= 0) {
            return;
        }
        this.subjectLife = subjectLife;
    }

    @Override
    //输出的方法
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectNo='" + subjectNo + '\'' +
                ", subjectLife=" + subjectLife +
                '}';
    }
}
