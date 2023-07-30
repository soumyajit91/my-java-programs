package lastbluej;

class check{
    int temp=0;
   int reverse(int a)
   {
      
       if((a/10)<=10)
       return a;
       else
       {
       
       temp=(temp*10) +a;
    }
    System.out.println(temp);
    return reverse(a/10);
}
}