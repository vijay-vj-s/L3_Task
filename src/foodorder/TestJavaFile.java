package foodorder;

import java.util.ArrayList;

public class TestJavaFile {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("hi");
        list.add("hello");
        list.add("how");
        list.add("are");
        list.add("you");
        for(String s:list){
            System.out.println(s);
        }
    }
}
