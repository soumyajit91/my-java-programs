package sample;

class Author extends Detail
{
    String authorno,name;
    Author()
    {
        authorno ="";name="";
    }
    Author(String n,String s)
    {
        authorno =n;name=s;
    }
    void show()
    {
        System.out.println("Enter the author number:"+authorno);
        System.out.println("Enter author name:"+name);
    }
}