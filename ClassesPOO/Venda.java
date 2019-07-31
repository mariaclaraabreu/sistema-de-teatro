public class Venda {

	private static Ingresso ingresso[]= new Ingresso[1005];
	private static int contIngressoPosi;
	public int contEstudante, contNaoEstudante;
	public double precoIngresso=33.50;
	public Venda(){
		super();
	}	
	public Ingresso retornarIngresso() {
		for(int i=0; i<ingresso.length; i++) {
			if(ingresso[i]==null) {
				return ingresso[i-1];
			}
		}
		return null;
	}
	
	public String VenderIngresso(int numPeca, boolean IsEstudante, int linha, int coluna, int andar, int numSecao) {
		LocalizacaoCadeira localizacaoCadeira= new LocalizacaoCadeira(linha, coluna, andar);
		if(!Teatro.getSecao()[numSecao].verificarOcupacoes(localizacaoCadeira)) {
			if(Teatro.getSecao()[numSecao].ocuparCadeira(localizacaoCadeira)==true) {
				if(IsEstudante==true) {	
					getIngresso()[contIngressoPosi] = new Ingresso(precoIngresso/2, Teatro.getPeca()[numPeca], IsEstudante, localizacaoCadeira, Teatro.getSecao()[numSecao]);
					contEstudante++;
				}else {
					getIngresso()[contIngressoPosi]= new Ingresso(precoIngresso, Teatro.getPeca()[numPeca], IsEstudante, localizacaoCadeira, Teatro.getSecao()[numSecao]);
					contNaoEstudante++;
				}
			contIngressoPosi++;
			return "Vendido com sucesso";
		}
			
		return "ERRO, NÃO PODEMOS VENDER";
			}
		 return "ERRO, NÃO PODEMOS VENDER";
	}
	public double Balanco() {
		double precoTotal=0;
		for(int i=0; getIngresso()[i]!=null && i<getIngresso().length; i++) {
				precoTotal+=getIngresso()[i].getPrecoIngresso();		
		}
		return precoTotal;
	}
	
	public static int getContIngressoPosi() {
		return contIngressoPosi;
	}
	public static void setContIngressoPosi(int contIngressoPosi) {
		Venda.contIngressoPosi = contIngressoPosi;
	}
	public int getContEstudante() {
		return contEstudante;
	}
	public void setContEstudante(int contEstudante) {
		this.contEstudante = contEstudante;
	}
	public int getContNaoEstudante() {
		return contNaoEstudante;
	}
	public void setContNaoEstudante(int contNaoEstudante) {
		this.contNaoEstudante = contNaoEstudante;
	}
	public Ingresso[] getIngresso() {
		return ingresso;
	}
	public void setIngresso(Ingresso[] ingresso) {
		this.ingresso = ingresso;
	}

}
