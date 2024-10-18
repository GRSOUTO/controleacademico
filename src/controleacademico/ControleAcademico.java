package controleacademico;


import Util.MenuUtil;
import dao.CursoDisciplinaProfessorimpl;
import dao.TurmaDaoImpl;
import model.Turma;



public class ControleAcademico {

	public static void main(String[] args) {

		CursoDisciplinaProfessorimpl associador = new CursoDisciplinaProfessorimpl();
		associador.obterCursoDiscProf();
		
		TurmaDaoImpl turma =new TurmaDaoImpl();
		turma.getTodos();

	
		//CursoDisciplinaProfessorimpl associador1 = new CursoDisciplinaProfessorimpl();
		//associador1.obterCursoDiscProf();

		MenuUtil.mostrarMenuPrincipal();

	}

	/*
	 * private static void mostrarMenuPrincipal() { Scanner scanner = new
	 * Scanner(System.in); int opcao;
	 * 
	 * System.out.println(
	 * "------------------------------------------------------------");
	 * System.out.println("Menu de Cadastro:"); System.out.println("1. Cadastrar");
	 * System.out.println("2. Alterar"); System.out.println("3. Excluir");
	 * System.out.println("4. Pesquisar"); System.out.println("0. Sair");
	 * System.out.print("Digite a opção desejada: "); opcao = scanner.nextInt();
	 * switch (opcao) { // Cadastrar-----------------------------------> case 1: do
	 * { limparTela(); mostrarMenuCadastro(); ///scanner.nextInt(); } while (opcao
	 * != 0);
	 * 
	 * break; ///
	 * Alterar------------------------------------------------------------> case 2:
	 * do { limparTela(); menuAlterarAluno(); //opcao = scanner.nextInt(); } while
	 * (opcao != 0);
	 * 
	 * break; // Exluir------------------------------------------------------------>
	 * case 3: do { limparTela(); menuExluirAluno();
	 * 
	 * } while (opcao != 0);
	 * 
	 * break; //
	 * Pesquisar------------------------------------------------------------> case
	 * 4: limparTela(); menuPesquisaAluno(); break; case 0:
	 * System.out.println("Saindo do sistema..."); limparTela(); break; default:
	 * System.out.println("Opção inválida!"); }
	 * 
	 * }
	 * 
	 * private static void mostrarMenuCadastro() { Scanner scanner = new
	 * Scanner(System.in); int opcao;
	 * 
	 * System.out.println(
	 * "----------------------------------------------------------------");
	 * System.out.println(">>Menu de Cadastro Academico:");
	 * System.out.println("1. Cadastrar Alunos");
	 * System.out.println("2. Cadastar professor");
	 * System.out.println("3. Cadastar Discipliana");
	 * System.out.println("4. Cadastar Curso");
	 * System.out.println("5. Cadastar Turma"); System.out.println("0. Sair");
	 * System.out.print("Digite a opção desejada: "); opcao = scanner.nextInt();
	 * switch (opcao) { case 1: limparTela(); cadastrarAluno();
	 * 
	 * break; case 2: /// alterarAluno(); break; case 3: // cadastrarProfessor();
	 * break; case 4: // cadastrarProfessor(); break; case 0:
	 * System.out.println("Saindo Menu Principal do sistema..."); limparTela();
	 * mostrarMenuPrincipal(); break; default:
	 * System.out.println("Opção inválida!");
	 * 
	 * }
	 * 
	 * }
	 * 
	 * private static void cadastrarAluno() { AlunoDao alunoDao = new
	 * AlunoDaoImpl();
	 * 
	 * IdGenerator idgera = new IdGenerator();
	 * 
	 * Scanner scanner = new Scanner(System.in); System.out.println(
	 * "--------------------------------------------------------------");
	 * 
	 * System.out.println(">>Menu de Cadastro Aluno:");
	 * System.out.print("Situacao :"); String situacao = scanner.nextLine();
	 * System.out.print("Nome :"); String nome = scanner.nextLine();
	 * System.out.print("Endereço :"); String endereco = scanner.nextLine();
	 * System.out.print("Telefone :"); String telefone = scanner.nextLine();
	 * 
	 * Aluno aluno = new Aluno(idgera.getNextId(), situacao, nome, endereco,
	 * telefone); alunoDao.salvar(aluno);
	 * 
	 * System.out.println(alunoDao.getTodos()); System.out.print("0. Sair :");
	 * 
	 * }
	 * 
	 * private static void menuAlterarAluno() { Scanner scanner = new
	 * Scanner(System.in); int opcao;
	 * 
	 * System.out.println(
	 * "----------------------------------------------------------------");
	 * System.out.println(">>Menu de Alterar Cadastro Academico:");
	 * System.out.println("1. Alterar Alunos");
	 * System.out.println("2. Alterar Professor");
	 * System.out.println("3. Alterar Discipliana");
	 * System.out.println("4. Alterar Curso");
	 * System.out.println("5. Alterar Turma"); System.out.println("0. Sair");
	 * System.out.print("Digite a opção desejada: ");
	 * 
	 * opcao = scanner.nextInt();
	 * 
	 * switch (opcao) { case 1: limparTela(); alterarAluno(); break; case 2: ///
	 * alterarAluno(); break; case 3: // cadastrarProfessor(); break; case 4: //
	 * cadastrarProfessor(); break; case 0:
	 * System.out.println("Saindo Menu Principal do sistema..."); limparTela();
	 * mostrarMenuPrincipal(); break; default:
	 * System.out.println("Opção inválida!");
	 * 
	 * }
	 * 
	 * }
	 * 
	 * private static void alterarAluno() { Scanner scanner = new
	 * Scanner(System.in);
	 * 
	 * AlunoDao alunoDao = new AlunoDaoImpl();
	 * System.out.println(alunoDao.getTodos());
	 * 
	 * System.out.print("Digite a Matricula :"); Long matricula =
	 * scanner.nextLong();
	 * 
	 * Aluno alunoEncontrado = alunoDao.getId(matricula);
	 * 
	 * if (alunoEncontrado != null) { System.out.println("Aluno encontrado: " +
	 * alunoEncontrado); } else { System.out.println("Aluno não encontrado."); }
	 * 
	 * System.out.println(">>Alterar Aluno:");
	 * System.out.println("Nova situação (deixe em branco para manter): ");
	 * System.out.println("-------------------------------------------");
	 * System.out.println("Matricula :" + alunoEncontrado.getMatricula());
	 * 
	 * System.out.print("Situacao :"); scanner.nextLine(); String novaSituacao =
	 * scanner.nextLine(); System.out.print("Nome :"); String novoNome =
	 * scanner.nextLine(); System.out.print("Endereço :"); String novoEndereco =
	 * scanner.nextLine(); System.out.print("Telefone :"); String novoTelefone =
	 * scanner.nextLine();
	 * 
	 * // System.out.println("O nome igual:" + alunoEncontrado.getNome()); //
	 * System.out.println("O nome novoNome:" + novoNome);
	 * 
	 * // Atualizar apenas os campos que foram alterados if (novaSituacao.isEmpty())
	 * { novaSituacao = alunoEncontrado.getSituacao(); }
	 * 
	 * if (novoNome.isEmpty()) { novoNome = alunoEncontrado.getNome(); }
	 * 
	 * if (novoEndereco.isEmpty()) { novoEndereco = alunoEncontrado.getEndereco(); }
	 * 
	 * if (novoTelefone.isEmpty()) { novoTelefone = alunoEncontrado.getTelefone(); }
	 * 
	 * Aluno aluno = new Aluno(matricula, novaSituacao, novoNome, novoEndereco,
	 * novoTelefone); alunoDao.editar(aluno);
	 * 
	 * System.out.println(alunoDao.getTodos()); }
	 * 
	 * private static void limparTela() { System.out.print("\033[H\033[2J");
	 * System.out.flush(); }
	 * 
	 * private static void menuExluirAluno() { Scanner scanner = new
	 * Scanner(System.in); int opcao;
	 * 
	 * System.out.println(
	 * "----------------------------------------------------------------");
	 * System.out.println(">>Menu de Alterar Cadastro Academico:");
	 * System.out.println("1. Excluir Alunos");
	 * System.out.println("2. Excluir Professor");
	 * System.out.println("3. Excluir Discipliana");
	 * System.out.println("4. Excluir Curso");
	 * System.out.println("5. Excluir Turma"); System.out.println("0. Sair");
	 * System.out.print("Digite a opção desejada: ");
	 * 
	 * opcao = scanner.nextInt();
	 * 
	 * switch (opcao) { case 1: limparTela(); excluirAluno(); break; case 2: ///
	 * alterarAluno(); break; case 3: // cadastrarProfessor(); break; case 4: //
	 * cadastrarProfessor(); break; case 0:
	 * System.out.println("Saindo Menu Principal do sistema..."); limparTela();
	 * mostrarMenuPrincipal(); break; default:
	 * System.out.println("Opção inválida!");
	 * 
	 * }
	 * 
	 * }
	 * 
	 * private static void excluirAluno() { Scanner scanner = new
	 * Scanner(System.in);
	 * 
	 * AlunoDao alunoDao = new AlunoDaoImpl();
	 * System.out.println(alunoDao.getTodos());
	 * 
	 * System.out.print("Digite a Matricula :"); Long matricula =
	 * scanner.nextLong();
	 * 
	 * Aluno alunoEncontrado = alunoDao.getId(matricula);
	 * 
	 * if (alunoEncontrado != null) { System.out.println("Aluno encontrado: " +
	 * alunoEncontrado); } else { System.out.println("Aluno não encontrado."); }
	 * 
	 * System.out.println(">>Excluir Aluno:");
	 * System.out.println("-------------------------------------------");
	 * System.out.println("Matricula :" + alunoEncontrado.getMatricula());
	 * 
	 * Aluno aluno = new Aluno(matricula); alunoDao.excluir(matricula);
	 * 
	 * System.out.println(alunoDao.getTodos());
	 * 
	 * }
	 * 
	 * private static void menuPesquisaAluno() { Scanner scanner = new
	 * Scanner(System.in); int opcao;
	 * 
	 * System.out.println(
	 * "----------------------------------------------------------------");
	 * System.out.println(">>Menu de Alterar Cadastro Academico:");
	 * System.out.println("1. Pesquisar Alunos");
	 * System.out.println("2. Pesquisar Professor");
	 * System.out.println("3. Pesquisar Discipliana");
	 * System.out.println("4. Pesquisar Curso");
	 * System.out.println("5. Pesquisar Turma"); System.out.println("0. Sair");
	 * System.out.print("Digite a opção desejada: ");
	 * 
	 * opcao = scanner.nextInt();
	 * 
	 * switch (opcao) { case 1: limparTela(); pesquisaAluno(); break; case 2: ///
	 * alterarAluno(); break; case 3: // cadastrarProfessor(); break; case 4: //
	 * cadastrarProfessor(); break; case 0:
	 * System.out.println("Saindo Menu Principal do sistema..."); limparTela();
	 * mostrarMenuPrincipal(); break; default:
	 * System.out.println("Opção inválida!");
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @SuppressWarnings("unused") private static void pesquisaAluno() { Scanner
	 * scanner = new Scanner(System.in);
	 * 
	 * AlunoDao alunoDao = new AlunoDaoImpl();
	 * 
	 * System.out.print("Digite a Matricula :"); Long matricula =
	 * scanner.nextLong();
	 * 
	 * Aluno alunoEncontrado = alunoDao.getId(matricula);
	 * 
	 * System.out.println(">>Pesquisar Aluno:");
	 * System.out.println("-------------------------------------------");
	 * 
	 * System.out.println("Matricula :" + alunoEncontrado.getMatricula());
	 * 
	 * if (alunoEncontrado != null) { System.out.println("Aluno encontrado: " +
	 * alunoEncontrado); } else { System.out.println("Aluno não encontrado."); }
	 * 
	 * 
	 * 
	 * }
	 */

}

