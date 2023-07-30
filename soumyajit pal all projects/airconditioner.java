import java.util.*;
class airconditioner
       {
           public static void main()
           {
               Scanner sc=new Scanner(System.in);
               Scanner in=new Scanner(System.in);
               int ch=1,b;
               double amt1,amt2,amtf=0.0;;
               String name;int method;
               System.out.println("welcome to  ac electonic market");
               while(ch>0)
               {
               System.out.println("pls enter the customer name ");
               name =in.nextLine();
              
               System.out.println("enter choice 1 for first floor,2 for secpnd floor ,3 third floor");
               ch =sc.nextInt();
               
               switch(ch)
               {
                   case 1:
                   System.out.println("first floor;voltas");
                   System.out.println("the class,types ,size,prize and the discounts are");
                   System.out.println("Class:A    window    1.5tons    rs27450    5%");
                   amt1=28450 -(27450*0.05);
                   System.out.println("amount to be paid for class A"+amt1);
                   System.out.println("Class:B    split     1.5tons    rs 31500  10%");
                   amt2=31500-(31500*0.1);
                   System.out.println("amount paid for class b"+amt2);
                   System.out.println("enter choice 1 for class A or 2 for class B which send for billing");
                   b=sc.nextInt();
                   switch(b)
                   { 
                    case 1:
                     System.out.println("the bill procesing enter details:");
                     amtf=amtf+amt1;
                      System.out.println("mode of payment 1- cash. 2- cheque 3 - card 4- netbanking ");
                     method =sc.nextInt();
                     
                      if(method==1)
                     {
                     System.out.println("name       model       type       amount        payament method");                     
                     System.out.println(name+"     classB(voltas)          split"+amt1+"      "+"cash");
                    }
                    else if(method==2)
                    {                        
                        System.out.println("name       model       type       amount       payament method");                    
                        System.out.println(name+"     classB(voltas)          split"+amt1+"      "+"cheque");                        
                    }
                    else if(method==3)
                    {                        
                        System.out.println("name       model       type       amount      payament method");                    
                        System.out.println(name+"     classB(voltas)          split"+amt1+"      "+"card");                        
                    }
                    else if(method==4)
                    {                        
                        System.out.println("name       model       type       amount      payament method");                    
                        System.out.println(name+"     classB(voltas)          split"+amt1+"      "+"netbanking");                        
                    }
                     else
                    System.out.println("wrong method of payement");
                     break;
                     case 2:
                     System.out.println("the bill procesing enter details:");
                      amtf=amtf+amt2;
                     System.out.println("mode of payment 1- cash. 2- cheque 3 - card 4- netbanking ");
                     method =sc.nextInt();
                      if(method==1)
                     {
                     System.out.println("name       model       type       amount        payament method");                     
                     System.out.println(name+"     classB(voltas)          split"+amt2+"      "+"cash");
                    }
                    else if(method==2)
                    {                        
                        System.out.println("name       model       type       amount      payament method");                    
                        System.out.println(name+"     classB(voltas)          split"+amt2+"      "+"cheque");                        
                    }
                    else if(method==3)
                    {                        
                        System.out.println("name       model       type       amount       payament method");                    
                        System.out.println(name+"     classB(voltas)          split"+amt2+"      "+"card");                        
                    }
                    else if(method==4)
                    {                        
                        System.out.println("name       model       type       amount       payament method");                    
                        System.out.println(name+"     classB(voltas)          split"+amt2+"      "+"netbanking");                        
                    }
                    else
                    System.out.println("wrong method of payement");
                     break;
                     default:
                     System.out.println("error");
                    }
                    break;
                   case 2:
                   System.out.println("second  floor;LG");
                   System.out.println("the class,types ,size,prize and the discounts are");
                   System.out.println("Class:A    window    1.5tons    rs28450    6%");
                   amt1=28450 -(28450*0.06);
                   System.out.println("amount to be paid for class A"+amt1);
                   System.out.println("Class:B    split     1.5tons    rs 32000  8%");
                   amt2=32000-(32000*0.1);
                   System.out.println("amount paid for class b"+amt2);
                   System.out.println("enter choice 1 for class A or 2 for class B which send for billing");
                   b=sc.nextInt();
                   switch(b)
                   { 
                    case 1:
                     System.out.println("the bill procesing enter details:");
                      amtf=amtf+amt1;
                     System.out.println("mode of payment 1- cash. 2- cheque 3 - card 4- netbanking ");
                     method =sc.nextInt();
                      if(method==1)
                     {
                     System.out.println("name       model       type       amount       payament method");                     
                     System.out.println(name+"     classA(LG)          window"+amt1+"      "+"cash");
                    }
                    else if(method==2)
                    {                        
                        System.out.println("name       model       type       amount      payament method");                    
                        System.out.println(name+"     classA(LG)          window"+amt1+"      "+"cheque");                        
                    }
                    else if(method==3)
                    {                        
                        System.out.println("name       model       type       amount      payament method");                    
                        System.out.println(name+"     classA(LG)          window"+amt1+"      "+"card");                        
                    }
                    else if(method==4)
                    {                        
                        System.out.println("name       model       type       amount      payament method");                    
                        System.out.println(name+"     classA(LG)          window"+amt1+"      "+"netbanking");                        
                    }
                     else
                    System.out.println("wrong method of payement"); 
                    
                     break;
                     case 2:
                     System.out.println("the bill procesing enter details:");
                      amtf=amtf+amt2;
                     System.out.println("mode of payment 1- cash. 2- cheque 3 - card 4- netbanking ");
                     method =sc.nextInt();
                     if(method==1)
                     {
                     System.out.println("name       model       type       amount       payament method");                     
                     System.out.println(name+"     classB(LG)          split"+amt2+"      "+"cash");
                    }
                    else if(method==2)
                    {                        
                        System.out.println("name       model       type       amount       payament method");                    
                        System.out.println(name+"     classB(LG)          split"+amt2+"      "+"cheque");                        
                    }
                    else if(method==3)
                    {                        
                        System.out.println("name       model       type       amount       payament method");                    
                        System.out.println(name+"     classB(LG)          split"+amt2+"      "+"card");                        
                    }
                    else if(method==4)
                    {                        
                        System.out.println("name       model       type       amount       payament method");                    
                        System.out.println(name+"     classB(LG)          split"+amt2+"      "+"netbanking");                        
                    }
                     else
                    System.out.println("wrong method of payement");
                     break;
                     default:
                     System.out.println("error");
                    }
                    break;
                    case 3:
                   System.out.println("third floor;samsung");
                   System.out.println("the class,types ,size,prize and the discounts are");
                   System.out.println("Class:A    window    1.5tons    rs26450    2%");
                   amt1=26450 -(26450*0.05);
                   System.out.println("amount to be paid for class A"+amt1);
                   System.out.println("Class:B    split     1.5tons    rs 31000  7%");
                   amt2=31000-(31000*0.1);
                   System.out.println("amount paid for class b"+amt2);
                   System.out.println("enter choice 1 for class A or 2 for class B which send for billing");
                   b=sc.nextInt();
                   switch(b)
                   { 
                    case 1:
                     System.out.println("the bill procesing enter details:");
                       amtf=amtf+amt1;
                      System.out.println("mode of payment 1- cash. 2- cheque 3 - card 4- netbanking ");
                     method =sc.nextInt();
                     if(method==1)
                     {
                     System.out.println("name       model       type       amount         payament method");                     
                     System.out.println(name+"     model(samsung)           window "+amt1+"      "+"cash");
                    }
                    else if(method==2)
                    {                        
                        System.out.println("name       model       type       amount       payament method");                    
                        System.out.println(name+"     model(samsung)           window "+amt1+"      "+"cheque");                        
                    }
                    else if(method==3)
                    {                        
                        System.out.println("name       model       type       amount        payament method");                    
                        System.out.println(name+"     model(samsung)           window "+amt1+"      "+"card");                        
                    }
                    else if(method==4)
                    {                        
                        System.out.println("name       model       type       amount         payament method");                    
                        System.out.println(name+"     model(samsung)           window "+amt1+"      "+"netbanking");                        
                    }
                     else
                    System.out.println("wrong method of payement"); 
                  
                     break;
                     case 2:
                     System.out.println("the bill procesing enter details:");
                        amtf=amtf+amt2;
                      System.out.println("mode of payment 1- cash. 2- cheque 3 - card 4- netbanking ");
                     method =sc.nextInt();
                     if(method==1)
                     {
                     System.out.println("name       model       type       amount        payament method");                     
                     System.out.println(name+"     model(samsung)          split"+amt2+"      "+"cash");
                    }
                    else if(method==2)
                    {                        
                        System.out.println("name       model       type       amount       payament method");                    
                        System.out.println(name+"     model(samsung)          split"+amt2+"      "+"cheque");                        
                    }
                    else if(method==3)
                    {                        
                        System.out.println("name       model       type       amount       payament method");                    
                        System.out.println(name+"     model(samsung)          split"+amt2+"      "+"card");                        
                    }
                    else if(method==4)
                    {                        
                        System.out.println("name       model       type       amount        payament method");                    
                        System.out.println(name+"     model(samsung)          split"+amt2+"      "+"netbanking");                        
                    }
                     else
                    System.out.println("wrong method of payement");
                     break;
                     default:
                     System.out.println("error");
                    }
                   break;
                   default:
                   System.out.println("System black out, check server");
                }
               System.out.println("to continue press any key to exit press zero");
               ch=sc.nextInt();
            }
            System.out.println("the final billing amount required to be paid is :-"+amtf); 
            System.out.println("thanks for visiting come again soon");
        }
            
    }           
  