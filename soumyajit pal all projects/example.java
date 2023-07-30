class example {
   int k,m;
   example() 
   {
    k = 5;
    m = 3;
    System.out.println("non - parameterized Constructor is called");
  }
  example(int a,int b)
  {
      k=a;
      m=b;
       System.out.println(" parameterized Constructor is called");
    }
   example(example c) { 
        System.out.println("Copy constructor called"); 
        k = c.k; 
        m=c.m;
    } 
   void display()
   {
       System.out.println("the value of k  "+k);
       System.out.println("the value of m  "+m);
    }
  public  void main(int a,int b)
  {
    
    example obj = new example();
    example obj1 = new example(a,b);
    
    example obj2 = new example(obj1);
    obj.display();
    obj1.display();
    obj2.display();
   }
}