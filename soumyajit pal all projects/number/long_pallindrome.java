package number;

import java.util.*;
class long_pallindrome
   {
       int pallindrome(String n)
       {
           int c=0,i,k;
          for(i=0;i<n.length()/2;i++)
          {
              k=n.length()-i-1;
              if(n.charAt(i)==n.charAt(k))
              c++;
            }
          if(c==n.length()/2)
           return 1;
           else
           return 0;
        }
    }