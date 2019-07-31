public class Teatro {
	private static Peca[] peca= new Peca[3];
	private static Secao[] secao = {new Secao(1), new Secao(2), new Secao(3)};
	public static String MatrizCadeiras[][][];
	

	public static void TamanhoMat(int andar, int coluna, int largura){
		MatrizCadeiras = new String[andar][coluna][largura];
	}
	public static String[][][] getMatrizCadeiras() {
		return MatrizCadeiras;
	}
	public static void setMatrizCadeiras(String[][][] matrizCadeiras) {
		MatrizCadeiras = matrizCadeiras;
	}
	public static Peca[] getPeca() {
		return peca;
	}
	public static void setPeca(Peca[] peca) {
		Teatro.peca = peca;
	}
	public static Secao[] getSecao() {
		return secao;
	}
	public static void setSecao(Secao[] secao) {
		Teatro.secao = secao;
	}
	
	
}
