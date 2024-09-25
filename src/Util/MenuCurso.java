package Util;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import dao.CursoDaoImpl;
import dao.CursoDao;
import model.Aluno;
import model.Curso;
import model.Disciplina;
import model.Situacao;
import model.TipoSexo;
import model.Titulacao;
import Util.MenuUtil;

public class MenuCurso {

	public static void cadastrarCurso() {
		CursoDaoImpl cursoDao = new CursoDaoImpl();

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

		System.out.println(cursoDao.getTodos());
		System.out.print("0. Sair :");

	}

	public static void alterarCurso() {
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
		Long novoProfessor = scanner.nextLong();
		

		Converter converter = new Converter();
		//	LocalDate novadata = converter.convertData(novodtNascimento);
		
		
		if (novaDescricao.isEmpty()) {
			novaDescricao = cursoEncontrado.getDescricao();
		}
	
		
		Long disciplinanova = null;
		if (!novaDisciplina.isEmpty()) {
			disciplinanova = Long.parseLong(novaDisciplina);
		} else if (novaDisciplina.isEmpty()) {
			List<Disciplina> disciplinas = cursoEncontrado.getDisciplinasc(numCod);
					
		}
			
	
	/*	if (novoProfessor.isEmpty()) {
			novoProfessor = cursoEncontrado.getProfessor();
		}*/
		
		
		Curso curso = new Curso(numCod, novaDescricao, disciplinanova, novoProfessor);
		
		
		cursoDao.editar(curso);

		System.out.println(cursoDao.getTodos());
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

		System.out.print("Digite o Código :");
		Long numCod = scanner.nextLong();

		Curso cursoEncontrado = cursoDao.getCodigo(numCod);

		System.out.println(">>Pesquisar Curso:");
		System.out.println("-------------------------------------------");

		System.out.println("Código :" + cursoEncontrado.getCodigo());

		if (cursoEncontrado != null) {
			System.out.println("Curso encontrado: " + cursoEncontrado);
		} else {
			System.out.println("Curso não encontrado.");
		}

		MenuUtil.menuPesquisa();

	}

}
