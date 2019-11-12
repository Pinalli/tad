package br.com.pinalli.queue;

/**
 *
 * @author AlbertoRochaPinalli
 */
public class MainQueue {

    public static void main(String[] args) {
        QueueSimpleLinked<String> f = new QueueSimpleLinked<>();
        f.enqueue("Paula");
        f.enqueue("Alberto");
        f.enqueue("Lucas");
      
     

         System.out.println("Fila: " + f.toString());
          f.dequeue();
          System.out.println("Depois de tirar um elemento da pilha: "+ f.toString());
         System.out.println("Get head: "+ f.getHead());
         System.out.println("Quantidade: " + f.size());
    //    System.out.println("Fila" + f.toString());
    }
}