//private static Integer posicao(List<Aluno> list, long ) 

/*
 * List<Aluno> listAluno = new ArrayList<>();
 * 
 * Aluno aluno = new Aluno();
 * 
 * aluno.setMatricula("1"); aluno.setNome("Gabriel Souto");
 * aluno.setEndereco("teste"); aluno.setTelefone("51-99999999");
 * aluno.setSituacao("0");
 * 
 * listAluno.add(aluno);
 * 
 * Aluno aluno1 = new Aluno();
 * 
 * aluno1.setMatricula("2"); aluno1.setNome("Gio"); aluno1.setEndereco("teste");
 * aluno1.setTelefone("51-99999999"); aluno1.setSituacao("0");
 * 
 * listAluno.add(aluno1);
 * 
 * System.out.println(listAluno);
 * 
 * System.out.println(" "); System.out.println(
 * "Professor----------------------------------------------------------");
 * 
 * List<Professor> listProf = new ArrayList<>();
 * 
 * Professor prof = new Professor();
 * 
 * prof.setId(1); prof.setTitulacaoMaxima("Português"); prof.setNome("Prof1");
 * prof.setEndereco("teste"); prof.setTelefone("51-99999999");
 * 
 * listProf.add(prof);
 * 
 * Professor prof1 = new Professor();
 * 
 * prof1.setId(2); prof1.setTitulacaoMaxima("Matematica");
 * prof1.setNome("Prof2"); prof1.setEndereco("teste");
 * prof1.setTelefone("51-99999999");
 * 
 * listProf.add(prof1);
 * 
 * System.out.println(listProf);
 * 
 * System.out.println(" "); System.out.println(
 * "Disciplina----------------------------------------------------------");
 * 
 * List<Disciplina> listdisciplina = new ArrayList<>();
 * 
 * Disciplina disciplina = new Disciplina();
 * 
 * disciplina.setCodigo(1); disciplina.setDescricao("Português");
 * disciplina.setCargaHoraria(40); disciplina.setEmenta("não sei");
 * disciplina.setBibliografia("prof. xxx");
 * 
 * listdisciplina.add(disciplina);
 * 
 * Disciplina disciplina1 = new Disciplina();
 * 
 * disciplina1.setCodigo(2); disciplina1.setDescricao("Matematica");
 * disciplina1.setCargaHoraria(40); disciplina1.setEmenta("não sei");
 * disciplina1.setBibliografia("prof. xxx");
 * 
 * listdisciplina.add(disciplina1);
 * 
 * System.out.println(listdisciplina);
 * 
 * System.out.println(" "); System.out.println(
 * "Curso----------------------------------------------------------");
 * 
 * List<Curso> listcurso = new ArrayList<>(); Curso curso = new Curso();
 * 
 * curso.setCodigo(1); curso.setDescricao("Letras"); curso.setProfessor(prof);
 * curso.setDisciplina(disciplina); curso.setAluno(aluno1);
 * 
 * listcurso.add(curso);
 * 
 * // prof.getCurso().add(curso);
 * 
 * Curso curso1 = new Curso();
 * 
 * curso1.setCodigo(2); curso1.setDescricao("Matematica");
 * curso1.setProfessor(prof1); curso1.setDisciplina(disciplina1);
 * curso1.setAluno(aluno);
 * 
 * listcurso.add(curso1); System.out.println("\n" + listcurso);
 * 
 * System.out.println(" "); System.out.println(
 * "Turma----------------------------------------------------------");
 * 
 * List<Turma> listturma = new ArrayList<>();
 * 
 * Turma turma = new Turma();
 * 
 * turma.setAno(2024); turma.setDiaSemana(1); turma.setHorarios("Manhã");
 * turma.setSemestre(1); turma.setDisciplina(disciplina1);
 * turma.setProfessor(prof1); turma.setAluno(aluno);
 * 
 * listturma.add(turma);
 * 
 * Turma turma1 = new Turma();
 * 
 * turma1.setAno(2024); turma1.setDiaSemana(1); turma1.setHorarios("Noite");
 * turma1.setSemestre(1); turma1.setDisciplina(disciplina);
 * turma1.setProfessor(prof); turma1.setAluno(aluno1); listturma.add(turma1);
 * 
 * System.out.println("\n" + listturma);
 * 
 * System.out.
 * println("Por INDEX Truma  -------------------------------------------");
 * 
 * System.out.println("\n" + listturma.get(0)); System.out.println("\n" +
 * listturma.get(0)); System.out.println("\n" + listturma.get(0).getAluno());
 * System.out.println("\n" + listturma.get(0).getAno());
 * 
 * System.out.println("\n" + listturma.get(0).getProfessor().getNome());
 * System.out.println("\n" + listturma.get(0).getDisciplina().getDescricao());
 * System.out.println("\n" + listturma.get(0).getAluno().getNome());
 * 
 * System.out.
 * println("Por INDEX Truma1 1--------------------------------------------");
 * 
 * System.out.println("\n" + listturma.get(1)); System.out.println("\n" +
 * listturma.get(1).getAno()); System.out.println("\n" +
 * listturma.get(1).getProfessor().getNome()); System.out.println("\n" +
 * listturma.get(1).getDisciplina().getDescricao()); System.out.println("\n" +
 * listturma.get(1).getAluno().getNome());
 * 
 * //---------------------------------------------------------------------------
 * -------------------------
 * 
 * System.out.println(" ");
 * 
 * System.out.println("******array ListaTruma1 1 -------------------------");
 * 
 * System.out.println("Antes Disciplina Truma 1: " +
 * listturma.get(1).getDisciplina().getDescricao());
 * 
 * listturma.set(1, turma1).setDisciplina(disciplina1);
 * 
 * System.out.println(" ");
 * 
 * System.out.println("Depois array ListaTruma1 1 -------------------------");
 * 
 * System.out.println("Disciplina Truma 1: " +
 * listturma.get(1).getDisciplina().getDescricao());
 * 
 * System.out.println(" ");
 */
