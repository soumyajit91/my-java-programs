class aba
{
int Conv (int n)
{
if(n  == 0)
return 0;
else
return Conv(n/2) * 10 + (n%2);
}
}
