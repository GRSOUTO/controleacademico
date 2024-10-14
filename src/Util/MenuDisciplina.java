package Util;

import java.util.Scanner;
import dao.DisciplinaDaoImpl;
import dao.DisciplinaDao;
import model.Disciplina;

public class MenuDisciplina {
	public static void cadastrarDisciplina() {
		DisciplinaDao disciplinaDao = new DisciplinaDaoImpl();

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
		Integer cargaHoraria = 0;
		Scanner scanner = new Scanner(System.in);

		DisciplinaDao disciplinaDao = new DisciplinaDaoImpl();

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
		String novacargaHoraria = scanner.nextLine();
		System.out.print("Ementa :");
		String novaementa = scanner.nextLine();

		System.out.print("Bibliografia :");
		String novabibliografia = scanner.nextLine();

		if (novadescricao.isEmpty()) {
			novadescricao = disciplinaEncontrada.getDescricao();
		}

		if (!novacargaHoraria.isEmpty()) {
			cargaHoraria = Integer.parseInt(novacargaHoraria);
		} else if (novacargaHoraria.isEmpty()) {
			cargaHoraria = disciplinaEncontrada.getCargaHoraria();
		}

		if (novaementa.isEmpty()) {
			novaementa = disciplinaEncontrada.getEmenta();
		}

		if (novabibliografia.isEmpty()) {
			novabibliografia = disciplinaEncontrada.getBibliografia();
		}

		Disciplina disciplina = new Disciplina(codigo, novadescricao, cargaHoraria, novaementa, novabibliografia);
		disciplinaDao.editar(disciplina);

		System.out.println(disciplinaDao.getTodos());

		MenuUtil.menuAlterar();

	}

}
