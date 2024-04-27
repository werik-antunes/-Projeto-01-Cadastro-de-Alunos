package cadastroAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAlunos {

	public static void main(String[] args) {
		ArrayList <Aluno> alunos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Menu:");
			System.out.println(" ");
			System.out.println("1)- Cadastrar aluno: ");
			System.out.println("2)- Mostrar todos alunos cadastrados: ");
			System.out.println("3)- Sair.........");
			System.out.println(" ");
			System.out.println("Escolha uma opção");
			
			int opcao = sc.nextInt();
			
			if(opcao == 1) {
				System.out.println("Digite o nome do aluno: ");
				String nome = sc.next();
				System.out.println("Digite a idade do aluno: ");
				int idade = sc.nextInt();
				System.out.println("Digite a nota do aluno: ");
				double nota = sc.nextDouble();
				
				Aluno aluno = new Aluno (nome,idade,nota);
				alunos.add(aluno);
				System.out.println("Aluno cadastrado com sucesso! ");
					
			}else if (opcao == 2) {
				System.out.println("Alunos cadastrados ");
				for(Aluno aluno:alunos) {
					System.out.println(aluno);
				}
			}else if(opcao == 3) {
				System.out.println("Saindo..........");
				break;
			}else {
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
		
		sc.close();
	}

}
