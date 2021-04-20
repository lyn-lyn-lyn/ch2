package Demo;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class Demo17 extends JFrame {

    // 工具条
    JToolBar jtb;
    JButton jb1, jb2, jb3, jb4, jb5, jb6;

    // 菜单条组件
    JMenuBar jmb;
    JMenu menu1, menu2, menu3, menu4, menu5;
    JMenuItem item2, item3, item5, item6, item7;
    JMenu xinjian,item4;// 二级菜单
    JMenuItem file, project,project1;
    JMenuItem a1, a2,a3,a4;

    JTextArea jta;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Demo17();

    }

    public Demo17() {

        // 创建工具条
        jtb = new JToolBar();
        jb1 = new JButton(new ImageIcon("images\\1.png"));
        jb1.setToolTipText("新建");
        jb2 = new JButton(new ImageIcon("images\\1.png"));
        jb2.setToolTipText("打开");
        jb3 = new JButton(new ImageIcon("images\\1.png"));
        jb3.setToolTipText("等待");
        jb4 = new JButton(new ImageIcon("images\\1.png"));
        jb4.setToolTipText("统计");
        jb5 = new JButton(new ImageIcon("images\\1.png"));
        jb5.setToolTipText("参与");
        jb6 = new JButton(new ImageIcon("images\\1.png"));
        jb6.setToolTipText("旁观");

        jmb = new JMenuBar();

        menu1 = new JMenu("文件(F)");
        menu1.setMnemonic('F');// 设置助记符
        menu2 = new JMenu("编辑(E)");
        menu2.setMnemonic('E');
        menu3 = new JMenu("格式(O)");
        menu3.setMnemonic('O');
        menu4 = new JMenu("查看(V)");
        menu4.setMnemonic('V');
        menu5 = new JMenu("帮助(H)");
        menu5.setMnemonic('H');

       // item1=new JMenuItem(“新建”)
        xinjian = new JMenu("算法选择");
        file = new JMenuItem("遗传算法");
        project = new JMenuItem("贪心法");
        project1 = new JMenuItem("动态规划算法");

        item2 = new JMenuItem("打开", new ImageIcon("images\1.png"));
        item3 = new JMenuItem("保存(S)");
        item3.setMnemonic('S');
        // 给菜单选项添加快捷方式
        item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
                InputEvent.ALT_MASK));
        item4 = new JMenu("散点图");
        a1 = new JMenuItem("idkp1-10");
        a2 = new JMenuItem("sdkp1-10");
        a3 = new JMenuItem("udkp1-10");
        a4 = new JMenuItem("wdkp1-10");
        item5 = new JMenuItem("插入数据");
        item6 = new JMenuItem("查询数据");
        item7 = new JMenuItem("退出");

        jta = new JTextArea();

        // 设置布局

        // 添加组件
        // 将按钮添加到工具条上
        jtb.add(jb1);
        jtb.add(jb2);
        jtb.add(jb3);
        jtb.add(jb4);
        jtb.add(jb5);
        jtb.add(jb6);

        // 将菜单添加到菜单栏上
        xinjian.add(file);
        xinjian.add(project);
        xinjian.add(project1);
        menu1.add(xinjian);
        menu1.add(item2);
        menu1.add(item3);
      // menu1.add(item4);
        item4.add(a1);
        item4.add(a2);
        item4.add(a3);
        item4.add(a4);
        menu1.add(item4);
        menu1.addSeparator();// 添加分割线
        menu1.add(item5);
        menu1.add(item6);
        menu1.addSeparator();
        menu1.add(item7);

        // 将菜单添加到菜单条上
        jmb.add(menu1);
        jmb.add(menu2);
        jmb.add(menu3);
        jmb.add(menu4);
        jmb.add(menu5);

        // 将菜单添加到窗体上
        this.setJMenuBar(jmb);

        // 将工具条添加到窗体
        this.add(jtb, BorderLayout.NORTH);

        JScrollPane jsp = new JScrollPane(jta);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(jsp);

        // 展示
        this.setTitle("折扣{0-1}背包问题");
        ImageIcon icon = new ImageIcon("images\1.png");
        this.setIconImage(icon.getImage());
        this.setSize(1200, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

}