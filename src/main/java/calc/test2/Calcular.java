package calc.test2;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calcular {
    /*author:命运的信徒
     * date:2019/1/18
     * arm:计算器页面
     */
    private static void setPage() {
        //1.设置窗体的大小和标题
        JFrame jf = new JFrame("计算器页面");
        jf.setBounds(100, 200, 600, 600);
        //2、设置关闭窗体就是关闭程序
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置布局模式
        GridLayout glo = new GridLayout(4, 3);
        jf.setLayout(glo);
        //计算器的页面
        JPanel jp = new JPanel();
        jf.add(jp);
        //这个是文本框
        JTextField jt = new JTextField(16);
        jp.add(jt);
        //按键盘
        JPanel jp1 = new JPanel();
        jf.add(jp1);
        JButton jb0 = new JButton("7");
        JButton jb1 = new JButton("8");
        JButton jb2 = new JButton("9");
        JButton jb3 = new JButton("/");
        jp1.add(jb0);
        jp1.add(jb1);
        jp1.add(jb2);
        jp1.add(jb3);
        //按键盘
        JPanel jp2 = new JPanel();
        jf.add(jp2);
        JButton jb4 = new JButton("4");
        JButton jb5 = new JButton("5");
        JButton jb6 = new JButton("6");
        JButton jb7 = new JButton("*");
        jp2.add(jb4);
        jp2.add(jb5);
        jp2.add(jb6);
        jp2.add(jb7);
        //按键盘
        JPanel jp3 = new JPanel();
        jf.add(jp3);
        JButton jb8 = new JButton("4");
        JButton jb9 = new JButton("5");
        JButton jb10 = new JButton("6");
        JButton jb11 = new JButton("*");
        jp3.add(jb8);
        jp3.add(jb9);
        jp3.add(jb10);
        jp3.add(jb11);
        //3 设置窗体可见
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        setPage();
    }
}
