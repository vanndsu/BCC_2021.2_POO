
public class FuncionarioAssalariado extends Funcionario{
	
	private double salarioSemanal;
	
	FuncionarioAssalariado(String primeiro_nome, String segundo_nome, double salarioSemanal){
		
		super(primeiro_nome,segundo_nome);
		this.salarioSemanal = salarioSemanal;
	}
	
	FuncionarioAssalariado(){
		
		
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}
	
	public double ganhos() {
		
		this.salarioSemanal = salarioSemanal*4;
		return salarioSemanal;
	}
	
	
	public String toString() {
		
		String funcionario = "Nome: "+getPrimeiro_nome()+" "+getSegundo_nome()+" Matrícula: "+getMatricula();
		
		return funcionario;
	}
	
		
		
	}


