package br.com.pinalli.tad.simpleLinked;

import javax.sound.sampled.SourceDataLine;

/**
 * @author AlbertoRochaPinalli
 */
public class MainListSimpleLinked {

    public static void main(String[] args) {

        ListSimpleLinked<String> sl = new ListSimpleLinked<>();

       // sl.add("Alberto");
       // sl.addFirst("Fiona");
       // sl.add("Simone");
       // sl.add("Paula");
        //   sl.addLast("Atena");
        //   sl.addLast("Maia");
      //  sl.add("Belinha");

      //   sl.remove("Alberto");
      
        sl.add("Alberto");
        sl.add("Simone");
       sl.add("Belinha");
       
        sl.add(2, "Marilia");
        sl.add("Luca");
          sl.addLast("Maia");
        sl.addFirst("Mario");
       
       
       // sl.add(5, "Atena");
      // sl.remove("Alberto");
      //  sl.remove("Simone");
         
        //sl.removeLast();
       
       
      //  sl.set(1, "Juca");
        System.out.println("Esta vazia: " + sl.isEmpty());
        System.out.println("Quantidade de elementos: " + sl.size());
        System.out.println("Get primeiro element: " + sl.getFirst());
       // System.out.println("Get elemen na posição "+ sl.get(1));
        System.out.println("Get ultimo element: " + sl.getLast());
      //  System.out.println("Search o element "+ sl.removeFirst());
   
        System.out.println("Elementos na lista: \n" +sl.toString());

    }
}
