package Demo;
import java.awt.*;

import javax.swing.*;

public class Demo16 extends JFrame {

    // 定义组件
    JPanel jp1, jp2, jp3,jp4,jp5;
    JLabel jlb1, jlb2,jlb3,jlb4,jlb5;
    JButton jb1, jb2;
    JTextField jtf1,jtf2,jtf3,jtf4;
    JPasswordField jpf1;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Demo16 d1 = new Demo16();

    }

    // 构造函数
    public Demo16() {

        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();
        jp5 = new JPanel();
        jlb1 = new JLabel("名称（如IDKP0）");
        jlb2 = new JLabel("维数（diemnsion）");
        jlb3 = new JLabel("容量（cubage）");
        jlb4 = new JLabel("数据个数");
        //jlb2 = new JLabel("维数（diemnsion）");
        jb1 = new JButton("确定");
        jb2 = new JButton("取消");

        jtf1 = new JTextField(10);
        jtf2 = new JTextField(10);
        jtf3 = new JTextField(10);
        jtf4 = new JTextField(10);

        jpf1 = new JPasswordField(10);// 设置布局管理(上面忘记：extends JFrame，这里出错了)
        this.setLayout(new GridLayout(3, 1));

        // 加入各个组件
        jp1.add(jlb1);
        jp1.add(jtf1);

        jp2.add(jlb2);
        jp2.add(jtf2);
       
        jp3.add(jlb3);
        jp3.add(jtf3);
        
        jp4.add(jlb4);
        jp4.add(jtf4);

        jp5.add(jb1);
        jp5.add(jb2);

        // 加入到JFrame
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.add(jp4);
        this.add(jp5);
        this.setSize(250, 150);
        this.setTitle("折扣{0-1}背包问题");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}