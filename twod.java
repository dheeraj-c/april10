public class twod{
  public static void main(String args[]){
    int twoda[][] = new int[4][];
    twoda[0] =  new int[1];
    twoda[1] =  new int[2];
    twoda[2] =  new int[3];
    twoda[3] =  new int[4];
    int k =0;
    for(int i=0; i<4; i++)
      for(int j=0; j<i+1; j++){
        twoda[i][j]=k;
        k++;
      }
    for(int i=0; i<4; i++){
      for (int j=0; j<i+1; j++){
        System.out.println(twoda[i][j]+ " ");
      }
      System.out.println();
    }

  }
}
