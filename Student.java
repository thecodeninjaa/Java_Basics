import java.util.*;

class Student{
    private int roll;
    private String name;
    private float marks;

    public Student(int a, String b, float c){
        roll = a;
        name = b;
        marks = c;
    }

    public void display(){

        System.out.println(+roll+"\t\t"+name+"\t\t"+marks);
    }
}

class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int r,i,num;
        float m;
        String n;

        System.out.println("Enter the roll number");
        r = sc.nextInt();

        System.out.println("Enter the name");
        n = sc.next();

        System.out.println("Enter the marks");
        m = sc.nextFloat();

        Student st1= new Student(r,n,m);
        st1.display();

        // Using loop to enter student data
        System.out.println("Enter the number of students");
        num=sc.nextInt();



          Student st[] = new Student[num];
          for(i=0;i<st.length;i++){
              System.out.println("Enter the roll number");
              r = sc.nextInt();

              System.out.println("Enter the name");
              n = sc.next();

              System.out.println("Enter the marks");
              m = sc.nextFloat();

              st[i] = new Student(r,n,m);

          }
        System.out.println("Student Data \n Roll no\t\tName\t\tMarks");
          for(i=0;i<st.length;i++){
              st[i].display();
          }



    }
}