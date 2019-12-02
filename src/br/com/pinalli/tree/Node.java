package br.com.pinalli.tree;

/**
 *
 * @author AlbertoRochaPinalli
 * @param <T>
 */
//public class Arvore<T> {

    public class Node<T extends Comparable> implements Comparable<T> {

        private T valor;//armazena valor do no
        private Node<T> left;//aponta para o no da esquerda
        private Node<T> right;//aponta para o no da direita
        private Node<T> father;//para o pai -> assim varre a arvore de baixo para cima
        
       

        /**
         * constroi na classe colocando o valor deve-se indicar o pai
         * manualmente
         * @param valor
         */
        public Node(T valor) {
            this.valor = valor;
            left = null;
            right = null;
            father = null;
        }

        public Node(T valor, Node<T> father) {
            this.valor = valor;
            left = null;
            right = null;
            this.father = father;
        }

    Node() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
       
        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node<T> getFather() {
            return father;
        }

        public void setFather(Node father) {
            this.father = father;
        }

        public T getValor() {
            return valor;
        }

       @Override
        public int compareTo(T o) {
            return valor.compareTo(o);
        }

    }


