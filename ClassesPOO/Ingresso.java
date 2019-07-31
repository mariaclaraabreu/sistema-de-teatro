public class Ingresso {

	private double precoIngresso;
	private Peca Peca;
	private boolean IsEstudante;
	private LocalizacaoCadeira localizacaoCadeira;
	private Secao Secao;
	
	
	public Ingresso(double precoIngresso, Peca peca, boolean isEstudante, LocalizacaoCadeira localizacaoCadeira, Secao secao) {
		setPrecoIngresso(precoIngresso);
		setPeca(peca);
		setIsEstudante(IsEstudante);
		setLocalizacaoCadeira(localizacaoCadeira);
		setSecao(secao);
	}

	public void Imprimir() {
		System.out.println("Horario: "+ getSecao().getHorario());
		System.out.println("Nome da peca: " + getPeca().getNomePeca());
		System.out.printf("Localizacao: Andar:[%d] Linha[%d] Coluna[%d]", getLocalizacaoCadeira().getAndar(), getLocalizacaoCadeira().getLinha(), getLocalizacaoCadeira().getColuna());
		if(isIsEstudante()==true) {
			System.out.println("\nMeia");
		}else {
			System.out.println("\nInteira");
		}
		System.out.println("Valor R$:"+ getPrecoIngresso());
	}
	
	
	
	public double getPrecoIngresso() {
		return precoIngresso;
	}
	public void setPrecoIngresso(double precoIngresso) {
		this.precoIngresso = precoIngresso;
	}
	public Peca getPeca() {
		return Peca;
	}
	public void setPeca(Peca peca) {
		Peca = peca;
	}
	public boolean isIsEstudante() {
		return IsEstudante;
	}
	public void setIsEstudante(boolean isEstudante) {
		IsEstudante = isEstudante;
	}
	public LocalizacaoCadeira getLocalizacaoCadeira() {
		return localizacaoCadeira;
	}
	public void setLocalizacaoCadeira(LocalizacaoCadeira localizacaoCadeira) {
		this.localizacaoCadeira = localizacaoCadeira;
	}
	public Secao getSecao() {
		return Secao;
	}
	public void setSecao(Secao secao) {
		Secao = secao;
	}

}
