package br.com.pinalli.tad.stack;
/**
 *
 * @author AlbertoRochaPinalli
 */
public class MainStack {
    public static void main(String[] args) {
         StackSimpleLinked<String> st = new StackSimpleLinked<>();
           
     st.push("1");
     st.push("Juva");
     st.push("Barros");
     st.push("Claudia");
    
        
        System.out.println("Elementos na pilha: "+ st.toString());
       System.out.println("Tamanho da pilha: "+ st.size());
       System.out.println("Vazia? "+ st.isEmpty());
       System.out.println("Topo:"+ st.top());
        System.out.println("Removeu: "+ st.pop());
        System.out.println("Topo agora "+ st.top());
        System.out.println("Elementos na pilha depois do pop(): "+ st.toString());
       System.out.println("Tamanho atual da pilha:"+  st.size());
    }
   
    
}
