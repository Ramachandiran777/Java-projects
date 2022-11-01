class Testoverload
{
  private static void sayHello()
{
   System.out.println("Hello GHF\n");
}
private static void sayHello(String a)
{
   System.out.println(" " +a);
}
public static void main(String[] args)
{
  sayHello();
  sayHello("Hello");
}
}
