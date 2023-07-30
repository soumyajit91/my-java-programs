package array;
class check
{
int Toy(int n)
{ return (n<=0)? 1: n%10 + Toy(n/10); }
}