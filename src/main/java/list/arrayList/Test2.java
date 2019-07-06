package list.arrayList;

import java.util.ArrayList;
import java.util.Date;

//公告管理
public class Test2 {
    public static void main(String[] args) {
        Admin notice1 = new Admin(1, "欢迎来到慕课网", "管理员", new Date());
        Admin notice2 = new Admin(2, "欢迎来到慕课网", "管理员", new Date());
        Admin notice3 = new Admin(3, "欢迎来到慕课网", "管理员", new Date());
        //添加公告
        ArrayList list = new ArrayList();
        list.add(notice1);
        boolean add = list.add(notice2);
        list.add(notice3);
        //显示公告
        System.out.println("显示公告的内容:");
        for (int i = 0; i < list.size(); i++) {
            /*
                list.get(i) 返回值是一个Object ， Admin类的有getTitle（）方法, 所以进行强制转换成对象
                Object[] objects=(Object[])list.get(0);
                return objects[3]
                get方法的返回值是一个Object，Object中取出值得时候先创建对应的对象，然后获取对应的值
            * */
            Admin createObj = (Admin) list.get(i);
            System.out.println(createObj.getId());
            System.out.println(createObj.getTitle());
            System.out.println(createObj.getAdmin());
            System.out.println(createObj.getCreateTime());
        }
    }
}

class Admin {
    private int id;//id
    private String title;//标题
    private String admin;//创建人
    private Date createTime;//创建时间

    public Admin() {
    }

    public Admin(int id, String title, String admin, Date createTime) {
        super();
        this.id = id;
        this.title = title;
        this.admin = admin;
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}