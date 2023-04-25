package listaQuatro;

public class Fatura {

	public static int numeroItem;
	public String descricaoItem;
	public static double precoItem;
	public double porcentDesconto;
	
	public static double getValorFatura (int numeroItem, double precoItem, double porcentDesconto) {
		
		double valorFatura = numeroItem*precoItem;
		valorFatura = valorFatura+valorFatura*porcentDesconto;
		System.out.println("quantidade=  "+numeroItem+"    Preco=  "+precoItem);
		return valorFatura ;
	}
	
	public static void main(String[] args) {
		
		getValorFatura(3, 100.0, 5.0);
		System.out.println("quantidade=  "+numeroItem+"    Preco=  "+precoItem);
	}

	public Fatura(int numeroItem, String descricaoItem, double precoItem) {
		this.numeroItem = numeroItem;
		this.descricaoItem = descricaoItem;
		this.precoItem = precoItem;
	}

	public int getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(int numeroItem) {
		if (numeroItem <0)
		this.numeroItem = 0;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		if (precoItem<0)
		this.precoItem = 0.0;
	}
	
}
