package br.com.pinalli.tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AlbertoRochaPinalli
 * @param <T>
 */
public class Arvore<T extends Comparable<T>> {

    private Node<T> raiz;

    //criar arvore SEM uma raiz = null
    public Arvore() {
        raiz = null;
    }

    //criar arvore COM uma raiz = null
    public Arvore(T valor) {
        this.raiz = new Node<>(valor);
    }

    public Node<T> getRaiz() {
        return raiz;
    }

    public Node<T> add(T valor) {
        Node<T> no = new Node<>(valor);

        if (raiz == null) {
            //arvore vazia --> insere a raiz
            raiz = no;
            return no;
        } else {//arvore nao vazia --> deve inserir o no a partir da posicao correta
            return add(no, raiz);
        }

    }

    /**
     * posicao que sera inserido o no recursividade para achar o local
     * bastacosiderar a subArvore
     *
     * @param no
     * @param raizSubArvore
     * @return
     */
    private Node<T> add(Node<T> no, Node<T> raizSubArvore) {

        if (raizSubArvore.compareTo(no.getValor()) >= 0) {
            //é menor que a raiz iserir a esquerda 
            Node<T> esquerda = raizSubArvore.getLeft();
            if (null == esquerda) {
                raizSubArvore.setLeft(no);
                no.setFather(raizSubArvore);
            } else {
                return add(no, esquerda);//continua verificando para a left
            }
        } else {
            //e maior que a raiz iserir a esquerda 
            Node<T> direita = raizSubArvore.getRight();
            if (null == direita) {
                raizSubArvore.setRight(no);
                no.setFather(raizSubArvore);
         } else {
                return add(no, direita);//continua verificando para a right
             }
           }
        return no; //retorna o no criado, inserido
    }

    /**
     * pesquisa pela valor do no
     * @param valor
     * @return
     */
    public Node<T> search(T valor) {
        if (raiz == null) {//arvore vazia
            return null;
        } else {
            return search(valor, raiz);//pequisa recursiva a partir da raiz da arvore
        }
    }

    private Node<T> search(T valor, Node<T> raizSubArvore) {
        //usa o compareTo para ver se achou, ou se esta a direita(maior) ou esquerda(menor)
        int compara = raizSubArvore.compareTo(valor);
        if (compara == 0) {
            //achou
            return raizSubArvore;
        } else if (compara > 0) {//esta a esquerda, se existir, pois raziSubArvore e maior
            return search(valor, raizSubArvore.getLeft());
        } else {
            // emaior se existir, esta a direita
            return search(valor, raizSubArvore.getRight());
        }

    }

    //balancear a arvore
    public void balance() {
        if (raiz == null) 
            return; //nada a fazer
        //desmonta a arvore gerando lista de valores
        //para depois recompor de forma balanceada
        ArrayList<T> lista = retornaLista(raiz);
        raiz = null; //acabou com  a arvore
        balance(lista);//usar a lista para gerar nova arvore
    }
    
// tranforma a arvore em lista
    private ArrayList<T> retornaLista(Node<T> no) {
        if (no == null) {
            return new ArrayList<>();//lista vazia
        } else {
            //lista tipo busca binaria
            //1.gerada uma sublista com a parte da esquerda recursivamente
            //2. acrescentar o elemento do meio
            //3. gerar a sublista da direita
            ArrayList<T> lista = retornaLista(no.getLeft());
            lista.add(no.getValor());
            lista.addAll(retornaLista(no.getRight()));
        }
           return lista;
    }

    private void balance(List<T> lista) {
        if (lista.isEmpty()) 
            return;//nada a fazer.lista vazia
               //achar o elemento no meio da lista
        int meio = 0;
        if (lista.size() > 1) 
            meio = lista.size() / 2 - 1;
        

        add(lista.get(meio));//cria o no
        if (meio > 0) 
            balance(lista.subList(0, meio));
        
        if (meio < lista.size()) {
            balance(lista.subList(meio + 1, lista.size()));
        }

    }

    public String ToString() {
        ArrayList<T> lista = retornaLista(raiz);
        String saida = "";
        for (T item : lista) 
            saida += item + "-";
        return saida.substring(saida.length()-1);
    }
}
