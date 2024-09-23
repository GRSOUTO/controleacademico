package Util;

import java.time.LocalDate;
import java.util.Scanner;

import dao.ProfessorDaoImpl;
import dao.ProfessorDao;
import model.Aluno;
import model.Professor;
import model.Situacao;
import model.TipoSexo;
import model.Titulacao; 
import Util.MenuUtil;

public class MenuProfessor {
	
	
	public static void cadastrarProfessor() {
		ProfessorDaoImpl professorDao = new ProfessorDaoImpl();

		IdGenerator idgera = new IdGenerator();

		/* TESTE */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("--------------------------------------------------------------");
				
		System.out.println(">>Menu de Cadastro Professor:");
		System.out.print("Titulacao :");
		String titulacao = scanner.nextLine();
		System.out.print("Nome :");
		String nome = scanner.nextLine();  
		System.out.print("DtNascimento :");
		String dtNascimento = scanner.nextLine();
		System.out.print("Sexo :");
		String sexo = scanner.nextLine();		
		System.out.print("Endereço :");
		String endereco = scanner.nextLine(); 
		System.out.print("Cep :");
		String cep = scanner.nextLine();
		System.out.print("Bairro :");
		String bairro = scanner.nextLine();
		System.out.print("Complemento :");
		String complemento = scanner.nextLine();
		System.out.print("Telefone :");
		String telefone = scanner.nextLine(); 
		System.out.print("Cidade :");
		String cidade = scanner.nextLine();

		Converter converter = new Converter();
		Titulacao status = converter.convertTitulacao(titulacao);
		TipoSexo tiposexo = converter.convert(sexo);
		LocalDate data = converter.convertData(dtNascimento);
			
		Professor professor = new Professor(idgera.getNextId(), status, nome, data, tiposexo, endereco,cep, bairro, complemento,
				telefone, cidade);
		professorDao.salvar(professor);

		System.out.println(professorDao.getTodos());
		System.out.print("0. Sair :");

	}


	public static void alterarProfessor() {
		Scanner scanner = new Scanner(System.in);

		ProfessorDao professorDao = new ProfessorDaoImpl();
		System.out.println(professorDao.getTodos());

		System.out.print("Digite a ID :");
		Long numId = scanner.nextLong();

		Professor professorEncontrado = professorDao.getId(numId);

		if (professorEncontrado != null) {
			System.out.println("Professor encontrado: " + professorEncontrado);
		} else {
			System.out.println("Professor não encontrado.");
		}

		System.out.println(">>Alterar Professor:");
		System.out.println("Nova ID (deixe em branco para manter): ");
		System.out.println("-------------------------------------------");
		System.out.println("ID :" + professorEncontrado.getId());

		System.out.print("Titulação :");
		scanner.nextLine();
		String novaTitulacao = scanner.nextLine();
		System.out.print("Nome :");
		String novoNome = scanner.nextLine();
		System.out.print("DtNascimento :");
		String novodtNascimento = scanner.nextLine();
		System.out.print("Sexo :");
		String novosexo = scanner.nextLine();
		System.out.print("Endereço :");
		String novoEndereco = scanner.nextLine();
		System.out.print("Cep :");
		String novocep = scanner.nextLine();
		System.out.print("Bairro :");
		String novobairro = scanner.nextLine();
		System.out.print("Complemento :");
		String novocomplemento = scanner.nextLine();
		System.out.print("Telefone :");
		String novoTelefone = scanner.nextLine(); 
		System.out.print("Cidade :");
		String novocidade = scanner.nextLine();
		

		Converter converter = new Converter();
		Titulacao status = converter.convertTitulacao(novaTitulacao); 
		TipoSexo tiposexo = converter.convert(novosexo);
		LocalDate novadata = converter.convertData(novodtNascimento);

		if (novaTitulacao.isEmpty()) {
			status = professorEncontrado.getTitulacaoMaxima();

		}

		if (novoNome.isEmpty()) {
			novoNome = professorEncontrado.getNome();
		}

		if (novodtNascimento.isEmpty()) {

			novadata = professorEncontrado.getDtNascimento();
		}

		if (novosexo.isEmpty()) {

			tiposexo = professorEncontrado.getSexo();
		}
		
		
		if (novoEndereco.isEmpty()) {
			novoEndereco = professorEncontrado.getEndereco();
		}
		
		if (novocep.isEmpty()) {
			novocep = professorEncontrado.getCep();
		}

		if (novobairro.isEmpty()) {
			novobairro = professorEncontrado.getBairro();
		}

		if (novocomplemento.isEmpty()) {
			novocomplemento = professorEncontrado.getComplemento();
		}
		
		if (novoTelefone.isEmpty()) {
			novoTelefone = professorEncontrado.getTelefone();
		}
		
		if (novocidade.isEmpty()) {
			novocidade = professorEncontrado.getCidade();
		}

		Professor professor = new Professor(numId, status, novoNome, novadata, tiposexo, novoEndereco, novocep, novobairro,
				novocomplemento, novoTelefone, novocidade);
		
		
		professorDao.editar(professor);

		System.out.println(professorDao.getTodos());
	}
	
	
	public static void excluirProfessor() {
		Scanner scanner = new Scanner(System.in); 

		ProfessorDao professorDao = new ProfessorDaoImpl();
		System.out.println(professorDao.getTodos());

		System.out.print("Digite o ID :");
		Long numId = scanner.nextLong();

		Professor professorEncontrado = professorDao.getId(numId);

		if (professorEncontrado != null) {
			System.out.println("Aluno encontrado: " + professorEncontrado);
		} else {
			System.out.println("Aluno não encontrado.");
		}

		System.out.println(">>Excluir Professor:");
		System.out.println("-------------------------------------------");
		System.out.println("ID :" + professorEncontrado.getId());

		Professor professor = new Professor(numId);
		professorDao.excluir(numId);

		System.out.println(professorDao.getTodos());
		
	}
	
	
	@SuppressWarnings("unused")
	public static void pesquisaProfessor() {
		Scanner scanner = new Scanner(System.in);

		ProfessorDao professorDao = new ProfessorDaoImpl();

		System.out.print("Digite o ID :");
		Long numId = scanner.nextLong();

		Professor professorEncontrado = professorDao.getId(numId);

		System.out.println(">>Pesquisar Professor:");
		System.out.println("-------------------------------------------");

		System.out.println("ID :" + professorEncontrado.getId());

		if (professorEncontrado != null) {
			System.out.println("Professor encontrado: " + professorEncontrado);
		} else {
			System.out.println("Professor não encontrado.");
		}

		MenuUtil.menuPesquisa();
	
	}

}
