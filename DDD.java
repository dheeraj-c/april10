class Student
{
  public int Rollno;
  public String Name;
  Student(int Rollno, String Name)
  {
    this.Rollno = Rollno;
    this.Name = Name;
  }
}
public class DDD
{
  public static void main(String args[])
  {
    Student[] arr; //declared new array
    arr= new Student[5]; //declared size
    arr[0] = new Student(1, "ddd");
    arr[1] = new Student(2, "ccc");
    arr[2] = new Student(3, "fff");
    arr[3] = new Student(4, "lll");
    arr[4] = new Student(5, "ppp");
    for(int i=0; i<arr.length; i++)
    {
      System.out.println("The value at index" + " " + i + "is:"+ " " + arr[i].Rollno + " " + arr[i].Name);
    }
  }
}
