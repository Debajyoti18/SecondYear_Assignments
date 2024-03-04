 class que4 {
    public static void main(String[] args) {
        Laptop lp=new Laptop();
        lp.setModel("ASUS");
        lp.setPrice(123000);
        System.out.println("Laptop model and price is "+lp.toString());
    }
}
/**
 * que4
 */
 class Laptop {
    private String model;
    private int price;
    public void setModel(String str){
        this.model=str;

    }
    public void setPrice(int x){
        this.price=x;
    }
    public String toString() {
       return model+" "+price;
    }

    
}
