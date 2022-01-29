package oops;

public class Human

{
    String  name ;
    String lastname;
    int age;
    public void Speak()
    {
        System.out.println(name);
        System.out.println(lastname);
        System.out.println(age);
    }

   public static void main (String args[])
   {
     Human human1= new Human();
     human1.name = "Harry";
     human1.lastname="peterson";
     human1.age = 30;
     human1.Speak();
   }
}
