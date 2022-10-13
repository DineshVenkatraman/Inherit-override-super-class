abstract class father
{
    int i=100;
    abstract public void prayer();

}
class child extends father
{
    int i=200;
    public void prayer()
    {

        System.out.println("Child is regularly doing prayers");
    }
    public void singer()
    {
        System.out.println("Child is very good Singer");
    }
}
class child2 extends father
{

    public void prayer()
    {

        System.out.println("Child-2 is regularly doing prayers");
    }
    public void cricketer()
    {
        System.out.println("Child is very good Cricketer");
    }
}
public class inherabstractoverrid {
    public static void main(String args[])
    {

        child c=new child();
        c.prayer();
        child2 c2=new child2();
        c2.prayer();
        System.out.println(c.i);
        father f=new child();
        f.prayer();
        f=new child2();
        f.prayer();
    }
}
