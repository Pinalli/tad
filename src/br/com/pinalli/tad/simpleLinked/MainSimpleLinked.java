package br.com.pinalli.tad.simpleLinked;

/**
 * @author AlbertoRochaPinalli
 */
public class MainSimpleLinked {

    public static void main(String[] args) {

        ListSimpleLinked<String> sl = new ListSimpleLinked<>();

    //   sl.add("Alberto");
        sl.add("Simone");
        sl.add("Alberto");
        sl.add("Carlos");
        sl.add("Belinha");
       sl.addFirst("Atena");
    //    sl.add("Laura");
     sl.addLast("Maia");
       sl.addLast("Fiona");
     //   System.out.println("Incluidos "+ sl.toString());
      //   sl.addFirst("Mario");
      //   sl.add(3, "Atena");
    //   
      //   sl.add(5, "Fiona");
       
        //sl.add("Alberto");
     // sl.set(2, "Juca");
       //  sl.remove(1);
  //   sl.removeFirst();
      //   sl.set(1, "Juca");
     //    sl.removeLast();
     //    sl.clean();
                System.out.println("Print: List:" + sl.toString());
		System.out.println(".size():" + sl.size());
		//System.out.println(".get(1):" + sl.get(1) + " (get element at index:1 - list starts from 0)");
		//System.out.println(".remove(3):" + sl.remove(3) + " (element removed)");
		//System.out.println(".get(2):" + sl.get(2) + " (get element at index:2 - list starts from 0)");
             //   System.out.println("GetFirst:"+ sl.getFirst());
            //    System.out.println("GetLast: "+ sl.getLast());
                System.out.println("Contains(): "+ sl.contains("Maia"));
		System.out.println("Print again: List:" + sl.toString());
                System.out.println(".size():" + sl.size());
        //sl.removeLast();
        //  
     /*  System.out.println("Get " + sl.get(1));
        System.out.println("Esta vazia: " + sl.isEmpty());
        System.out.println("Contem o elemento? " + sl.contains("Alberto"));
        System.out.println("Quantidade de elementos: " + sl.size());
       

        //  System.out.println("Get " + sl.get(2));
        
      //   System.out.println("Get elemen na posição " + sl.get(5));
      //   System.out.println("Get primeiro element: " + sl.getFirst());
     //   System.out.println("Get ultimo element: " + sl.getLast());
        //     System.out.println("Search o element " + sl.search("Cardoso"));
         System.out.println("Quantidade de ocorrencias " + sl.count("Alberto"));
          System.out.println("Elementos na lista: " + sl.toString());*/
    }
}
