class Box{
  //doesnt have to be public
  double height;
  double length;
  double width;
  //param construct, pyth like
  Box(double h, double l, double w){
    height=h;
    length=l;
    width=w;
  }
  void Vol(){
    System.out.println(height*length*width);
  }
}
class paramconstruct{
  public static void main(String args[]){
    Box mybox1 = new Box(1, 2, 3);
    Box mybox2 = new Box(4, 5, 6);
    mybox1.Vol();
    mybox2.Vol();
  }
}
