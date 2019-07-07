package list.arrayList;

import java.util.ArrayList;
import java.util.Date;

/*设计一个公告类，添加公告人员*/
public class Test3 {
    public static void main(String[] args) {
        Notice notice1 = new Notice(1, "imooc java", "tahirjan", new Date());
        Notice notice2 = new Notice(2, "imooc python", "nurala", new Date());
        ArrayList list = new ArrayList();//list有序可以重复的
        list.add(notice1);
        list.add(notice2);
        //get返回的值是Object，我们把值Object中获取对应的值
        for (int i = 0; i < list.size(); i++) {
            Notice createObj = (Notice) list.get(i);
            System.out.println(createObj.getId());
            System.out.println(createObj.getTitle());
            System.out.println(createObj.getAdmin());
            System.out.println(createObj.getCreateTime());
        }
        Notice notice3 = new Notice(3, "imooc c++", "管理员", new Date());
        //末尾添加一条数据, add(int index,Object element) ()
        list.add(1, notice3); // 添加第一条公告的后面
        System.out.println("添加------");
        for (int i = 0; i < list.size(); i++) {
            Notice createObj = (Notice) list.get(i);
            System.out.println(createObj.getId());
            System.out.println(createObj.getTitle());
            System.out.println(createObj.getAdmin());
            System.out.println(createObj.getCreateTime());
        }
        System.out.println("删除------根据index方式删除");
        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            Notice createObj = (Notice) list.get(i);
            System.out.println(createObj.getId());
            System.out.println(createObj.getTitle());
            System.out.println(createObj.getAdmin());
            System.out.println(createObj.getCreateTime());
        }
        System.out.println("修改---------------------");
        //修改第二条公告的title内容
        notice2.setTitle("hello world");
        notice2.setId(0);
        //修改第三条公告的title内容
        notice3.setTitle("welcome windows");
        for (int i = 0; i < list.size(); i++) {
            Notice createObj = (Notice) list.get(i);
            System.out.println(createObj.getId());
            System.out.println(createObj.getTitle());
            System.out.println(createObj.getAdmin());
            System.out.println(createObj.getCreateTime());
        }
    }
}


class Notice {
    private int id;//id
    private String title;//标题
    private String admin;//创建人
    private Date createTime;//创建时间

    public Notice(int id, String title, String admin, Date createTime) {
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