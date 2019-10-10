package br.com.pinalli.tad;
/**
 *
 * @author AlbertoRochaPinalli
 */
public class MainListTAD {
    public static void main(String[] args) {
        
        ListArray lista = new ListArray(15);
        lista.add("Maria");
        lista.add("Ana");
        lista.add("Alberto");
        lista.add(1, "Paulo");
        lista.add(2, "Zag");
        lista.add(5, "Fiona");
        lista.addLast("Marcio"); //ok
        lista.add("Peter");
        lista.add(6, "Gabriela");
        lista.add(7, "Juca");
        lista.remove(0);
    //   lista.add(4, "Luana");
     //   lista.clean();   //ok
     //lista.remove(7); //ok
     //lista.remove("Alberto");//ok
    //    lista.add(9, "Cardoso");
    //lista.get(1); //ok
     //lista.removeFirst();//ok
         System.out.println(lista);
        System.out.println("Get posicão: " + lista.get(3)); //ok
       // System.out.println("Quantos tem do elemento: " + lista.count("Alberto"));
        System.out.println("Size of list: "+ lista.size());
      
    }
    }
   
