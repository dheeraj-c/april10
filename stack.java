class stack{
  //empty stack is -1
  int ind=-1;
  int stack[] = new int[10];

  void push(int num){
    if(ind==9){
      System.out.println("Stack is full");
    }
    else{
      stack[ind]=num;
      ind++;
    }
  }
  void pop(int num1){
    if(ind==-1){
      System.out.println("Stack is empty");
    }
    else{
      stack[ind]=num1;
    }
  }
}
