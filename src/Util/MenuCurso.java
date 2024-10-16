package Util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import dao.CursoDaoImpl;
import dao.CursoDisciplinaProfessor;
import dao.CursoDisciplinaProfessorimpl;
import dao.CursoDao;
import model.Aluno;
import model.Curso;
import model.CursoDiscipProfessor;
import model.Disciplina;
import model.Professor;
import model.Situacao;
import model.TipoSexo;
import model.Titulacao;

import Util.MenuUtil;

public class MenuCurso {

	public static void cadastrarCurso() {

		CursoDaoImpl cursoDao = new CursoDaoImpl();
		CursoDisciplinaProfessorimpl cdp = new CursoDisciplinaProfessorimpl();

		IdGenerator idgera = new IdGenerator();

		Scanner scanner = new Scanner(System.in);
		System.out.println("--------------------------------------------------------------");

		System.out.println(">>Menu de Cadastro Curso:");
		System.out.print("Descriçao :");
		String descricao = scanner.nextLine();
		System.out.print("Disciplina :");
		Long disciplina = scanner.nextLong();
		System.out.print("Professor :");
		Long professor = scanner.nextLong();

		Converter converter = new Converter();

		Curso curso = new Curso(idgera.getNextId(), descricao, disciplina, professor);
		cursoDao.salvar(curso);

		System.out.println(cdp.getTodosCursos());
		System.out.print("0. Sair :");

	}

	public static void alterarCurso() {
		Scanner scanner = new Scanner(System.in);

		CursoDao cursoDao = new CursoDaoImpl();
		CursoDisciplinaProfessorimpl cdp = new CursoDisciplinaProfessorimpl();
		System.out.println(cursoDao.getTodos());

		System.out.print("Digite o Código :");
		Long numCod = scanner.nextLong();

		Curso cursoEncontrado = cursoDao.getCodigo(numCod);

		if (cursoEncontrado != null) {
			System.out.println("Curso encontrado: " + cursoEncontrado);
		} else {
			System.out.println("Curso não encontrado.");
		}

		System.out.println(">>Alterar Curso:");
		System.out.println("Novo Codigo (deixe em branco para manter): ");
		System.out.println("-------------------------------------------");
		System.out.println("Codigo :" + cursoEncontrado.getCodigo());

		System.out.print("Descrição :");
		scanner.nextLine();
		String novaDescricao = scanner.nextLine();
		System.out.print("Disciplina :");
		String novaDisciplina = scanner.nextLine();
		System.out.print("Professor :");
		String novoProfessor = scanner.nextLine();

		Converter converter = new Converter();
		// LocalDate novadata = converter.convertData(novodtNascimento);

		if (novaDescricao.isEmpty()) {
			novaDescricao = cursoEncontrado.getDescricao();
		}

		Long disciplinanova = null;
		if (!novaDisciplina.isEmpty()) {
			disciplinanova = Long.parseLong(novaDisciplina);
		} else if (novaDisciplina.isEmpty()) {
			disciplinanova = cursoEncontrado.getDisciplinaId();
		}

		Long proferssoNovo = null;
		if (!novoProfessor.isEmpty()) {
			proferssoNovo = Long.parseLong(novoProfessor);
		} else if (novaDisciplina.isEmpty()) {
			proferssoNovo = cursoEncontrado.getProfessorId();
		}

		Curso curso = new Curso(numCod, novaDescricao, disciplinanova, proferssoNovo);

		cursoDao.editar(curso);

		System.out.println(cdp.getTodosCursos());
	}

	public static void excluirCurso() {
		Scanner scanner = new Scanner(System.in);

		CursoDao cursoDao = new CursoDaoImpl();
		System.out.println(cursoDao.getTodos());

		System.out.print("Digite o Código :");
		Long numCod = scanner.nextLong();

		Curso cursoEncontrado = cursoDao.getCodigo(numCod);

		if (cursoEncontrado != null) {
			System.out.println("Curso encontrado: " + cursoEncontrado);
		} else {
			System.out.println("Curso não encontrado.");
		}

		System.out.println(">>Excluir Curso:");
		System.out.println("-------------------------------------------");
		System.out.println("Código :" + cursoEncontrado.getCodigo());

		Curso curso = new Curso(numCod);
		cursoDao.excluir(numCod);

		System.out.println(cursoDao.getTodos());

	}

	@SuppressWarnings("unused")
	public static void pesquisaCurso() {
		Scanner scanner = new Scanner(System.in);

		CursoDao cursoDao = new CursoDaoImpl();
		CursoDisciplinaProfessorimpl cdp = new CursoDisciplinaProfessorimpl();

		System.out.print("Digite o Código :");
		Long numCod = scanner.nextLong();

		// Curso cursoEncontrado = cursoDao.getCodigo(numCod);
		CursoDiscipProfessor cursoEncontrado = cdp.getId(numCod);

		System.out.println(">>Pesquisar Curso:");
		System.out.println("-------------------------------------------");

		System.out.println("Código :" + cursoEncontrado.getCursoId());

		if (cursoEncontrado != null) {
			System.out.println("Curso encontrado: " + cursoEncontrado);

		} else {
			System.out.println("Curso não encontrado.");
		}

		MenuUtil.menuPesquisa();

	}

}
