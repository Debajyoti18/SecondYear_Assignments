 class que5 {
    public static void main(String[] args) {
        College c1=new College();
        College c2=new College();
        c1.collegeName="Revenshaw ";
        c1.collegeLoc="Cuttuck";
        c2.collegeName="BJB";
        c2.collegeLoc="BBSR";
      
       
        Student st1=new Student(224156, "Debajyoti  ",c1.collegeName,c1.collegeLoc);
        st1.displayStudentInfo();
        Student st2=new Student(224196, "Maneesh ",c2.collegeName,c2.collegeLoc);
        st2.displayStudentInfo();

    }
}
/**
 * College
 */
 class College {
    String collegeName;
    String collegeLoc;
    
}class Student extends College{
    int studentId;
    String studentName;
    Student(int x,String y,String s,String z){
        this.studentId=x;
        this.studentName=y;
        this.collegeName=s;
        this.collegeLoc=z;
    }
    void displayStudentInfo(){
        System.out.println("Student's Name is "+studentName+"Students id is "+studentId+"college name :"+collegeName+"college location:"+collegeLoc);

    }
}