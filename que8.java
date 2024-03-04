public class que8 {
    public static void main(String[] args) {
        Car c=new Car();
        c.Accelerate();
        c.Accelerate(233, 2);
        c.Brake();
        BiCycle b=new BiCycle();
        b.Accelerate();
        b.Accelerate(233, 2);
        b.Brake();
    }
}

 interface Vehicle {
abstract void Accelerate();
abstract void Brake();

    
}/**
 * Car
 */
 class Car implements Vehicle {
        Car(){

        }
    @Override
    public void Accelerate() {
       System.out.println("The wheels, being in contact with the ground and subject to static friction, exert a force on the ground. In accordance with Newton's Third Law, the ground exerts an equal and opposite force on the car. This reaction force on the car is what causes the car to accelerate");
    }
    @Overload
        public void Accelerate(int speed,int duration){
            System.out.println("Speed is :"+speed+"Duration is:"+duration);
        }

    @Override
    public void Brake() {
        System.out.println("Braking applies backwards moments to both wheels, causing them to slow down. To maintain non-slip, there is a backwards force from the ground at the point of contact. Because the wheel is slowing down, the car pushes forward on the axle.");
    }

    
}
class BiCycle implements Vehicle{
    BiCycle(){
        
    }
    @Override
    public void Accelerate() {
       System.out.println("In a bicycle, pedalling is done on the rear wheel. This means that we rotate the rear wheel to move forward. As the rear wheel rotates faster, the point on the wheel tends to move backwards. Friction due to the ground hence, acts in the forward direction to accelerate the bicycle.");
    }@Overload
    public void Accelerate(int speed,int duration){
        System.out.println("Speed is :"+speed+"Duration is:"+duration);
    }
    

    @Override
    public void Brake() {
        System.out.println("When we apply brakes in bicycle, the break rubbers rub against the wheels and prevent it from rotating. As the rubbers rub against the wheels, the friction between the rubber and the wheels comes into action and stops the wheel.");
    }

}