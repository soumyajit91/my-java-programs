package lastbluej;
class check2
   {
     public static int gcd(int p, int q)
     {if(q==0)
         return p;
      return gcd(q,p%q);
    }
}
         






















