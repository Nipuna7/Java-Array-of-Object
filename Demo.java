class Student{
    int indexNum;
    String name;
    int mark;
}
public class Demo{
    public static void main(String args[]){

//     Student s1=new Student();
//     s1.indexNum=5;
//     s1.name="kapila";
//     s1.mark=75;

//     Student s2=new Student();
//     s2.indexNum=2;
//     s2.name="saman";
//     s2.mark=85;

//     Student s3=new Student();
//     s3.indexNum=7;
//     s3.name="nimal";
//     s3.mark=77;

//    Student students[]=new Student[3];
//    students[0]=s1;
//    students[1]=s2;
//    students[2]=s3;

//    for(int i=0;i<students.length;i++){
//     System.out.println(students[i].name+" "+":"+" "+students[i].indexNum);
//    }

        //  first object from Nipuna Class
    Nipuna nipuna1 = new Nipuna();
    nipuna1.name = "Nirodha Nipuna";
    nipuna1.age = 23;

    // second object from Nipuna Class
    Nipuna nipuna2 = new Nipuna();
    nipuna2.name = "Kapila";
    nipuna2.age = 23;

    Nipuna nipun[] = new Nipuna[3];
    nipun[0] = nipuna1;
    nipun[1] = nipuna2;

    for (Nipuna nipuna : nipun) {
        System.out.println(nipuna);
    }

    }
    
}