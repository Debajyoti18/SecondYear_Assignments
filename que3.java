public class que3 {
    public static void main(String[] args) {
        Point p1=new Point(2, 3);
        System.out.println("point x & y is "+p1.getX()+","+p1.getY());
        Point p2=new Point(p1);
        Point p3=p2;
        p3.setX(4);
        p3.setY(5);
        System.out.println("point x & y is "+p3.getX()+","+p3.getY());
        
    }
}
 class  Point {

    int x,y;
    Point(int l,int d){
        this.x=l;
        this.y=d;
    }
    Point (Point n){
        x=n.x;
        y=n.y;
    }
    void  setX(int l){
            this.x=l;
    } int  getX(){
        return x;
} int  getY(){
    return y;
} void setY(int d){
   this.y=d;
}
    
}

