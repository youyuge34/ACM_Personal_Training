package Testdemo4;
public class Partation {
    private int startAddress ;
    private int endAddress ;
    private int Id  ;//根据下表获取元素
    private int Size ;//集合长度
    String name;
    String state="未完成";
    int bottom = 1;//bottom=1表示可以加载，而bottom=0表示不能再加载
    public  Partation(){}
    public  Partation(int Id,String name,int Size){
        this.Id=Id;
        this.Size=Size;
        this.name = name;
        this.state = "完成";
    }
    public int getStartAddress() {
        return startAddress;
    }
    public void setStartAddress(int startAddress) {
        this.startAddress = startAddress;
    }
    public int getEndAddress() {
        return endAddress;
    }
    public void setEndAddress(int endAddress) {
        this.endAddress = endAddress;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public int getSize() {
        return Size;
    }
    public void setSize(int size) {
        Size = size;
    }
    public String toString(){

        return "分区"    +this.getId()+""+"分区大小是："+this.getSize();

    }
}