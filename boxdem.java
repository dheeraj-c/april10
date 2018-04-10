class Box{
  public double height;
  public double width;
  public double length;
  public void Volume(){
    System.out.println("the volume is" + " " );
    System.out.println(height*width*length);
  }
}

class boxdem{
  public static void main(String args[]){
    Box mybox1 = new Box();
    Box mybox2 = new Box();
    mybox1.height = 10;
    mybox1.width =  2;
    mybox1.length = 1;
    mybox2.height = 2;
    mybox2.width = 3;
    mybox2.length  = 6;
    mybox1.Volume();
    mybox2.Volume();
  }
}
