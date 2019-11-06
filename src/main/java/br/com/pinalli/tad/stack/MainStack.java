package br.com.pinalli.tad.stack;
/**
 *
 * @author AlbertoRochaPinalli
 */
public class MainStack {
    public static void main(String[] args) {
         StackSimpleLinked<String> st = new StackSimpleLinked<>();
         st.push("Simone");
         st.push("Juva");
         st.push("Barros");
      //    st.push("Claudia");
        //  st.pop();
        
         System.out.println("Count "+ st.size());
         System.out.println("Vazia? "+ st.isEmpty());
         System.out.println("Topo:"+ st.top());
         System.out.println("Pilha:"+ st.toString());
    }
   
    
}
