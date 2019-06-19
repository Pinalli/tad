

/**
 *
 * @author AlbertoRochaPinalli
 */
public class Stack {
    
    private Nodo head;
    private int cont = 0;

   
   
    public Nodo getHead() {
	return head;
    }

    public int getCont() {
	return cont;
    }
    
    public void Push(Nodo n){
	cont++;
	if(head == null){
	    head = n;
	} else{
	    n.setEmbaixo(head);
	    head.setAcima(n);
	    head = n;
	}
    }
    public void PoP(){
	if(cont > 0){
	    cont --;
	    head = head.getEmbaixo();
	}
    }
    public String Peek(){
	return head.getDados();
	
    }
}
