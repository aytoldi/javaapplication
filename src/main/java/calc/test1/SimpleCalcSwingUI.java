package calc.test1;
import javax.swing.*;
import static java.awt.BorderLayout.*;
import java.awt.*;

/*
    编写程序，通过按钮数组来管理界面中的所有按钮控件，从而使用最少的代码实现模拟的计算器界面。
    思路如下：
    创建一个类，通过extends使其继承窗体类JFrame；
    创建一个JFrame对象，使用JFrame类的setVisible()方法设置窗体可见；
    在构造函数中，使用super()方法继承父类的构造方法；
    使用setTitle()方法设置窗体的标题；
    使用setBounds()方法设置窗体的显示位置及大小；
    使用setDefaultCloseOperation()方法设置窗体关闭按钮的动作为退出；
    使用GridLayout创建网格布局管理器对象；
    使用GridLayout类的setHgap()方法设置组件的水平间距；
    使用GridLayout类的setVgap()方法设置组件的垂直间距；
    创建JPanel容器对象；
    通过JPanel类的setLayout()方法设置容器采用网格布局管理器；
    创建一个字符串型二维数组，初始化其值为计算器上对应按钮上显示的值；
    创建一个JButton型二维数组，并为其分配和之前的字符串型二维数组对应的空间；
    遍历字符串型二维数组，对它的每个元素都将其赋值给JButton型二维数组中的对应按钮，并对每个按钮添加事件，使得点击按钮时在文本输入框中显示对应的值，最后使用JPanel类的add()方法将按钮添加到面板中。
* */



public class SimpleCalcSwingUI
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("计算器");
        //创建内容面板
        JPanel p1 = new JPanel();
        //将文本框增加到面板中
        p1.add(new JTextField(30));
        f.add(p1 , NORTH);
        JPanel p2 = new JPanel();
        // 设置Panel使用GridLayout布局管理器
        p2.setLayout(new GridLayout(4, 4 , 6, 6));
        String[] name = {"7" , "8" , "9" , "/"
                , "4" , "5" , "6" , "*" , "1" , "2"
                , "3" , "-" ,"0" , "." , "=" , "+"};
        // 向Panel中依次添加16个按钮
        for (int i = 0 ; i < name.length; i++ )
        {
            p2.add(new JButton(name[i]));
        }
        // 默认将Panel对象添加Frame窗口的中间
        f.add(p2);
        // 设置窗口为最佳大小
        f.pack();
        // 将窗口显示出来（Frame对象默认处于隐藏状态）
        f.setVisible(true);
    }
}


