import java.util.Scanner;

public class FuncionarioComissionado extends Funcionario {
	
	private int vendas;	
	private double comissao;
	
	FuncionarioComissionado(String primeiro_nome, String segundo_nome, double salario, int vendas){
		
		super(primeiro_nome,segundo_nome, salario);
		this.vendas=vendas;
	}
	
	FuncionarioComissionado(){}
	
	public double ganhos()	{
		
	
		comissao = getSalario()+(vendas * 0.10);
		this.comissao = comissao;
		
		return comissao;
		
	}
		
	public double getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}
	
	
	
	public String toString() {
		
		String funcionario = "Nome: "+getPrimeiro_nome()+" "+getSegundo_nome()+" Matrícula: "+getMatricula();
		
		return funcionario;
	}
	
	

}
