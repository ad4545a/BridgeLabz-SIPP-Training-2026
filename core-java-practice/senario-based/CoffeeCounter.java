import java.util.*;
public class CoffeeCounter {
    public static  boolean flag = true;
    public static  List<String> name = new ArrayList<>();
    public static  List<Integer> qunt = new ArrayList<>();
    public static  double  total_gst = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = 0;
        while(flag==true){
        System.out.println("select the coffee type:- \n1. capichino   50\n2. Expresso   60\n3. Moccha   70\n0.Exit");
        System.out.println("Enter the coffee type no");
        int coffee = sc.nextInt();
        System.out.println("Enter the quantity: -");
        int quantity = sc.nextInt();
        
        switch(coffee){
            case 1:
            bill += 50*quantity; 
            name.add("capichino");
            qunt.add(quantity);
            case 2:bill += 60*quantity; 
            name.add("capichino");
            qunt.add(quantity);
            case 3:bill += 70*quantity; 
            name.add("capichino");
            qunt.add(quantity);
        }
        bill += bill;
        
        nextOrder(sc);    
    }
    total_gst = (bill*0.05);
    System.out.println("your total bill:- ");
    System.out.println("Coffee      Qty ");
    for(int i=0;i<name.size();i++){
        System.out.println(name.get(i)+"      "+qunt.get(i));
    }
    System.out.println("Gst:-           "+total_gst);
    System.out.println("Total bill:-     "+bill);
    }
    public static void nextOrder(Scanner sc){
        System.out.println("For next order press 1\nFor exit press 0");
        int next = sc.nextInt();
        if(next == 0){
            flag = false;   
        }
        else if (next==1){
            flag = true;
        }
        else{
           System.out.println("enter the correct option"); 
           nextOrder(sc);
        }

        
    }
}
