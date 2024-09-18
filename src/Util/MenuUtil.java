package Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import dao.AlunoDao;
import dao.AlunoDaoImpl;
import model.Aluno;
import model.Situacao;
import model.TipoSexo;

public class MenuUtil {

	public static void mostrarMenuPrincipal() {
		Scanner scanner = new Scanner(System.in);
		int opcao;

		System.out.println("------------------------------------------------------------");
		System.out.println("Menu de Cadastro:");
		System.out.println("1. Cadastrar");
		System.out.println("2. Alterar");
		System.out.println("3. Excluir");
		System.out.println("4. Pesquisar");
		System.out.println("0. Sair");
		System.out.print("Digite a opção desejada: ");
		opcao = scanner.nextInt();
		switch (opcao) {
		// Cadastrar----------------------------------->
		case 1:
			do {
				limparTela();
				mostrarMenuCadastro();
				/// scanner.nextInt();
			} while (opcao != 0);

			break;
		/// Alterar------------------------------------------------------------>
		case 2:
			do {
				limparTela();
				menuAlterar();
				// opcao = scanner.nextInt();
			} while (opcao != 0);

			break;
		// Exluir------------------------------------------------------------>
		case 3:
			do {
				limparTela();
				menuExluir();

			} while (opcao != 0);

			break;
		// Pesquisar------------------------------------------------------------>
		case 4:
			limparTela();
			menuPesquisa();
			break;
		case 0:
			System.out.println("Saindo do sistema...");
			limparTela();
			break;
		default:
			System.out.println("Opção inválida!");
		}

	}

	public static void mostrarMenuCadastro() {
		Scanner scanner = new Scanner(System.in);
		int opcao;

		System.out.println("----------------------------------------------------------------");
		System.out.println(">>Menu de Cadastro Academico:");
		System.out.println("1. Cadastrar Alunos");
		System.out.println("2. Cadastar professor");
		System.out.println("3. Cadastar Discipliana");
		System.out.println("4. Cadastar Curso");
		System.out.println("5. Cadastar Turma");
		System.out.println("0. Sair");
		System.out.print("Digite a opção desejada: ");
		opcao = scanner.nextInt();
		switch (opcao) {
		case 1:
			MenuAluno.cadastrarAluno();
			break;
		case 2:
			//
			break;
		case 3:
			MenuDisciplina.cadastrarAluno();
			break;
		case 4:
			// cadastrarProfessor();
			break;
		case 0:
			System.out.println("Saindo Menu Principal do sistema...");
			limparTela();
			mostrarMenuPrincipal();
			break;
		default:
			System.out.println("Opção inválida!");

		}

	}

	public static void menuAlterar() {
		Scanner scanner = new Scanner(System.in);
		int opcao;

		System.out.println("----------------------------------------------------------------");
		System.out.println(">>Menu de Alterar Cadastro Academico:");
		System.out.println("1. Alterar Alunos");
		System.out.println("2. Alterar Professor");
		System.out.println("3. Alterar Discipliana");
		System.out.println("4. Alterar Curso");
		System.out.println("5. Alterar Turma");
		System.out.println("0. Sair");
		System.out.print("Digite a opção desejada: ");

		opcao = scanner.nextInt();

		switch (opcao) {
		case 1:
			limparTela();
			MenuAluno.alterarAluno();
			break;
		case 2:
			/// alterarAluno();
			break;
		case 3:
			MenuDisciplina.alterarDisciplina();
			break;
		case 4:
			// cadastrarProfessor();
			break;
		case 0:
			System.out.println("Saindo Menu Principal do sistema...");
			limparTela();
			mostrarMenuPrincipal();
			break;
		default:
			System.out.println("Opção inválida!");

		}

	}

	private static void limparTela() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void menuExluir() {
		Scanner scanner = new Scanner(System.in);
		int opcao;

		System.out.println("----------------------------------------------------------------");
		System.out.println(">>Menu de Excluir Cadastro Academico:");
		System.out.println("1. Excluir Alunos");
		System.out.println("2. Excluir Professor");
		System.out.println("3. Excluir Discipliana");
		System.out.println("4. Excluir Curso");
		System.out.println("5. Excluir Turma");
		System.out.println("0. Sair");
		System.out.print("Digite a opção desejada: ");

		opcao = scanner.nextInt();

		switch (opcao) {
		case 1:
			limparTela();
			MenuAluno.excluirAluno();
			break;
		case 2:
			/// alterarAluno();
			break;
		case 3:
			// cadastrarProfessor();
			break;
		case 4:
			// cadastrarProfessor();
			break;
		case 0:
			System.out.println("Saindo Menu Principal do sistema...");
			limparTela();
			mostrarMenuPrincipal();
			break;
		default:
			System.out.println("Opção inválida!");

		}

	}

	public static void menuPesquisa() {
		Scanner scanner = new Scanner(System.in);
		int opcao;

		System.out.println("----------------------------------------------------------------");
		System.out.println(">>Menu de Pesquisar Cadastro Academico:");
		System.out.println("1. Pesquisar Alunos");
		System.out.println("2. Pesquisar Professor");
		System.out.println("3. Pesquisar Discipliana");
		System.out.println("4. Pesquisar Curso");
		System.out.println("5. Pesquisar Turma");
		System.out.println("0. Sair");
		System.out.print("Digite a opção desejada: ");

		opcao = scanner.nextInt();

		switch (opcao) {
		case 1:
			limparTela();
			MenuAluno.pesquisaAluno();
			break;
		case 2:
			/// alterarAluno();
			break;
		case 3:
			// cadastrarProfessor();
			break;
		case 4:
			// cadastrarProfessor();
			break;
		case 0:
			System.out.println("Saindo Menu Principal do sistema...");
			limparTela();
			mostrarMenuPrincipal();
			break;
		default:
			System.out.println("Opção inválida!");

		}

	}

}
