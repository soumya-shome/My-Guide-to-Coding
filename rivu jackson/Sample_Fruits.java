class Mango
{
    public void Season()
    {
        System.out.println("Mango is the king of fruits");
    }
}
class Apple
{
    public void Season()
    {
        System.out.println("Apples are produced in Kashmir");
    }
}
class Grape
{
    public void Season()
    {
        System.out.println("Grapes are produced in Maharashtra");
    }
}
public class Sample_Fruits
{
    public static void main()
    {
        Mango Fruit1 = new Mango();
        Apple Fruit2 = new Apple();
        Grape Fruit3 = new Grape();
        Fruit2.Season();
        Fruit1.Season();
        Fruit3.Season();
    }
}