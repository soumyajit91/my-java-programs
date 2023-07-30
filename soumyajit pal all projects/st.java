class st
{
void show(int N)
{
 if(--N>1)
 {
 show(--N);
 System.out.print((N-- )+" ");
 }
} 
}