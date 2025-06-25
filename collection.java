//  1. find the first duplicate element in list

// import java.util.HashSet;

// public class collection {
//     public static Integer firstduplicate(int a[]){
//         HashSet<Integer> set= new HashSet<>();
//         for(int num:a){
//             if(set.contains(num)){
//                 return num;
//             }
//             set.add(num);
//         }
//         return null;
//     }
//      public static void main(String[] args) {
//         int a[]={2,3,4,3,2,3,4};
//         Integer fds= firstduplicate(a);
//         if(fds!= null){
//             System.out.println("fds element is"+ fds);
//         }else{
//             System.out.println("No duplicate element found");
//         }}}
                //  \\\\\\\\\\\\\\\
// import java.util.HashSet;
// public class collection {
// public static void main(String[] args) {
//         int a[]={3,5,6,3,2,3,6,4};
//         HashSet<Integer> set= new HashSet<>();
//         for(int num:a){
//             if(set.contains(num)){
//                 System.out.println(" duplicate num is"+num);};
//             set.add(num);
//         }}}



// 2. Find the secoond duplicate element in set;

// import java.util.HashSet;
// public class collection {
//     public static Integer secondduplicate(int a[]){
//         int doublecount=0;
//         HashSet<Integer> set = new HashSet<>();
//         for(int num:a){
//             if(set.contains(num)){
//                 doublecount++;
//                 if(doublecount==2){
//                     return num;
//                 }
//             };
//             set.add(num);
//         }
//         return null;
// }
// public static void main(String[] args) {
//         int a[]={3,4,5,7,5,3,1,3,4,7};
//         Integer sdn=secondduplicate(a);
//         if(sdn!=null){
//             System.out.println("second duplicate element is"+sdn);
//         }else{
//             System.out.println(" No Duplicate element present");
//         }

//     }
// }  


// 3.Find teh frequency of words:
// import java.util.HashMap;
// public class collection {
//     public static void main(String[] args) {
//         String input = "hello world hello java";
//         String[] words = input.split("\\s+"); // split by spaces
//         HashMap<String, Integer> freqMap = new HashMap<>();
//         for (String word : words) {
//             freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
//         }
//         System.out.println("Word frequencies:");
//         for (String word : freqMap.keySet()) {
//             System.out.println(word + ": " + freqMap.get(word));
//         }
//     }
// }


// 4 find the frequency of the elements:

// import java.util.HashMap;

// public class collection {

//     public static void main(String[] args) {
//         int a[]={2,3,4,5,3,8,5,5};
//         HashMap<Integer,Integer> map= new HashMap<>();

//         for(int num:a){
//             map.put(num, map.getOrDefault(num, 0)+1);
//         };

//         System.out.println(" feequency of teh number's are");
//         for(int num:map.keySet()){
//             System.out.println(num+ " :"+map.get(num));
//         }
//     }
// }

//   5.Compare teo list ignoring order but maintain duplicacy:

// import java.util.*;

// public class collection {

//     public static void main(String[] args) {
//         List<Integer> list1= Arrays.asList(1,2,2,3,4);
//         List<Integer> list2= Arrays.asList(7,7,8,9,1);

//         HashSet<Integer> set1= new HashSet<>(list1);
//         HashSet<Integer> set2= new HashSet<>(list2);
//         if(set1.equals(set2)){
//             System.out.println("Both the lists are equal"); 
//         }else{
//             System.out.println("Lists are not equal");
//         }
//     }
// }



// 6. First non-repreating string;
// import java.util.HashMap;
// import java.util.Map;

// public class collection {
//     public static void main(String[] args) {
//         String text="aaabbcddddeeee";
//         String[] words=text.split("\\s+");
//         Map<String,Integer> map= new HashMap<>();
//         for(String word: words){
//             map.put(word, map.getOrDefault(word, 0)+1);
//         };

//         System.out.println("Non-repeating elements are:");
//         for(Map.Entry<String, Integer>entry: map.entrySet()){
//             if(entry.getValue()==1){
//                   System.out.println("First non-repeating character: " + entry.getKey());
//             }
//         }} };


// 7. Sort the list using their value's;

// import java.util.*;
// public class collection {
//  public static void main(String[] args) {
//         HashMap<String,Integer> map= new HashMap<>();
//         map.put("Mango", 4);
//         map.put("Orange", 2);
//         map.put("Grapes", 1);
//         map.put("kiwi", 3);
//         List<Map.Entry<String,Integer>> list= new ArrayList<>(map.entrySet());
//         list.sort(Map.Entry.comparingByKey());
//         HashMap<String ,Integer>sortedmap= new HashMap<>();
//         for(Map.Entry<String,Integer>entry: list){
//             sortedmap.put(entry.getKey(), entry.getValue());
//         }
//     }
// }


// 8. Group Anagrams..

// import java.util.*;

// public class collection {
//     public static void main(String[] args) {
//         String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

//         // Map to hold groups of anagrams
//         Map<String, List<String>> anagramMap = new HashMap<>();

//         for (String word : words) {
//             // Sort the word to create a key
//             char[] chars = word.toCharArray();
//             Arrays.sort(chars);
//             String sortedKey = new String(chars);

//             // Add word to corresponding anagram group
//             anagramMap.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(word);
//         }

//         // Output grouped anagrams
//         System.out.println("Grouped Anagrams:");
//         for (List<String> group : anagramMap.values()) {
//             System.out.println(group);
//         }
//     }
// }


//   9.Remove all duplicates from List;

// import java.util.*;

// public class collection {
// public static void main(String[] args) {
//     int a[]={3,4,5,3,2,3,5,3,2};
//     HashSet<Integer> set= new HashSet<>();
//     for(int elem:a){
//     if(set.contains(elem)){
//         System.out.println(elem);
//     }
//    set.add(elem);
//     }    
// }
// }
// 10. Sort the list aplhbatically:
// import java.util.*;
// public class collection {
//  public static void main(String[] args) {
//         List<String> list= Arrays.asList("banana","apple","cherrry");
//         List<String> sortedlist= new ArrayList<>(list);
//         Collections.sort(sortedlist);
//         System.out.println(sortedlist);
//     }
// }


// 11.find non-repeating chracters in a string:

import java.util.HashMap;
import java.util.Map;
public class collection {

    public static void main(String[] args) {
        String text="aaabbddddeeee";
        String [] words=text.split("\\s+");
        HashMap<String,Integer> map= new HashMap<>();
        for(String  word:words){
            map.put(word, map.getOrDefault(word, 0)+1);
        };

        System.out.println("First non-repeating element is:-");
       for(Map.Entry<String,Integer>entry:map.entrySet()){
        if(entry.getValue()==1){

        
        System.out.println(entry.getKey()+":"+entry.getValue());
       }
    }



    }
}
