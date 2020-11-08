package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

   List<String> szinek = new ArrayList<>();

   public void addLast (String szin) {
       szinek.add(szin);
   }

   public void addFirst (String szin) {
       szinek.add(0, szin);
   }

   public void removeLast() {
       szinek.remove(szinek.size()-1);
   }

   public void removeFirst() {
       szinek.remove(0);
   }

   public List<String > getColors() {
       return szinek;
   }

   /// MAIN

    public static void main(String[] args) {

       Capsules kapszulak = new Capsules();

        kapszulak.addLast("Kek");
        kapszulak.addLast("Zold");
        kapszulak.addLast("Sarga");

        System.out.println(kapszulak.getColors());

        System.out.println("addLast -> barna");
        kapszulak.addLast("barna");

        System.out.println(kapszulak.getColors());

        System.out.println("addFirst -> lila");
        kapszulak.addFirst("lila");

        System.out.println(kapszulak.getColors());

        System.out.println("remove First");
        kapszulak.removeFirst();
        System.out.println(kapszulak.getColors());

        System.out.println("remove Last");
        kapszulak.removeLast();
        System.out.println(kapszulak.getColors());
    }
}
