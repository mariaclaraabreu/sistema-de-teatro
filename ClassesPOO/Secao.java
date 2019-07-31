public class Secao {

    private String Horario;
    private String matrizCadeiras[][][] = Teatro.getMatrizCadeiras();
    public Secao() {
    	
    }
    
    public Secao(int Horario) {
    	if(Horario==0) {
    		setHorario("08:00 as 12:00");
    	}else if(Horario==1) {
    		setHorario("13:00 as 17:00");
    	}else {
    		setHorario("18:00 as 22:00");
    	}
    
    }
    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public String[][][] getMatrizCadeiras() {
        return matrizCadeiras;
    }

    public void setMatrizCadeiras(String [][][] matrizCadeiras) {
        setMatrizCadeiras(matrizCadeiras);
    }

    public boolean ocuparCadeira(LocalizacaoCadeira localizacaoCadeira) {
        if (getMatrizCadeiras()[localizacaoCadeira.getAndar()][localizacaoCadeira.getLinha()][localizacaoCadeira.getColuna()].equals("-")){
            getMatrizCadeiras()[localizacaoCadeira.getAndar()][localizacaoCadeira.getLinha()][localizacaoCadeira.getColuna()]="x";
            return true;
        }else{
            return false;
        }
    }
    public boolean verificarOcupacoes(LocalizacaoCadeira localizacaoCadeira){
    	 if (getMatrizCadeiras()[localizacaoCadeira.getAndar()][localizacaoCadeira.getLinha()][localizacaoCadeira.getColuna()].equals("x")){
             return true;
         }else{
             return false;
         }
    }

    
    public void gerarMatriz(){   
        for (int and = 0; and<getMatrizCadeiras().length; and++){
            for (int i =0; i<getMatrizCadeiras()[and].length; i++){
                for(int j=0; j<getMatrizCadeiras()[and][i].length; j++){
                    matrizCadeiras[and][i][j] = "-";
                }
            }
        }
    }
    public void imprimirMatriz(){
        for (int and = 0; and<getMatrizCadeiras().length; and++){
        	System.out.println("\n Andar:"+ (and+1)+"\n");
            for (int i =0; i<getMatrizCadeiras()[and].length; i++){
            	System.out.print("Linha:"+ (i+1)+" | ");
                for(int j=0; j<getMatrizCadeiras()[and][i].length; j++){
                	System.out.print(matrizCadeiras[and][i][j]+ " | ");
                }
                System.out.println("\n");
            }
        }
    }
    
    
    
    
}