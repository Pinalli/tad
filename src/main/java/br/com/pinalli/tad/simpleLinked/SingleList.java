/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pinalli.tad.simpleLinked;

/**
 *
 * @author AlbertoRochaPinalli
 * @param <T>
 */
public class SingleList<T> {
     private Node<T> head;
    private Node<T> tail;
    private int cont = 0;
    
    public void add(T element) {

        Node<T> aux = new Node<>();
        aux.setValue(element);
        System.out.println("Adding: " + element);

        if (head == null) {//check if the list is empty
            //since there is only one element, both head and 
            //tail points to the same object.
            head = aux;
            tail = aux;
        } else {
            //set current tail next link to new node
            tail.setNextRef(aux);
            //set tail as newly created node
            tail = aux;
        }
	cont++;
    }

    public void size(){
	cont++;
    }
/*	 public T getFirst() {
	    final Node<T> f = first;
	    if (f == null)
	        throw new NoSuchElementException();
	    return f.item;
    }
	 public T getFirst() {
	    final Node<T> f = first;
	    if (f == null)
	        throw new NoSuchElementException();
	    return f.item;
    }*/
    public void addAfter(T element, T after) {

        Node<T> tmp = head;
        Node<T> refNode = null;
        System.out.println("Traversing to all nodes..");
        /**
         * Traverse till given element
         */
        while (true) {
            if (tmp == null) {
                break;
            }
            if (tmp.compareTo(after) == 0) {
                //found the target node, add after this node
                refNode = tmp;
                break;
            }
            tmp = tmp.getNextRef();
        }
        if (refNode != null) {
            //add element after the target node
            Node<T> nd = new Node<>();
            nd.setValue(element);
            nd.setNextRef(tmp.getNextRef());
            if (tmp == tail) {
                tail = nd;
            }
            tmp.setNextRef(nd);

        } else {
            System.out.println("Unable to find the given element...");
        }
    }

    public void deleteFront() {

        if (head == null) {
            //  System.out.println("Underflow...");
        }
        Node<T> tmp = head;
        head = tmp.getNextRef();
        if (head == null) {
            tail = null;
        }
        System.out.println("Deleted: " + tmp.getValue());
    }

    public void deleteAfter(T after) {

        Node<T> tmp = head;
        Node<T> refNode = null;
        //  System.out.println("Traversing to all nodes..");
        /**
         * Traverse till given element
         */
        while (true) {
            if (tmp == null) {
                break;
            }
            if (tmp.compareTo(after) == 0) {
                //found the target node, add after this node
                refNode = tmp;
                break;
            }
            tmp = tmp.getNextRef();
        }
        if (refNode != null) {
            tmp = refNode.getNextRef();
            refNode.setNextRef(tmp.getNextRef());
            if (refNode.getNextRef() == null) {
                tail = refNode;
            }
            System.out.println("Deleted: " + tmp.getValue());
        } else {
            System.out.println("Unable to find the given element...");
        }
    }

    public void traverse() {

        Node<T> tmp = head;
        while (true) {
            if (tmp == null) {
                break;
            }
            System.out.println(tmp.getValue());
            tmp = tmp.getNextRef();
        }
    }

    
    

    public static void main(String a[]) {
        SingleList<Integer> sl = new SingleList<>();
       
	sl.add(77);
        sl.add(32);
        sl.add(54);
        sl.add(89);
	//sl.deleteAfter(2);
      //  sl.addAfter(32, 33);
	//sl.deleteFront();
	
        System.out.println(sl);
    }
}

class Node<T> implements Comparable<T> {

    private T value;
    private Node<T> nextRef;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNextRef() {
        return nextRef;
    }

    public void setNextRef(Node<T> ref) {
        this.nextRef = ref;
    }

    @Override
    public int compareTo(T arg) {
        if (arg == this.value) {
            return 0;
        } else {
            return 1;
        }
    }

   
}
