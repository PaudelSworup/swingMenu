    package com.logintut;
    import javax.swing.*;
    import java.awt.*;

    class Menus extends JFrame{
        JMenu menu, edit, submenu;
        JMenuItem i1, i2, i3, i4, i5;


        public Menus(){
            setTitle("Menus Demo");
            setSize(700,500);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            Container c = getContentPane();
            c.setLayout(null);

            JMenuBar mb=new JMenuBar();
            menu = new JMenu("File");
            edit = new JMenu("Run");
            submenu = new JMenu("New");
            i1 = new JMenuItem("close");
            i2=new JMenuItem("Edit");
            i3=new JMenuItem("open recent");
            i4=new JMenuItem("project");
            i5=new JMenuItem("module");

            menu.add(i1);
            menu.add(i2);
            menu.add(i3);
            submenu.add(i4);
            submenu.add(i5);
            menu.add(submenu);
            mb.add(menu);
            mb.add(edit);



            setVisible(true);
            setJMenuBar(mb);
        }
    }




    public class Main {

        public static void main(String[] args) {
            Menus mn = new Menus();

        }
    }
