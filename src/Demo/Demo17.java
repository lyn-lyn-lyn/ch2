package Demo;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class Demo17 extends JFrame {

    // ������
    JToolBar jtb;
    JButton jb1, jb2, jb3, jb4, jb5, jb6;

    // �˵������
    JMenuBar jmb;
    JMenu menu1, menu2, menu3, menu4, menu5;
    JMenuItem item2, item3, item5, item6, item7;
    JMenu xinjian,item4;// �����˵�
    JMenuItem file, project,project1;
    JMenuItem a1, a2,a3,a4;

    JTextArea jta;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Demo17();

    }

    public Demo17() {

        // ����������
        jtb = new JToolBar();
        jb1 = new JButton(new ImageIcon("images\\1.png"));
        jb1.setToolTipText("�½�");
        jb2 = new JButton(new ImageIcon("images\\1.png"));
        jb2.setToolTipText("��");
        jb3 = new JButton(new ImageIcon("images\\1.png"));
        jb3.setToolTipText("�ȴ�");
        jb4 = new JButton(new ImageIcon("images\\1.png"));
        jb4.setToolTipText("ͳ��");
        jb5 = new JButton(new ImageIcon("images\\1.png"));
        jb5.setToolTipText("����");
        jb6 = new JButton(new ImageIcon("images\\1.png"));
        jb6.setToolTipText("�Թ�");

        jmb = new JMenuBar();

        menu1 = new JMenu("�ļ�(F)");
        menu1.setMnemonic('F');// �������Ƿ�
        menu2 = new JMenu("�༭(E)");
        menu2.setMnemonic('E');
        menu3 = new JMenu("��ʽ(O)");
        menu3.setMnemonic('O');
        menu4 = new JMenu("�鿴(V)");
        menu4.setMnemonic('V');
        menu5 = new JMenu("����(H)");
        menu5.setMnemonic('H');

       // item1=new JMenuItem(���½���)
        xinjian = new JMenu("�㷨ѡ��");
        file = new JMenuItem("�Ŵ��㷨");
        project = new JMenuItem("̰�ķ�");
        project1 = new JMenuItem("��̬�滮�㷨");

        item2 = new JMenuItem("��", new ImageIcon("images\1.png"));
        item3 = new JMenuItem("����(S)");
        item3.setMnemonic('S');
        // ���˵�ѡ����ӿ�ݷ�ʽ
        item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
                InputEvent.ALT_MASK));
        item4 = new JMenu("ɢ��ͼ");
        a1 = new JMenuItem("idkp1-10");
        a2 = new JMenuItem("sdkp1-10");
        a3 = new JMenuItem("udkp1-10");
        a4 = new JMenuItem("wdkp1-10");
        item5 = new JMenuItem("��������");
        item6 = new JMenuItem("��ѯ����");
        item7 = new JMenuItem("�˳�");

        jta = new JTextArea();

        // ���ò���

        // ������
        // ����ť��ӵ���������
        jtb.add(jb1);
        jtb.add(jb2);
        jtb.add(jb3);
        jtb.add(jb4);
        jtb.add(jb5);
        jtb.add(jb6);

        // ���˵���ӵ��˵�����
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
        menu1.addSeparator();// ��ӷָ���
        menu1.add(item5);
        menu1.add(item6);
        menu1.addSeparator();
        menu1.add(item7);

        // ���˵���ӵ��˵�����
        jmb.add(menu1);
        jmb.add(menu2);
        jmb.add(menu3);
        jmb.add(menu4);
        jmb.add(menu5);

        // ���˵���ӵ�������
        this.setJMenuBar(jmb);

        // ����������ӵ�����
        this.add(jtb, BorderLayout.NORTH);

        JScrollPane jsp = new JScrollPane(jta);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(jsp);

        // չʾ
        this.setTitle("�ۿ�{0-1}��������");
        ImageIcon icon = new ImageIcon("images\1.png");
        this.setIconImage(icon.getImage());
        this.setSize(1200, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

}