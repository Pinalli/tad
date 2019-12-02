package br.com.pinalli.tree;

/**
 *
 * @author AlbertoRochaPinalli
 */
public class App {

    public static void main(String[] args) {

        // Arvore<Integer> a = new Arvore<>(1);
        BinaryTreeLinked<Integer> bnt = new BinaryTreeLinked<>();
        Integer father = null;

        //  Node fath = new Node();
        bnt.add(5, father, NodePosition.LEFT);
        bnt.add(25, father, NodePosition.LEFT);
        bnt.add(73, father, NodePosition.LEFT);
        bnt.add(42, father, NodePosition.LEFT);
        bnt.add(13, father, NodePosition.RIGHT);
        bnt.add(27, father, NodePosition.RIGHT);
        bnt.add(81, father, NodePosition.LEFT);
         bnt.add(81, father, NodePosition.RIGHT);

        //bnt.strTraversalPos();
        // bnt.getFather("Alberto");
        System.out.println("Tree: " + bnt.toString());
        System.out.println("Transversal Pos \n" + bnt.strTraversalPos());
        System.out.println("Transversal Pre \n" + bnt.strTraversalPre());
        System.out.println("Transversal Central \n" + bnt.traversalCentral());
        System.out.println("Father " + bnt.getFather(father));
        System.out.println("path size" + bnt.getPathSize(25));
        System.out.println(" Right " + bnt.getRight(13));
        System.out.println("Count "+ bnt.count());
         System.out.println("Count "+ bnt.count(81));

    }
}
