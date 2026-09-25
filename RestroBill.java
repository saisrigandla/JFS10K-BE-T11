import java.util.Scanner;
public class RestroBill {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Navinder Restro");

        String item1= "chickenBiryani";
        System.out.print("Enter the Quantity of chicken biryani: ");
        int Quantity1=sc.nextInt();
        int Price1=120;
        int Amount1=Quantity1*Price1;
        
        String item2="muttonBiryani";
        System.out.print("Enter the Quantity of mutton biryani: ");
        int Quantity2=sc.nextInt();
        int Price2=520;
        int Amount2=Quantity2*Price2;

        int totalBill=Amount1+Amount2;
        
        int discount20=(totalBill*20)/100;
        int payableAmount1=totalBill-discount20;
        
        int discount10=(totalBill*10)/100;
        int payableAmount2=totalBill-discount10;
        
        System.out.println("item          Quantity          Price          Amount");
        System.out.println(item1+" "+Quantity1+"          "+Price1+"          "+Amount1);
        System.out.println(item2+" "+Quantity2+"          "+Price2+"          "+Amount2);
        System.out.println("------------------------------------------");

        System.out.println("totalBill "+totalBill);
        
        if(totalBill>1000){
            System.out.println("Discount                               "+discount20);
            System.out.println("Payable Amount                               "+payableAmount1);
        }
        else if(totalBill>500){
            System.out.println("Discount                               "+discount10);
            System.out.println("Payable Amount                               "+payableAmount2);
        }else{
            System.out.println("Discount "+"                    0%");
            System.out.println("Payable Amount                               "+totalBill);
        }

        System.out.println("Thankyou, Visit Again!!!");
    }
}
