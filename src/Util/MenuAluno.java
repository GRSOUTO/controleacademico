package Util;

import java.time.LocalDate;
import java.util.Scanner;

import dao.AlunoDao;
import dao.AlunoDaoImpl;
import model.Aluno;
import model.Situacao;
import model.TipoSexo;

public class MenuAluno {

	public static void cadastrarAluno() {
		AlunoDao alunoDao = new AlunoDaoImpl();

		IdGenerator idgera = new IdGenerator();

		Scanner scanner = new Scanner(System.in);
		System.out.println("--------------------------------------------------------------");

		System.out.println(">>Menu de Cadastro Aluno:");
		System.out.print("Situacao :");
		String situacao = scanner.nextLine();
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
		Situacao status = converter.convertSituacao(situacao);
		TipoSexo tiposexo = converter.convert(sexo);
		LocalDate data = converter.convertData(dtNascimento);

		Aluno aluno = new Aluno(idgera.getNextId(), status, nome, data, tiposexo, endereco, cep, bairro, complemento,telefone, cidade);
		alunoDao.salvar(aluno);

		System.out.println(alunoDao.getTodos());
		MenuUtil.mostrarMenuCadastro();
		

	}

	public static void alterarAluno() {
		Scanner scanner = new Scanner(System.in);

		AlunoDao alunoDao = new AlunoDaoImpl();
		System.out.println(alunoDao.getTodos());

		System.out.print("Digite a Matricula :");
		Long matricula = scanner.nextLong();

		Aluno alunoEncontrado = alunoDao.getId(matricula);

		if (alunoEncontrado != null) {
			System.out.println("Aluno encontrado: " + alunoEncontrado);
		} else {
			System.out.println("Aluno não encontrado.");
		}

		System.out.println(">>Alterar Aluno:");
		System.out.println("Nova situação (deixe em branco para manter): ");
		System.out.println("-------------------------------------------");
		System.out.println("Matricula :" + alunoEncontrado.getMatricula());

		System.out.print("Situacao :");
		scanner.nextLine();
		String novaSituacao = scanner.nextLine();
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
		Situacao status = Situacao.VAZIO;

		if (!novaSituacao.isEmpty()) {
			status = converter.convertSituacao(novaSituacao);
		} else if (novaSituacao.isEmpty()) {
			status = alunoEncontrado.getSituacao();
		}

		if (novoNome.isEmpty()) {
			novoNome = alunoEncontrado.getNome();
		}

		LocalDate novadata = LocalDate.now();

		if (!novodtNascimento.isEmpty()) {
			novadata = converter.convertData(novodtNascimento);

		} else if (novodtNascimento.isEmpty()) {
			novadata = alunoEncontrado.getDtNascimento();

		}

		TipoSexo tiposexo = TipoSexo.INDEFINIDO;

		if (!novosexo.isEmpty()) {
			tiposexo = converter.convert(novosexo);
		} else if (novosexo.isEmpty()) {
			tiposexo = alunoEncontrado.getSexo();
		}

		if (novoEndereco.isEmpty()) {
			novoEndereco = alunoEncontrado.getEndereco();
		}

		if (novoEndereco.isEmpty()) {
			novoEndereco = alunoEncontrado.getEndereco();
		}

		if (novocep.isEmpty()) {
			novocep = alunoEncontrado.getTelefone();
		}

		if (novobairro.isEmpty()) {
			novobairro = alunoEncontrado.getTelefone();
		}

		if (novocomplemento.isEmpty()) {
			novocomplemento = alunoEncontrado.getTelefone();
		}

		if (novoTelefone.isEmpty()) {
			novoTelefone = alunoEncontrado.getTelefone();
		}

		if (novocidade.isEmpty()) {
			novocidade = alunoEncontrado.getTelefone();
		}

		Aluno aluno = new Aluno(matricula, status, novoNome, novadata, tiposexo, novoEndereco, novocep, novobairro,
				novocomplemento, novoTelefone, novocidade);

		alunoDao.editar(aluno);

		System.out.println(alunoDao.getTodos());
		MenuUtil.menuAlterar();
		

	}

	public static void excluirAluno() {
		Scanner scanner = new Scanner(System.in);

		AlunoDao alunoDao = new AlunoDaoImpl();
		System.out.println(alunoDao.getTodos());

		System.out.print("Digite a Matricula :");
		Long matricula = scanner.nextLong();

		Aluno alunoEncontrado = alunoDao.getId(matricula);

		if (alunoEncontrado != null) {
			System.out.println("Aluno encontrado: " + alunoEncontrado);
		} else {
			System.out.println("Aluno não encontrado.");
		}

		System.out.println(">>Excluir Aluno:");
		System.out.println("-------------------------------------------");
		System.out.println("Matricula :" + alunoEncontrado.getMatricula());

		Aluno aluno = new Aluno(matricula);
		alunoDao.excluir(matricula);

		System.out.println(alunoDao.getTodos());
		MenuUtil.menuExluir();
		

	}

	@SuppressWarnings("unused")
	public static void pesquisaAluno() {
		Scanner scanner = new Scanner(System.in);

		AlunoDao alunoDao = new AlunoDaoImpl();

		System.out.print("Digite a Matricula :");
		Long matricula = scanner.nextLong();

		Aluno alunoEncontrado = alunoDao.getId(matricula);

		System.out.println(">>Pesquisar Aluno:");
		System.out.println("-------------------------------------------");

		System.out.println("Matricula :" + alunoEncontrado.getMatricula());

		if (alunoEncontrado != null) {
			System.out.println("Aluno encontrado: " + alunoEncontrado);
		} else {
			System.out.println("Aluno não encontrado.");
		}
		
		MenuUtil.menuPesquisa();
		

	}

}
