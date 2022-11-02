package exercicio_reinaldo;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	abstract class Pessoa {
		private String nome;
		private String cpf;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
		class Empregado extends Pessoa {
			private String matricula;
			
			public Empregado(String nome, String cpf, String matricula) {
				super();
				this.matricula = matricula;				
			}

			public String getMatricula() {
				return matricula;
			}

			public void setMatricula(String matricula) {
				this.matricula = matricula;
			}
			
		
		class Cliente extends Pessoa {
			private double valor_da_divida;
			
			public Cliente(String nome, String cpf, double valor_da_divida) {
				super();
				this.valor_da_divida = valor_da_divida;
			}
		}
		
		class Gerente extends Empregado {
			private double salario;
			private double bonus;
			

			public Gerente(String nome, String cpf, String matricula) {
				super(nome, cpf, matricula);
			}


			public double getSalario() {
				return salario;
			}


			public void setSalario(double salario) {
				this.salario = salario;
			}


			public double getBonus() {
				return bonus;
			}


			public void setBonus(double bonus) {
				this.bonus = bonus;
			}
			
			public double CalcularBonus () {
				double calcular_bonus;
				calcular_bonus = salario*(bonus/100);
				return calcular_bonus;
			}
			
			
		}
		
		class Vendedor extends Empregado {
			private double total_das_vendas;
			private double comissao;

			public Vendedor(String nome, String cpf, String matricula) {
				super(nome, cpf, matricula);
				}

			public double getTotal_das_vendas() {
				return total_das_vendas;
			}

			public void setTotal_das_vendas(double total_das_vendas) {
				this.total_das_vendas = total_das_vendas;
			}

			public double getComissao() {
				return comissao;
			}

			public void setComissao(double comissao) {
				this.comissao = comissao;
			}

			public double CalcularSalario() {
				double calcular;
				calcular = total_das_vendas*(comissao/100);
				return calcular;
				
			}
			
			
			
			
		}
		
		
		
		
		
		}
	}
}

