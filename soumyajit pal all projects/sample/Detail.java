package sample;
class Detail extends Author
{
    String name,address,telno;
    int rent;
    Detail(String na,String a,String t,int r)
    {
        name=na;address=a;telno=t;
        rent=r;
    }
    void show()
    {
        System.out.println("name \t  address \t telephone no. \t  base rent");
        System.out.println(name+"\t"+ address+"\t " +telno+"\t"+ rent );
    }
}
