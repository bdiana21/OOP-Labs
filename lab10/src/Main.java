import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> cars=new ArrayList<String>();

        cars.add("Dacia");
        cars.add("Renault");
        cars.add("Toyota");

      System.out.println(cars);
        for (int i=0;i< cars.size();i++){
            if(cars.get(i).equals("Dacia")){
                cars.set(i,"Logan");
            }
        }


        ListIterator<String>carsIt=cars.listIterator();
        while(carsIt.hasNext()){
            if(carsIt.next().equals("Dacia")){
                    carsIt.set("Logan");
            }
        }
        System.out.println(cars);

      String[] chat={"buna","buna", "ce", "mai","faci"};
      Map<String,Integer>conversatie= new HashMap<String,Integer>();
     for(int i=0;i< chat.length;i++) {
         if (!conversatie.containsKey(chat[i]) ) {
             conversatie.put(chat[i], 1);
         } else {
             int nr = conversatie.get(chat[i]);
             nr++;
             conversatie.put(chat[i], nr);
         }

     }
      for(Map.Entry<String,Integer>entry: conversatie.entrySet()){
          System.out.println(entry.getKey()+ " "+ entry.getValue());
      }


    }



}