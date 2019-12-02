/*
https://amitpamecha.wordpress.com/2016/01/22/data-structure-tree/
http://homepage.cs.uiowa.edu/~bmccune/021/files/trees/LinkedBinaryTree.java
https://www.youtube.com/watch?v=Dg7ObtAwQvs
https://gist.github.com/divanibarbosa/819e7cfcf1b9bae48c4e0f5bd74fb658
https://pt.stackoverflow.com/questions/250699/%C3%81rvore-bin%C3%A1ria-recursiva-e-soma-das-folhas
https://www.devmedia.com.br/trabalhando-com-arvores-binarias-em-java/25749
http://progressivecoder.com/tree-implementation-using-java/

https://gist.github.com/interviewbin/5f65f718deb4dbf0bd73
 */
package br.com.pinalli.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AlbertoRochaPinalli
 * @param <E>
 */
public class LinkBinaryTree<E> {

    private class Node<E> implements Comparable<Node<E>> {

        private E element;
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;

        /**
         * Constructs a node with the given element and neighbors.
         *
         * @param e the element to be stored
         * @param above reference to a parent node
         * @param leftChild reference to a left child node
         * @param rightChild reference to a right child node
         */
       public Node(E element) {
           parent = null;
	  left = null;
          right = null;
		}
        
        // acessor methods

        public E getElement() { return element;
        }

        public Node<E> getParent() {  return parent;
        }

        public Node<E> getLeft() { return left;
        }

        public Node<E> getRight() { return right;
        }

        // update methods
        public void setElement(E element) {
            this.element = element;
        }

        public void setParent(Node<E> parent) {
            this.parent = parent;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }
        
        
       
       /** The root of the binary tree */
       private Node<E> root = null;     // root of the tree
       private int size = 0;  

        @Override
        public int compareTo(Node<E> o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
          private int count; //quantidade de nodos
	private Node<E> refRoot; //refer�ncia para o nodo raiz
	
	public LinkBinaryTree() {
		count = 0;
		refRoot = null;
	}
	public List<E> traversalPre()
	{
		List<E> res = new ArrayList<>();
		traversalPre(refRoot, res);
		return res;
	}
   
     
      private void traversalPre(Node<E> n, List<E> res)
	{
		if (n != null) {
			res.add(n.getElement()); //Visita o nodo
			traversalPre(n.getLeft(), res); //Visita a subárvore da esquerda
			traversalPre(n.getRight(), res); //Visita a subárvore da direita
		} 
	
	}
       
      public List<E> traversalPos(){
         List<E> res = new ArrayList<>();
		traversalPos(refRoot, res);
		return res;
                
      }
      private void traversalPos(Node<E> n,List<E> res){
          
		if (n != null) {
			traversalPos(n.getLeft(), res); //Visita a subárvore da esquerda
			traversalPos(n.getRight(), res); //Visita a subárvore da direita
			res.add(n.getElement()); //Visita o nodo
		}
      }
          public List<E> traversalCentral()
	{
		List<E> res = new ArrayList<>();
		traversalCentral(refRoot, res);
		return res;
	}
          
private void traversalCentral(Node<E> n, List<E> res)
	{
		if (n != null) {
			traversalCentral(n.getLeft(), res); //Visita a subárvore da esquerda
			res.add(n.getElement()); //Visita o nodo
			traversalCentral(n.getRight(), res); //Visita a subárvore da direita
		}
	}

    

    public static void main(String[] args) {
        LinkBinaryTree lbt = new LinkBinaryTree();
       // lbt.
    }
}