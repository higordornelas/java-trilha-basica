package Exercicio3;

public class Elevador {
	private int andarAtual = 0;
	private int totalAndares = 0;
	private int capacidadeElevador = 0;
	private int pessoasPresentes = 0;
	
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}
	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}
	public int getPessoasPresentes() {
		return pessoasPresentes;
	}
	public void setPessoasPresentes(int pessoasPresentes) {
		this.pessoasPresentes = pessoasPresentes;
	}
	
	public void inicializa(int capacidadeElevador, int totalAndares) {
		this.capacidadeElevador = capacidadeElevador;
		this.totalAndares = totalAndares;
	}
	
	public void entra(int quantidadePessoasEntrando) {
		if(this.pessoasPresentes + quantidadePessoasEntrando <= capacidadeElevador) {
			this.pessoasPresentes += quantidadePessoasEntrando;
		} else {
			System.out.println("Capacidade m�xima esgotada!");
		}
	}
	
	public void sai(int quantidadePessoasSaindo) {
		if(this.pessoasPresentes > 0) {
			if(this.pessoasPresentes >= quantidadePessoasSaindo) {
				this.pessoasPresentes -= quantidadePessoasSaindo;
			} else {
				System.out.println("N�o podem sair mais pessoas do que est�o presentes!");
			}
			
		} else {
			System.out.println("Elevador vazio!");
		}
	}
	
	public void sobe(int quantosAndaresSubir) {
		if(this.andarAtual < this.totalAndares) {
			if(quantosAndaresSubir + this.andarAtual <= this.totalAndares) {
				this.andarAtual += quantosAndaresSubir;
			} else {
				System.out.println("N�o � poss�vel subir tantos andares!");
			}
			
		} else {
			System.out.println("J� est� no �ltimo andar!");
		}
	}
	
	public void desce(int quantosAndaresDescer) {
		if(this.andarAtual > 0) {
			if(this.andarAtual - quantosAndaresDescer >= 0) {
				this.andarAtual -= quantosAndaresDescer;
			} else {
				System.out.println("N�o � poss�vel descer tantos andares!");
			}
			
		} else {
			System.out.println("J� est� no t�rreo!");
		}
	}
}
