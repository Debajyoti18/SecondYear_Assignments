public class que3ass {
    public static void main(String[] args) {
        MobileApp mb=new MobileApp();
        mb.display();
        MobileApp mv=new MobileApp("Aircel");
        mv.display();
    }
}
class MobileApp{
    String sim;
    MobileApp(){
        this.sim="Airtel";
    }
    MobileApp(String str){
        this.sim=str;
    }
    void display(){
        System.out.println("Sim is"+sim);
    }
}