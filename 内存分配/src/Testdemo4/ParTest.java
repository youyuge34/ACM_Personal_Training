package Testdemo4;

import java.util.ArrayList;
import Testdemo4.Partation;

public class ParTest {
    public static int g = 15 ;//默认的
    private static int index = 0 ;
    /***********最佳适应算法**************/    
    public static void 最佳适应(ArrayList<Partation> list, int needSize) {

        sortSmallToLarge(list);//每次分配最小的

        setSize(list,needSize) ;

        sortIDSmallToLarge(list);



    }
    /***********最坏适应算法**************/


    public static void 最坏适应(ArrayList<Partation> list, int needSize) {

        sortLargeToSmall(list);//每次分配最大的

        setSize(list,needSize) ;

        sortIDSmallToLarge(list);
        }
/***********首次适应算法**************/
    public static void 首次适应(ArrayList<Partation> list, int needSize) {
    setSize(list,needSize) ;//找出一个能满足要求的空闲分区给所需要的请求
    sortIDSmallToLarge(list);//地址由低到高
}
/***********循环首次适应算法**************/
    public static void 循环首次(ArrayList<Partation> list, int needSize) {
        /****      这里要设置一个参数，如果分配后小于这个参数，那么就不进行分配，反之还是可以进行分配的             ****/        
        index++ ;
        if(index == list.size()-1){
         //list.size() = index+1，所以通过等于判断前一个分配的分区是否是List中的最后一个
            index = 0;
        }
     setIndexSize(list, needSize,index) ;//设置参数，就是分配后还剩余的空间
     sortIDSmallToLarge(list);
}
/***********设置大小**************/
    public static void setSize(ArrayList<Partation> list, int needSize){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSize() >= needSize) {
                if ( list.get(i).getSize()-needSize  <= g) {
                    list.get(i).setSize(0) ;
                    index = i ;//重新定位需要分配的地方
                    break ;

                } else {
                    //从新给size赋值，创建的大小为分配后剩余的大小
                    list.get(i).setSize(list.get(i).getSize()-needSize );
                    index = i ;
                    break ;

                }
            }
        }
    }
public static void setIndexSize(ArrayList<Partation> list, int needSize,int setIndex){
        for (int i = setIndex; i < list.size(); i++) {
            if (list.get(i).getSize() >= needSize) {
                if ( list.get(i).getSize()-needSize  <= g) {
                    list.get(i).setSize(0) ;
                    index = i ;
                    break ;

                } else {
                    list.get(i).setSize(list.get(i).getSize()-needSize );
                    index = i ;
                    break ;

                }
            }
        }
    }

    /***********从小到大排序**************/
    public static void sortSmallToLarge(ArrayList<Partation> list){
        Partation p = new Partation() ;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size()-1; j++) {
                if( list.get(j).getSize()> list.get(j+1).getSize() ){
                    //三个变量交换，排序
                    p = list.get(j) ;
                    list.set(j, list.get(j+1)) ;
                    list.set(j+1, p) ;
                }
            }
        }
    }

    /***********Id从小到大排序**************/
    public static void sortIDSmallToLarge(ArrayList<Partation> list){
        Partation p = new Partation() ;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size()-1; j++) {
                if( list.get(j).getId() > list.get(j+1).getId() ){

                    p = list.get(j) ;
                    list.set(j, list.get(j+1)) ;
                    list.set(j+1, p) ;
                }
            }
        }
    }

    /***********从大到小**************/
    public static void sortLargeToSmall(ArrayList<Partation> list){
        Partation p = new Partation() ;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size()-1; j++) {
                if( list.get(j).getSize() > list.get(j+1).getSize() ){
                    p = list.get(j+1) ;
                    list.set(j+1, list.get(j)) ;
                    list.set(j, p) ;
                }
            }
        }
    }

} 