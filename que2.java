 class Rectangle {
    private int length;
    private int width;
    Rectangle(int x,int y){
        this.length=x;
        this.width=y;

    }
    public int getLength(){
        return length;

    }public void setLength(int x){
        this.length=x;
    }public int getWidth(){
        return width;
        
    }public void setWidth(int x){
        this.width=x;
    }
    public void Calculate(){
        System.out.println("Area is "+(length*width));
        System.out.println("Perimeter is "+(2*(length+width)));
    }
}
/**
 * que2
 */
public class que2 {

    public static void main(String[] args) {
        Rectangle re1=new Rectangle(2, 3);
        Rectangle re2=new Rectangle(0,0);
        re1.Calculate();
        re2.setLength(4);re2.setWidth(8);
        re2.Calculate();
    }
}