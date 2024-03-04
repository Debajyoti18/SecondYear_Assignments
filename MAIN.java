//this is question 9
public class MAIN {
    public static void main(String[] args) {
        Student st1 =new Student(4, "Dev");
        Student st2 =new Student(7, "Moink");
        Course c1=new Course("Math");
        Course c2=new Course("Phy");
        Enrollment el=new Enrollment();
        el.enrolling(st1, c1);
        el.enrolling(st2, c2);
        el.displayEnrollmentDetails();
        el.dropping(st2, c2);
        el.displayEnrollmentDetails();


        
    }
}
class Student{
    int id;
    String name;
    Student(int x,String st){
        this.id=x;
        this.name=st;
    }
    String getName(){
        return this.name;
    }
    int getId(){
        return this.id;
    }
}
class Course {
    String coursename;
    Course(String x){
    this.coursename=x;
    }
    String getCourse(){
        return this.coursename;
    }
   
}
interface EnrollmentSystem{
    void enrolling(Student student,Course course);
    void dropping(Student student,Course course);
    void displayEnrollmentDetails();
   
}
class Enrollment implements EnrollmentSystem{
        Student[] st=new Student[10];
        Course[] c=new Course[6];
        int currentEnrollment;
        Enrollment(){
            this.currentEnrollment=0;
            
        }
    @Override
    public void enrolling(Student student, Course course) {
     st[currentEnrollment]=student;
     c[currentEnrollment]=course;
     currentEnrollment++;
     System.out.println(student.getName() + " enrolled in " + course.getCourse());

    }

    @Override
    public void dropping(Student student, Course course) {
        for (int i = 0; i < currentEnrollment; i++) {
            if (st[i].equals(student) && c[i].equals(course)) {
                st[i] = null;
                c[i] = null;
                System.out.println(student.getName() + " dropped from " + course.getCourse());
                break;
            }
        }
     
    }

    @Override
    public void displayEnrollmentDetails() {
        System.out.println("Enrollment Details:");
        for (int i = 0; i < currentEnrollment; i++) {
            if (st[i] != null && c[i] != null) {
                System.out.println(st[i].getName() + " is enrolled in " + c[i].getCourse());
            }
        }
        System.out.println();
    }
    
    
}