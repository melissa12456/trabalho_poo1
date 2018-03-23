package trabalho;
import java.util.Scanner;

public class Exx1 {
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		Disciplina[] disciplinas = new Disciplina[5];
		Aluno[] alunos = new Aluno[10];
		int opcao = 0;

		do {
			System.out.println("1 - Cadastrar disciplina");
			System.out.println("2 - Remover disciplina");
			System.out.println("3 - Listar as disciplinas");
			System.out.println("4 - Cadastrar aluno");
			System.out.println("5 - Alterar os dados dos alunos");
			System.out.println("6 - Listar os alunos");
			System.out.println("7 - Matricular um aluno em disciplina");
			System.out.println("8 - Listar as matrícular");
			System.out.println("0 - Sair");

			opcao = scn.nextInt();

			switch (opcao) {
			case 1:
				Disciplina a = cadastrar();
				inserir(a, disciplinas);
				break;
			case 2:
				
				break;
			case 3:
				listar(disciplinas);
				break;
			default:
				break;
			}
		} while (opcao != 0);

		scn.close();
	}
	
	static Disciplina cadastrar() {
		Disciplina disciplina = new Disciplina();

		System.out.print("Insira o código da disciplina: ");
		disciplina.codigoD = scn.nextInt();
		
		System.out.print("Insira o nome da disciplina: ");
		disciplina.nomeD = scn.next();
		
		System.out.print("Insira o ano da disciplina: ");
		disciplina.ano = scn.nextInt();
		
		System.out.print("Insira o nome do professor: ");
		disciplina.professor = scn.next();

		System.out.println("...");
		return disciplina;
	}

	static boolean inserir(Disciplina a, Disciplina[] disciplinas) {
		for (int i = 0; i < disciplinas.length; i++) {
			if (disciplinas[i] == null) {
				disciplinas[i] = a;
				return true;
			}
		}
		return false;
	}
}

class Aluno {
	int codigoA;
	String nomeA;
	Endereco end = new Endereco();
	String[] disciplinas = new String[3];
	double[] notas = new double[3];
}

class Endereco {
	String cidade;
	String bairro;
	String rua;
	int numero;
}

class Disciplina {
	int codigoD;
	String nomeD;
	int ano;
	String professor;
}