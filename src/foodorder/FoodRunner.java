package foodorder;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

public class FoodRunner {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the Choice :");
            System.out.println("1-->SignUp");
            System.out.println("2-->logIn");
            System.out.println("3-->Search By Hotel");
            System.out.println("4-->Search By Food");
            System.out.println("0-->Exit");
            System.out.println("\n");
            int choice = sc.nextInt();

            CustomerDetails pojo = new CustomerDetails();
            Check c = new Check();
            switch (choice) {

                case 1:
                    CustomerDetails d1 = new CustomerDetails();
                    System.out.println("Enter the name :");
                    String name = sc.next();
                    d1.setName(name);

                    System.out.println("Enter the password :");
                    String passWord = sc.next();
                    d1.setPassword(passWord);

                    System.out.println("Enter the phone number :");
                    long phone_no = sc.nextLong();
                    d1.setPhone_no(phone_no);
                    System.out.println("Your user id is :" + d1.getUserId());
                    Check.add(d1);
                    break;

                case 2:
                    System.out.println("Enter your user Id :");
                    int userId = sc.nextInt();
                    System.out.println("Enter the password :");
                    passWord = sc.next();
                    c = new Check();
                    boolean ans = c.check(userId, passWord);
                    if (ans == true) {
                        System.out.println("Log iN successFully");
                    } else {
                        System.out.println("You have Entered Wrong Password");
                    }
                    break;


                case 3:
                    System.out.println("Select a hotel :");

                    System.out.println("Nivash-Bawan Hotel");
                    System.out.println("rakesh Hotel");
                    System.out.println("vijay hotel");
                    int choice1 = sc.nextInt();
                    c = new Check();
                    if (choice1 == 1) {
                        HashMap<String, Integer> ansMap = c.hotel1Menu();
                        System.out.println("Nivash Hotel Menu is :" + ansMap);
                        System.out.println("Select a food :");
                        System.out.println("press 0 to complete the order :");
                        String choice2 = sc.next();
                        int total = 0;
//                        while (choice2 != 0) {
//                            if (choice2 == 1) {
//                                total += 50;
//                            }
//                            if (choice2 == 2) {
//                                total += 60;
//                            }
//                            if (choice2 == 3) {
//                                total += 70;
//                            }
//                            choice2 = sc.nextInt();
//                        }
                        while(!choice2.equals("exit")){
                            total=ansMap.get(choice2);
                                System.out.println("Your Food Cost is :"+total);
                            }
                        System.out.println("Your food cost is :" + total);

                    }
                    if (choice1 == 2) {
                        HashMap<String, Integer> ansMap = c.hotel2Menu();
                        System.out.println("Rakesh Hotel Menu is :" + ansMap);
                        System.out.println("Enter The Food");
                        System.out.println("Enter exit to submit order");
                        String choice3 = sc.next();
                        int total = 0;
                        while (!choice3.equals("exit")) {
                            total = ansMap.get(choice3);
                            choice3=sc.next();
                        }
                        System.out.println("Your Food Cost is :"+total);
                    }
                    if (choice1 == 3) {
                        HashMap<String, Integer> ansMap = c.hotel3Menu();
                        System.out.println("Vijay Hotel Menu is :" + ansMap);
                    }
                    break;

                case 4:
                    System.out.println("<--Search By Food-->");
                    System.out.println("Enter the food");
                    String searchFood=sc.next();
                    c.searchingFood(searchFood);
                    break;

                case 0:
                    System.out.println("Food Ordering Application Closed SuccessFully");
                    break;

                default:
                    System.out.println("Enter a Valid Option");

            }
        }
    }
}
