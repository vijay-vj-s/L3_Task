package foodorder;

import java.util.HashMap;

public class Check {
    static HashMap<Integer,CustomerDetails>map=new HashMap<>();
    public static void add(CustomerDetails cus){
        map.put(cus.getUserId(),cus);
    }
    public static boolean  check(int userID,String passWord){
        CustomerDetails cus=map.get(userID);
        String str=cus.getPassword();
        if(passWord.equals(str)){
          return true;
        }
        else{
            return false;
        }
    }

    public static HashMap<String,Integer> hotel1Menu(){
        HashMap<String,Integer>food=new HashMap<>();
        food.put("pizza",100);
        food.put("burger",90);
        food.put("rice",100);
        return food;
    }
    public static HashMap<String,Integer> hotel2Menu(){
        HashMap<String,Integer>food=new HashMap<>();
        food.put("tea",10);
        food.put("vadai",5);
        food.put("veg-rice",70);

        return food;
    }
    public static HashMap<String,Integer> hotel3Menu(){
        HashMap<String,Integer>food=new HashMap<>();
        food.put("veg-rice",60);
        food.put("chicken-rice",70);
        food.put("egg-rice",80);
        return food;
    }

    public void searchingFood(String searchFood) {

        if(hotel1Menu().containsKey(searchFood)){
            System.out.println("Your Food cost in hotel1 : "+hotel1Menu().get(searchFood));
        }
        if(hotel2Menu().containsKey(searchFood)){
            System.out.println("your Food  cost is :"+hotel2Menu().get(searchFood));
        }
        if(hotel3Menu().containsKey(searchFood)){
            System.out.println("your Food Cost :"+hotel3Menu().get(searchFood));
        }
        else {
            System.out.println("Food not Available at the hotel");
        }

    }
}
