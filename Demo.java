class Student{
    int indexNum;
    String name;
    int mark;
}
public class Demo{
    public static void main(String args[]){

    Student s1=new Student();
    s1.indexNum=5;
    s1.name="kapila";
    s1.mark=75;

    Student s2=new Student();
    s2.indexNum=2;
    s2.name="saman";
    s2.mark=85;

    Student s3=new Student();
    s3.indexNum=7;
    s3.name="nimal";
    s3.mark=77;

   Student students[]=new Student[3];
   students[0]=s1;
   students[1]=s2;
   students[2]=s3;

   for(int i=0;i<students.length;i++){
    System.out.println(students[i].name+" "+":"+" "+students[i].indexNum);
   }


   
       }
    
}