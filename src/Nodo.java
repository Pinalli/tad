
/**
 *
 * @author AlbertoRochaPinalli
 */
public class Nodo {
    
    private String dados;
    private Nodo acima;
    private Nodo embaixo;

    public String getDados() {
	return dados;
    }

    public void setDados(String dados) {
	this.dados = dados;
    }

    public Nodo getAcima() {
	return acima;
    }

    public void setAcima(Nodo acima) {
	this.acima = acima;
    }

    public Nodo getEmbaixo() {
	return embaixo;
    }

    public void setEmbaixo(Nodo embaixo) {
	this.embaixo = embaixo;
    }
    
    
}
