package br.com.pinalli.tad.simpleLinked;

/**
 * @author AlbertoRochaPinalli
 */
public class MainListSimpleLinked {

    public static void main(String[] args) {

        ListSimpleLinked<String> sl = new ListSimpleLinked<>();

        sl.add("Alberto");
        sl.add("Simone");
        sl.add("Belinha");
      
        sl.add("Luca");
      
        sl.addFirst("Mario");
        sl.add(3, "Atena");
        sl.addLast("Maia");
        sl.add(5, "Fiona");
        sl.add("Carlos");
     //   sl.remove(4);
       // sl.remove(1);
   //     sl.removeFirst();
      //  sl.removeLast();

        //sl.removeLast();
      //  sl.set(1, "Juca");
        System.out.println("Esta vazia: " + sl.isEmpty());
        System.out.println("Quantidade de elementos: " + sl.size());
        System.out.println("Get primeiro element: " + sl.getFirst());
        System.out.println("Get elemen na posição "+ sl.get(5));
        System.out.println("Get ultimo element: " + sl.getLast());
        System.out.println("Search o element "+ sl.search("Cardoso"));
        System.out.println("Quantidade de ocorrencias "+ sl.count("Alberto"));

        System.out.println("Elementos na lista: \n" + sl.toString());

    }
}
