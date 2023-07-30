package string;
import java.util.*;
class Tokenizer2
{
 public static void main(int n)
 {
     System.out.println(n);
  int lim,ispr,divisor;
  lim=0;
  if(n==1||n==0)
  ispr=0;
  else
  {
      ispr=1;
      for(divisor=1;divisor<=lim;divisor+=2)
      {
          if(n%divisor==0)
          ispr=0;
        }
  
}
System.out.println(ispr);
}
}
