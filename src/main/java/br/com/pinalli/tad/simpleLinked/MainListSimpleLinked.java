package br.com.pinalli.tad.simpleLinked;
/**
 * @author AlbertoRochaPinalli
 */
public class MainListSimpleLinked {
    public static void main(String[] args) {
        
        ListSimpleLinked<String> sl = new ListSimpleLinked<>();
        
         sl.add("Juca");
         sl.add("Alberto");
        
         sl.addFirst("Mario");
         System.out.println(sl);
        System.out.println("IsEmpty " + sl.isEmpty());
        System.out.println("Quantidade de elementos "+ sl.size());
        System.out.println("Get element "+ sl.getFirst());
        System.out.println(sl);
    }
}
