package inheritence;


class Bank
{

    int  getRateOfInterest()
    {
        return 10;

}
}
class SBI extends Bank
{
    int getRateOfInterest(){

        return 15;
}
}
 class ICICI extends Bank
 {
     int getRateOfInterest()
     {
        return 20;
     }

 }
public class overidding {
    public static void main(String []args)
    {
        SBI sbiobj = new SBI();
           System.out.println(sbiobj.getRateOfInterest()) ;
         ICICI iciciobj = new ICICI();
         System.out.println(iciciobj.getRateOfInterest());

    }


}

