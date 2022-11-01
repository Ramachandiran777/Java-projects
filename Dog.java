class Dog
{
   void s1()
  { 
      System.out.println("Dog Nickname is Rolex ");
  }
   void s2()
  {
      System.out.println("Dog color is white");
  }

class Labrador extends Dog
{

   void s1()
   {
      System.out.println("Labrador is cute,barking");
    }
    {
      System.out.println("Labradors are very Energitic");
     }
}
class Main
{
   public static void main(String[] args)
{
   Dog obj1 = new Labrador();
   obj1.s1();
   obj1.s2();
}
}
}
