
public class FuncionarioHora extends Funcionario{
	
	private int horas;
	private double valorDaHora;
	
	
	FuncionarioHora(String primeiro_nome, String segundo_nome,int horas, double valorDaHora){
		
		super(primeiro_nome,segundo_nome);
		this.horas = horas;
		this.valorDaHora = valorDaHora;
		
	}
	
	FuncionarioHora(){}

	
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getValorDaHora() {
		return valorDaHora;
	}
	public void setValorDaHora(double valorDaHora) {
		this.valorDaHora = valorDaHora;
	}
	
	public double ganhos() {
		
		double total = (horas * valorDaHora);
		
		return total;
		
	}
	
	public String toString() {
		
		String funcionario = "Nome: "+getPrimeiro_nome()+" "+getSegundo_nome()+" Matrícula: "+getMatricula();
		
		return funcionario;
	}
	
	
}
