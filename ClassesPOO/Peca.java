public class Peca {
	private String nomePeca;
	public Peca() {
		super();
	}
	
	public void CadastrarPeca(String nomePeca) {
		setNomePeca(nomePeca);

	}
	public String getNomePeca() {
		return nomePeca;
	}
	public void setNomePeca(String nomePeca) {
		this.nomePeca = nomePeca;
	}

}
