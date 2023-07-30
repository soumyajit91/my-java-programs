package others;
import java.util.*;
public class Saving_Ac
              {
                int acno;
                double money,depo=0,draw=0,balance=0;
                String name;
                public void withdraw(double mo)
                {
                    money=mo;
                    Scanner sc=new Scanner(System.in);
                    System.out.println("welcome to axis bank!!");
                    System.out.println("enter the acount number");
                    acno=sc.nextInt();
                    System.out.println("enter the name of A/c holder");
                    name=sc.next();
                    System.out.println("the present balance in the account is rs"+(money+depo-draw));
                    System.out.println("how much do you want to draw ?");
                    draw=sc.nextDouble();
                }
                public void deposit(double mo)
                {
                    money= mo;
                    Scanner sc=new Scanner(System.in);
                    System.out.println("welcome to axis bank!!");
                    System.out.println("enter the acount number");
                    acno=sc.nextInt();
                    System.out.println("enter the name of A/c holder");
                    name=sc.next();
                    System.out.println("the present balance in the account is rs"+(money+depo-draw));
                    System.out.println("how much money you want to deposit?");
                    depo=sc.nextDouble();
                }
                public void display()
                {
                    System.out.println("welcome to axis bank!!");
                    System.out.println("the A/c no.:"+acno);
                    System.out.println("name of the A/c holder:"+name);
                    System.out.println("the balance in the account "+(money+depo-draw));
                    System.out.println("thank you visit Again!!");
                }
                public void main()
                {
                    Scanner sc =new Scanner(System.in);
                    Saving_Ac ob=new Saving_Ac();
                    System.out.println("welcome to axis bank");
                    System.out.println("enter your bank balance shown on upi");
                    double mo=sc.nextDouble();
                    System.out.println("do you want to 1-deposit or 2-withdraw");
                    int ch = sc.nextInt();
                    switch (ch)
                    {
                        case 1:
                        ob.deposit(mo);
                        break;
                        case 2:
                        ob.withdraw(mo);
                        break;
                        default:
                        System.out.println("server down");
                    }
                    ob.display();
                }
            }
            
                    
                    