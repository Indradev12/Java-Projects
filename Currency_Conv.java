import java.util.Scanner;

public class Currency_Conv {
    public static void Convert(int a,int b,float value){
        if(a==1){
            if(b==1){
                System.out.println("Choose other currency to convert"); 
            }
            else if(b==2){
                System.out.println(+value +" of Indian Rupee to British Pound is: "+value*0.0096);
            }
            else if(b==3){
                System.out.println(+value +" of Indian Rupee to Euro: "+value*0.011);
            }
            else if(b==4){
                System.out.println(+value +" of Indian Rupee to USD: "+value*0.012);
            }
            else if(b==5){
                System.out.println(+value +" of Indian Rupee to Kuwaiti Dinar: "+value*0.0038);
            }
        }
        if(a==2){
            if(b==1){
                System.out.println(+value +" of British Pound to Indian Rupee is: "+value*104.24);
            }
            else if(b==2){
                System.out.println("Choose other currency to convert"); 
            }
            else if(b==3){
                System.out.println(+value +" of British Pound to Euro: "+value*1.16);
            }
            else if(b==4){
                System.out.println(+value +" of British Pound to USD: "+value*1.27);
            }
            else if(b==5){
                System.out.println(+value +" of British Pound to Kuwaiti Dinar: "+value*0.39);
            }
        }
        if(a==3){
            if(b==1){
                System.out.println(+value +" of Euro to Indian Rupee: "+value*89.64);
                 
            }
            else if(b==2){
                System.out.println(+value +" of Euro to British Pound is: "+value*0.86);
            }
            else if(b==3){
                System.out.println("Choose other currency to convert");
            }
            else if(b==4){
                System.out.println(+value +" of Euro to USD: "+value*1.09);
            }
            else if(b==5){
                System.out.println(+value +" of Euro to Kuwaiti Dinar: "+value*0.34);
            }
        }
        if(a==4){
            if(b==1){
                System.out.println(+value +" of USD to Indian Rupee: "+value*81.99);
                
            }
            else if(b==2){
                System.out.println(+value +" of USD to British Pound is: "+value*0.79);
            }
            else if(b==3){
                System.out.println(+value +" of USD to Euro: "+value*0.91);
            }
            else if(b==4){
                System.out.println("Choose other currency to convert"); 
            }
            else if(b==5){
                System.out.println(+value +" of USD to Kuwaiti Dinar: "+value*0.31);
            }
        }
        if(a==5){
            if(b==1){
                System.out.println(+value +" of Kuwaiti Dinar to Indian Rupee: "+value*267.69);
                 
            }
            else if(b==2){
                System.out.println(+value +" of Kuwaiti Dinar to British Pound is: "+value*2.57);
            }
            else if(b==3){
                System.out.println(+value +" of Kuwaiti Dinar to Euro: "+value*2.99);
            }
            else if(b==4){
                System.out.println(+value +" of Kuwaiti Dinar to USD: "+value*3.27);
            }
            else if(b==5){
                System.out.println("Choose other currency to convert");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("    Welcome To Currency Convertor  ");
        System.out.println("************************************");
        
        System.out.println("1.Indian Rupee");
        System.out.println("2.British Pound");
        System.out.println("3.Euro");
        System.out.println("4.United States Dollar");
        System.out.println("5.Kuwaiti Dinar");
        System.out.println("\nChoose the currency you to want convert from:");
        int a = sc.nextInt();
        System.out.println("Enter the value");
        float value = sc.nextInt();
        System.out.println("\nChoose the currency you want to convert to:");
        int b = sc.nextInt();
        Convert(a, b, value);

    }
}
