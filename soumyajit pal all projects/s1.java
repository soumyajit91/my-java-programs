class s1
{
void count(int c)
 {
 if(c==0)
 System.out.println(" ");
 else
 {
 System.out.println("Hello" +c);
 count(--c);
 System.out.println(" "+c);
 }
 }
}
