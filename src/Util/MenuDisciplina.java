package Util;

import java.time.LocalDate;
import java.util.Scanner;

import dao.DisciplinaDaoImp;
import dao.AlunoDao;
import dao.AlunoDaoImpl;
import dao.DisciplinaDao;
import model.Aluno;
import model.Disciplina;
import model.Situacao;
import model.TipoSexo;

public class MenuDisciplina {
	public static void cadastrarAluno() {
		DisciplinaDao disciplinaDao = new DisciplinaDaoImp();

		IdGenerator idgera = new IdGenerator();

		Scanner scanner = new Scanner(System.in);
		System.out.println("--------------------------------------------------------------");

		System.out.println(">>Menu de Cadastro Disciplina:");
		System.out.print("Descricao :");
		String descricao = scanner.nextLine();
		System.out.print("Carga Horaria :");
		Integer cargaHoraria = scanner.nextInt();
		System.out.print("Ementa :");
		String ementa = scanner.nextLine();
		scanner.nextLine();
		System.out.print("Bibliografia :");
		String bibliografia = scanner.nextLine();

		Disciplina disciplina = new Disciplina(idgera.getNextId(), descricao, cargaHoraria, ementa, bibliografia);
		disciplinaDao.salvar(disciplina);

		System.out.println(disciplinaDao.getTodos());
		MenuUtil.mostrarMenuCadastro();

	}

	public static void alterarDisciplina() {
		Scanner scanner = new Scanner(System.in);

		DisciplinaDao disciplinaDao = new DisciplinaDaoImp();

		System.out.println(disciplinaDao.getTodos());

		System.out.print("Digite Código da Disciplina :");
		Long codigo = scanner.nextLong();

		Disciplina disciplinaEncontrada = disciplinaDao.getId(codigo);

		if (disciplinaEncontrada != null) {
			System.out.println("Discplina encontrada: " + disciplinaEncontrada);
		} else {
			System.out.println("Discplina não encontrada.");
		}

		System.out.println(">>Alterar Disciplina:");
		System.out.println("Nova situação (deixe em branco para manter): ");
		System.out.println("-------------------------------------------");
		System.out.println("Código :" + disciplinaEncontrada.getCodigo());

		System.out.println(">>Menu de Cadastro Disciplina:");
		System.out.print("Descricao :");
		scanner.nextLine();
		String novadescricao = scanner.nextLine();
		System.out.print("Carga Horaria :");
		Integer novacargaHoraria = scanner.nextInt();
		System.out.print("Ementa :");
		String novaementa = scanner.nextLine();
		scanner.nextLine();
		System.out.print("Bibliografia :");
		String novabibliografia = scanner.nextLine();
		
		
		System.out.println("0 novacargaHoraria :" + novacargaHoraria);
		
		if (novadescricao.isEmpty()) {
			novadescricao = disciplinaEncontrada.getDescricao();
		}
		System.out.println("1 novacargaHoraria :" + novacargaHoraria);
		
		if (novacargaHoraria.getInteger(null))) {
			novacargaHoraria = disciplinaEncontrada.getCargaHoraria();

		}

		if (novaementa.isEmpty()) {
			novaementa = disciplinaEncontrada.getEmenta();
		}

		if (novabibliografia.isEmpty()) {
			novabibliografia = disciplinaEncontrada.getBibliografia();
		}

		
		System.out.println("2 novacargaHoraria :" + novacargaHoraria);
		System.out.println("3-novacargaHoraria :" + disciplinaEncontrada.getCargaHoraria());
		
		Disciplina disciplina = new Disciplina(codigo, novadescricao, novacargaHoraria, novaementa, novabibliografia);
		disciplinaDao.editar(disciplina);

		System.out.println(disciplinaDao.getTodos());

		MenuUtil.menuAlterar();

	}

}
