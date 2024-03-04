public class que2ass1 {
    public static void main(String[] args) {
        Employee e1=new Employee("Swetanj", 12);
        e1.display();
    }
}
class Employee{
    String empName;int empId;
    Employee(String x,int y){
        this.empName=x;
        this.empId=y;
    }
    void display(){
        System.out.println("Employee Name is :"+empName+"\n"+"Employee Id:"+empId);
    }
    
}