
package others ;
public class v9{
int sum(int a,int b){
int tsum=0;;
for(int i=a;i<=b;i++){
if(i%2==0)
tsum=tsum+i;
else
tsum=tsum;
}
return tsum;
}
double sum(double n){
double pro=1.0;
for(double i=1.0;i<=n;i+=0.2){
pro=pro*i;
}
return pro;
}
int sum(int n){
int s=0;
int d;
while(n>0)
{
d=n%10;
s=s+d;
n=n/10;
}
return s;
}
public static void main(int a,int b, int c, double d){
v9 m=new v9();
System.out.println(m.sum(a,b));
System.out.println(m.sum(c));
System.out.println(m.sum(d));
}
}
 
 