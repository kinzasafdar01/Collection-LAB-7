import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;


public class Main2 {
    public static void main(String[] args) {
        String text="People often use the terms health and wellness interchangeably. Although a person cannot have one and not the other. they are two different concepts that are quite variable, and their meanings are different.";
        ArrayList<String> list=new ArrayList<>();
        list.addAll(List.of(text.split(" ")));



        for(String a: list)
            System.out.println(a);
        System.out.println("Total Words:");
        System.out.println(list.size());


        Set<String> set1=new HashSet<>();
        set1.addAll(list);
        System.out.println("UNIQUE WORDS:");
        System.out.println(set1.size());

        ArrayList<String> list2=new ArrayList<>();
        list2.addAll(List.of(text.split("\\.")));
        System.out.println("TOTAL SENTENCES:");
        System.out.println(list2.size());


        System.out.println("TOTAL CHARACTERS:");
            char list4[]=text.toCharArray();
            System.out.println(list4.length);


        char charArray[]=text.toCharArray();
        HashSet<Character> uniqueChar=new HashSet<>();
        for(Character char1:charArray)
            uniqueChar.add(char1);
        System.out.println("UNIQUE CHARACTERS:");
        System.out.println(uniqueChar.size());





    }
}
