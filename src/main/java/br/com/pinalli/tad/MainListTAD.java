package br.com.pinalli.tad;

/**
 *
 * @author AlbertoRochaPinalli
 */
public class MainListTAD {

    public static void main(String[] args) {

        ListArray lista = new ListArray(0);
        lista.add("Maria");
        lista.addLast("Marlon");
        lista.add("Ana");
        lista.add("Alberto");
      //  lista.remove("Alberto");//ok
        lista.addFirst("Cardoso");//Ok
        lista.add("Alberto");
        lista.add(1, "Paulo");
        lista.add(2, "Zag");
        lista.addLast("Kaka");
        lista.add(5, "Fiona");
        lista.add(7,"Marcio"); //ok
        lista.removeLast();
       
//        lista.add(6, "Gabriela");
        
        //     lista.add(10, "Beto");
      //  lista.remove(5);
        //   lista.add(4, "Luana");
        //   lista.clean();   //ok
        //lista.remove(7); //ok

        //    lista.add(9, "Cardoso");
      
   //    lista.removeFirst();//ok*/
        System.out.println(lista);
        System.out.println("A lista está vazia? " + lista.isEmpty());
        System.out.println("Search " + lista.search("Paulo")); //ok
//        System.out.println("Get o elemento: "+   lista.get(7));
        //  System.out.println("Get posicão: " + lista.get(3)); //ok
        // System.out.println("Quantos tem do elemento: " + lista.count("Alberto"));
        System.out.println("Quantos tem do elem pesquisado? " + lista.count("Alberto"));
        System.out.println("Size of list: " + lista.size());

    }
}
