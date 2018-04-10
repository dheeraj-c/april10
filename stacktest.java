class stack{
  //empty stack is -1
  int stack[] = new int[10];
  int ind;
  stack(){
    ind=-1;
  }

  void push(int num){
    if(ind==9){
      System.out.println("Stack is full");
    }
    else{
      stack[++ind]=num;
    }
  }
  void pop(int num1){
    if(ind==-1){
      System.out.println("Stack is empty");
    }
    else{
      stack[ind]=num1;
      ind--;
    }
  }
}

class stacktest{
  public static void main(String args[]){
    stack mystack= new stack();
    int k = 0;
    for (int i=0; i<9; i++){
        mystack.push(k);
        k++;
    }
  }
}
