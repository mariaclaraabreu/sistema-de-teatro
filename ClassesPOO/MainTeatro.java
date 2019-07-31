import java.util.Scanner;

public class MainTeatro {
	
	public static void main(String[] args) {
		int op=0, cont=0, contSecao=0;
		boolean IsEstudante = false;
		int linha=0, coluna=0, andar=0, numSecao=0, numPeca=0, aux=0;
		System.out.println("BEM VINDO AO SISTEMA");
		System.out.println("DIGITE O TAMANHO DO TEATRO:");
		Scanner sc = new Scanner(System.in);
		Scanner string = new Scanner(System.in);
		Teatro.TamanhoMat(sc.nextInt(), sc.nextInt(), sc.nextInt());
		Secao secao= new Secao();
		secao.gerarMatriz();
		Venda venda = new Venda();
		do {
			System.out.println("[1] CADASTRE UMA PECA:");
			System.out.println("[2] COMPRAR INGRESSO:");
			System.out.println("[3] Mostrar orcamento");
			System.out.println("[4] Exit");
			op= sc.nextInt();
			switch(op) {
			case 1:
			Peca peca = new Peca();
			Teatro.getPeca()[cont]=peca;
			cont++;
			System.out.println("Digite o nome da peca");
			peca.CadastrarPeca(string.nextLine());
			System.out.println("HORARIOS DISPONIVEIS");
			System.out.println("[1] 08:00 as 12:00");
			System.out.println("[2] 13:00 as 17:00");
			System.out.println("[3] 18:00 as 22:00");
			secao= new Secao(sc.nextInt()-1);
			Teatro.getSecao()[contSecao]=secao;
			contSecao++;
			break;
			case 2: 
			System.out.println("Escolha a peca");
				for(int i=0; Teatro.getPeca()[i]!=null && i<Teatro.getPeca().length; i++) {
					
					if(Teatro.getPeca()!=null) {
					System.out.println("["+(i+1)+"] "+Teatro.getPeca()[i].getNomePeca());
					}
				}
				System.out.println("Digite o numero da peca:");
				numPeca=sc.nextInt()-1;
				System.out.println("Voce eh estudante:");
				System.out.println("[1] SIM");
				System.out.println("[2] NAO");
				aux=sc.nextInt();
				if(aux==1) {
					IsEstudante=true;
				}else {
					IsEstudante=false;
				}
				secao.imprimirMatriz();
				System.out.println("Qual andar voce deseja?");
				andar=sc.nextInt()-1;
				System.out.println("Digite a linha:");
				linha=sc.nextInt()-1;
				System.out.println("Digite a coluna:");
				coluna=sc.nextInt()-1;
				if(secao.getHorario().equals("08:00 as 12:00")) {
					numSecao=0;
				}else if(secao.getHorario().equals("13:00 as 17:00")) {
					numSecao=1;
				}else {
					numSecao=2;
				}
				venda.VenderIngresso(numPeca, IsEstudante, linha, coluna, andar, numSecao);
				(venda.retornarIngresso()).Imprimir();
				break;
			case 3:
				System.out.println(venda.Balanco());
				break;
			case 4:
				System.exit(0);
				break;
			} 
		}while(1==1);

		
		
		
		
		
		
	}
}
