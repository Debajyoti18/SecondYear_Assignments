 class Car{
        private String make;
         private String model;
         Car(String x,String y){
            this.make=x;
            this.model=y;
         }
         public  String getMake(){
                return make;
         }
         public  void setMake(String x){
            this.make=x;
         }
         public  String getModel(){
                return model;
         }
         public  void setModel(String y){
            this.model=y;
         }
}
 class CarTester{
     public static void main(String[] args){
        Car mycar1=new Car("Toyota","landcruise");
         Car mycar2=new Car(null,null);
         System.out.println("Before change"+mycar1.getMake()+" "+mycar1.getModel());
         System.out.println("Before change "+mycar2.getMake()+" "+mycar2.getModel());
         mycar2.setMake("BMW");mycar2.setModel("c2");
         System.out.println("After change"+mycar1.getMake()+" "+mycar1.getModel());
         System.out.println("After change "+mycar2.getMake()+" "+mycar2.getModel());


     }

}