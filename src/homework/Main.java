package homework;

import java.util.*;

public class Main {

    /*
    Задача на мапы: Дан список имен, в котором некоторые имена повторяются.
    Написать метод, который по имени вернет количество вхождений этого имени в список.
    т.е. метод принимает лист и имя и возвращает число, соответствующее количеству раз,
    которое это имя встречается в листе
     */
    public static void main(String[] args) {
        List<String> ourList;
        ourList = Arrays.asList("John", "Kate", "Ann", "John", "Bob", "Tom", "Ann", "Ann");
        System.out.println("This name appears in the List "
                +findNameAndCount(ourList, "Ann")+ " times.");
        System.out.println("This name appears in the List "
                +countTheSearchName(ourList, "Ann")+ " times.");
        System.out.println("This name appears in the List "
                +searchingTheNameAndCount(ourList, "John")+ " times.");
    }
    public static int searchingTheNameAndCount (List<String> ourList, String findName){
        int i = 0;
        for (String name : ourList){
            if(name.equals(findName)){
                i++;
            }
        }
        return i;
    }
     public static int findNameAndCount (List<String> ourList, String findName){
         Iterator<String> iterator = ourList.iterator();
         int countNames = 0;
         while (iterator.hasNext()){
             if(iterator.next().equals(findName)){
                 countNames += 1;
             }
         }
         return countNames;
     }
     public static int countTheSearchName (List<String> ourList, String findName){
         Map<String,Integer> newMap = new HashMap<>();
         int i=0;
         for (String name : ourList){
             if(name.equals(findName)){
             i++;
             newMap.put(findName, i);
             }
         }
         return newMap.get(findName);
     }
}
