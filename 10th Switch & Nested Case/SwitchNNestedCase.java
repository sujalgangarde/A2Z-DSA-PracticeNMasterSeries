import java.util.Scanner;

public class SwitchNNestedCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //* System.out.println("Enter fruit: ");
        // String fruit = sc.next();
        
        // some information : if a string a = sujal and b = sujal. now to check both a and b are pointing to the same object or different object use sout(a == b); -->> if true then yes. so == only check the object location and decide equality. so to check the equality use .equals() function.
        
        // if (fruit == "mango") its not correct i.e '==' only checks the location . correct is : if (fruit.equals("mango")) it checks values.
        
        // if(fruit.equals("mango")){
        //     System.out.println("King");
        // }
        // if(fruit.equals("apple")){
        //     System.out.println("Redish");
        // }

//here to avoid such repitition of code for large data set we use switch cases.

        // switch(fruit){
        //     case "mango":
        //         System.out.println("king");
        //         break;
                
        //     case "apple":
        //         System.out.println("redish");
        //         break;

        //     case "orange":
        //         System.out.println("i like");
        //         break;
                
        //     default :
        //         System.out.println("enter valid fruit");
        // }

        // OR

        // switch(fruit){
        //     case "mango" -> System.out.println("king");
                
        //     case "apple" -> System.out.println("redish");

        //     case "orange" -> System.out.println("i like");
                
        //     default -> System.out.println("enter valid fruit");
        // }


        //* System.out.println("Enter Day no: ");
        // int day = sc.nextInt();


        // switch(day){
        //     case 1 -> {
        //         System.out.println("Sunday"); // Also like this for multiple usecases
        //     }
        //     case 2 -> System.out.println("Monday");
        //     case 3 -> System.out.println("Tuesday");
        //     case 4 -> System.out.println("Wednesday");
        //     case 5 -> System.out.println("Thursday");
        //     case 6 -> System.out.println("Friday");
        //     case 7 -> System.out.println("Satday");
        //     default -> System.out.println("Invalid");
            
        // }

        // for multiple case single output

        // switch(day){
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //         System.out.println("Weekday");
        //         break;
        //     case 6:
        //     case 7:
        //         System.out.println("Weekend");
        //         break;
        //     default:
        //         System.out.println("Invalid");
        // }

        // OR

        // switch(day){
        //     case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
        //     case 6, 7 -> System.out.println("Weekend");
        //     default -> System.out.println("Invalid");
        // }


        // NESTED SWITCH CASES


        // System.out.println("Enter id: ");
        // int id = sc.nextInt();
        // System.out.println("Enter dept: ");
        // String dept = sc.next();

        // switch(id){
        //     case 1:
        //         System.out.println("Sujal");
        //         break;
        //     case 2:
        //         System.out.println("Kunal");
        //         break;
        //     case 3:
        //         switch(dept){
        //             case "it":
        //                 System.out.println("Om");
        //                 break;
        //             case "comp":
        //                 System.out.println("Rahul");
        //                 break;
        //             default:
        //                 System.out.println("No Placement");
        //         }
        //         break;
        //     case 4:
        //         System.out.println("Vaibhav");
        //         break;
        //     default:
        //         System.out.println("Invalid ID");
        // }

        // OR

        // switch(id){
        //     case 1 -> System.out.println("Sujal");
        //     case 2 -> System.out.println("Kunal");
        //     case 3 -> {
        //         switch(dept){
        //             case "it" -> System.out.println("Om");
        //             case "comp" -> System.out.println("Rahul");
        //             default -> System.out.println("No Placement");
        //         }
        //     }
        //     case 4 -> System.out.println("Vaibhav");
        //     default -> System.out.println("Invalid ID");
        // }


        sc.close();
    }
}
