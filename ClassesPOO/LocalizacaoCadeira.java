public class LocalizacaoCadeira {

	private int linha;
	private int coluna;
	private int andar;
	public LocalizacaoCadeira(int linha, int coluna, int andar) {
		setAndar(andar);
		setColuna(coluna);
		setLinha(linha);
	}
	public void OcuparMatriz() {
		
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}

}
