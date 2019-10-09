
package br.com.pinalli.tad;

/**
 *
 * @author AlbertoRochaPinalli
 */
public class MainListTAD {
    public static void main(String[] args) {
         ListArray lista = new ListArray(10);
        //  lista.add("Alberto");
        ///    lista.add("Alberto");
        lista.add("Alberto");
        lista.add(1, "Paulo");
        lista.add(7, "Juca");
         lista.add(5, "Luana");
     //lista.clean();   //ok
     //   lista.remove(7); //ok
     //   lista.remove("Alberto");//ok
        lista.add(9, "Paulo");
    //lista.get(1); //ok
     //lista.removeFirst();//ok

        System.out.println("Get posicão: " + lista.get(1)); //ok
        System.out.println("Quantos tem do elemento: " + lista.count("Alberto"));
        System.out.println(lista);
    }
    }
   
