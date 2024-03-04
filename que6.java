public class que6 {
    public static void main(String[] args) {
        Book b=new Book("wrain &  mterAuth()", "l.austin",987);
        b.displayDetails();
        Magazine m=new Magazine("The SAMAJA", "GOPABANDHU DAS", "12.2.1883");
        m.displayDetails();
        Dvd d=new Dvd("Ljs ","ILKAJB",12);
        d.displayDetails();
    }
}
abstract class  LibraryResource{
 private String title,author;
 LibraryResource(String x,String y){
    this.author=x;this.title=y;
 }
 String getterAuth(){
    return author;
 }
 void setterAuth(String x,String y){
    this.author=x;this.title=y;
 }
 String getTit(){
    return title;
 }
 void setTit(String x){
    this.title=x;
 }
  abstract void  displayDetails();
}
class Book extends LibraryResource{
    private int pageC;
    Book(String x,String y,int z){
       super(x, y);
    this.pageC=z;
    }
    int getterPageC(){
        return pageC;
    }
    void displayDetails(){
        System.out.println("Title of the book is :"+getterAuth()+"\n"+"Author name :"+getTit()+"\n"+"No of pages :"+pageC);
    }
}
class Magazine extends LibraryResource{
    String issuedate;
    Magazine(String x,String y,String z){
        super(x, y);
        this.issuedate=z;
    }
    String  getIssuedate(){
        return this.issuedate;
    }
    void setIssuedate(String x){
            this.issuedate=x;
    }
    @Override
    void displayDetails() {
        System.out.println("Title of the book is :"+getterAuth()+"\n"+"Author name :"+getTit()+"\n"+"Book issue date is:"+issuedate);
 
    }
  
}
class Dvd extends LibraryResource{
    int duration;
    Dvd(String x,String y,int z){
        super(x, y);
        this.duration=z;
    }
    int getDuration(){

        return this.duration;
    }
    void setDuration(int x){
        this.duration=x;
    }
    @Override
    void displayDetails() {
        System.out.println("Title of the book is :"+getterAuth()+"\n"+"Author name :"+getTit()+"\n"+"Dvd duration is:"+getDuration());
    }
    
}