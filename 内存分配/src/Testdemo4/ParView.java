package Testdemo4;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ParView {

    ArrayList<Partation> list;
    public void menu(){
        while(true){
            String notice = JOptionPane.showInputDialog("B14111818 尤晟\n 1.分配资源\n2.回收资源\n3.查看分配\n0.退出");
            int s=Integer.parseInt(notice);    
            if(s==1){
                operate();
                continue;

            }else if(s==2){
                remove();
                continue;

            }else if(s==3){
                show();
                continue;

            }else if(s==4){
                 exit();
                 continue;
            }else{

                break;
            }

        }


    }

    public void operate(){
        list=new ArrayList<Partation>();
        int num=0;
        try {
            num=Integer.parseInt(JOptionPane.showInputDialog("请输入你的分区个数"));
        } catch (Exception e) {
            System.out.println("输入错误！！");
        }

        for (int i = 0; i < num; i++) {
            String name=JOptionPane.showInputDialog("请输入分区编号");
            int Size=Integer.parseInt(JOptionPane.showInputDialog("请输入分区的大小"));
            list.add(new Partation(i,name,Size));
        }
        boolean flag=true;
        String info = "------------ 选择动态分区算法 ------------\n" +
                "1- 首次适应算法\n"+
                "2- 最佳适应算法\n"+
                "3- 最坏适应算法\n"+
                "4- 循环首次适应算法\n"+
                "5- 设置最小碎片的大小（默认为"+ParTest.g+"）\n"+
                "6- 选择继续\n"+
                "7-退出程序\n";
               

        while(flag){
            char changce=JOptionPane.showInputDialog(info).trim().charAt(0);
            switch(changce){
            case '1':
                startFirstFit() ;
                break;
            case '2':
                startBestFit() ;
                break;
            case '3':
                startWorstFit() ;
                break;
            case '4':
                startCycleFirstFit() ;
                break;
            case '5':
                changeG() ;
                System.out.println(ParTest.g);
                break;
            case '6':
                menu();
            case '7':
                System.exit(0) ;

            }

        }

    }

    public void remove () {
        list=new ArrayList<Partation>();
        Partation p=new Partation();
        String content = "| "+"分区号  "+
                " | "+"作业名"+
                " | "+"起始地址"+
                " | "+"结束地址"+
                " | "+"分区大小"+
                " | "+"状态"+"  |";
        for (int i=0; i<list.size(); i++) {
            content+="\n|  "+(i+1)+"   |  ";
            content+=list.get(i).name+"   |  ";
            content+=list.get(i).getStartAddress()+"   |  ";
            content+=list.get(i).getEndAddress()+"   |  ";
            content+=list.get(i).getSize()+"KB   |  ";
            content+=list.get(i).state+"   |  ";
        }
        String id = JOptionPane.showInputDialog(content + "\n请输入要回收的作业编号：");
        if (Integer.parseInt(id)==p.getId()) {
//            list.get(Integer.parseInt(id)-1).bottom=1;//1代表可以继续追加
//        }
        list.remove(Integer.parseInt(id));
        JOptionPane.showMessageDialog(null, "回收成功！");
        }
    }


    public void show(){
        list=new ArrayList<Partation>();
        String content = "| "+"分区号"+
                " | "+"作业名"+
                " | "+"起始地址"+
                " | "+"结束地址"+
                " | "+"分区大小"+
                " | "+"状态"+"  |";
        for (int i=0; i<list.size(); i++) {
            content+="\n|"+(i+1)+"    |   ";
            content+=list.get(i).name+"    |   ";
            content+=list.get(i).getStartAddress()+"    |   ";
            content+=list.get(i).getStartAddress()+"    |   ";
            content+=list.get(i).getSize()+"KB    |   ";
            content+=list.get(i).state+"    |   ";
        }
        JOptionPane.showMessageDialog(null, content,"内存分配情况",JOptionPane.INFORMATION_MESSAGE);
    }


public void exit(){
    list=new ArrayList<Partation>();
    list.clear();
    
}

public void startFirstFit(){
        int Size = 0 ;
        Size = Integer.parseInt(JOptionPane.showInputDialog("请输入所需分区的大小") ) ;
        ParTest.首次适应(list, Size);
//        System.out.println("===========================");
        print(list) ;

    }

    public void startBestFit(){
        int Size = 0 ;
        Size = Integer.parseInt(JOptionPane.showInputDialog("请输入所需分区的大小") ) ;
        ParTest.最佳适应(list, Size);
//        System.out.println("===========================");
        print(list) ;

    }
    public void startWorstFit(){
        int Size = 0 ;
        Size = Integer.parseInt(JOptionPane.showInputDialog("请输入所需分区的大小") ) ;
        ParTest.最坏适应(list, Size);
//        System.out.println("===========================");
        print(list) ;

    }

    public void startCycleFirstFit(){
        int Size = 0 ;
        Size = Integer.parseInt(JOptionPane.showInputDialog("请输入所需分区的大小") ) ;
        ParTest.循环首次(list, Size);
//        System.out.println("===========================");
        print(list) ;
    }
    public void changeG(){
        int size = 0 ;
        size = Integer.parseInt(JOptionPane.showInputDialog("请输入最小碎片大小")) ;
        ParTest.g = size ;
    }

    public void print(ArrayList<Partation> list){

        String info="";
        for (Partation partation : list) {
            info+=partation+"\n";
        }
        JOptionPane.showMessageDialog(null, info);
    }
}