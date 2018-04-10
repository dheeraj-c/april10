class Student{
  public int Rollno;
  public String Name;
  Student(int Rollno, String Name){
    this.Rollno = rollno;
    this.Name = name;
  }
}
public class DDD{
  public static void main(String args[]){
    Student[] arr; //declared new array
    arr= new.Student[5]; //declared size
    arr[0] = Student(1, "ddd");
    arr[1] = Student(2, "ccc");
    arr[2] = Student(3, "fff");
    arr[3] = Student(4, "lll");
    arr[4] = Student(5, "ppp");
  }
  for(i=0; i<arr.length; i++){
    System.out.println("The value at index" + "" + i + "is:"+ "" + arr[i].rollno + "" + arr[i].name);
  }
}
