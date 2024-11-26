class sample{
    public int i;
    public int[] arr = new int[10];
    public void fun(int i, int val)
    {
        arr[i] = val;
    }
}
class Program
{
    static void Main(string[] args)
    {
        sample s = new sample();
        s.i = 10;
        sample.fun(1, 5);
        s.fun(1, 5);
        Console.ReadLine();
    }
}