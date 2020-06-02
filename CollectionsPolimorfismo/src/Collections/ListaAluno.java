package Collections;

import java.util.*;

public class ListaAluno {

	public static void main(String[] args) {
		
		List<Aluno> lista = new ArrayList<Aluno>();
		
		Aluno a = new Aluno("Carlos Ferreira", "Java Básico", 0);
		Aluno b = new Aluno("Maria Souza", "Python", 0);
		Aluno c = new Aluno("Carla Silva", "Cloud", 0);
		Aluno d = new Aluno("José Guerreiro", "MySQL", 0);
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		System.out.println(lista);
		
		Aluno aluno;
		Iterator<Aluno> itr = lista.iterator();
			while (itr.hasNext()) {
				aluno = itr.next();
				System.out.println(aluno.getNome());
			}

	}

}
