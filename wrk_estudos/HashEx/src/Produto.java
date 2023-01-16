
public class Produto {
 
  private String sku;
  private String nome;
 
  public Produto(String sku, String nome) {
    this.sku = sku;
    this.nome = nome;
  }
 
 
  @Override
  public String toString() {
    return "Produto [sku=" + sku + ", nome=" + nome + "]";
  }
  
  public String getSku() {
	return sku;
}

public void setSku(String sku) {
	this.sku = sku;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public boolean equals(Object obj) {
	  Produto outro = (Produto) obj;
	  return this.sku.equals(outro.getSku());
	}


@Override
public int hashCode() {
	return super.hashCode();
}


 
}
