package helloworld.main;

public class HelloWorld {

	public static void main(String[] args) {
		String[] alunos = {"Marcos", "Aline", "Lucas", "Patricia"};
		
		String log;
		int aluno;
		for(aluno = 0; aluno < alunos.length; aluno++) {
			log = "Aluno: " + alunos[aluno];
			System.out.println(log);
		}
	}

}
