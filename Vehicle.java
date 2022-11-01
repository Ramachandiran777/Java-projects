import java.io.*;
class vehicle
{
public void Helicopter()
{
  System.out.println("Helicopter is a mode of  transport");
}
}

class Twowheeler extends Vehicle
{
  public void racebikes()
 {
  System.out.println("Used for racing");
}
}

class Fourwheeler extends vehicle
{
public void Lorry()
{ 
System.out.println("Used to load goods");
}
}

class Cycle extends vehicle
{
 public void bicycle()
{
 System.out.println("Cycling is a good excercise");
}
}

class Ship extends Vehicle
{
public void Ship()
{
System.out.println("Ships are used to load goods to other countries");
}
}

class Main 
{
public static void main(String[] args)
{
Twowheeler obj1 = new Twowheeler();
Fourwheeler obj2 = new Fourwheeler();
Cycle obj = new Cycle();
Ship obj4 = new Ship();
obj1.Helicopter();
obj2.racebikes();
obj3.Lorry();
obj4.bicycle();
}
}

