import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		//Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior do que a m�dia. Fa�a um programa onde o professor informe a m�dia e as notas de cada um dos 50 alunos e, ao final, seja exibido quantos alunos tiveram nota superior � m�dia e quantos tiveram nota inferior � m�dia.
		
		Scanner leitor = new Scanner (System.in);
		double media, nota = 0.0;
		int qtde = 1;
		int aprovados = 0;
		
		System.out.println("Qual a media da turma? ");
		media = leitor.nextDouble();
		
		while (qtde <= 50) {
			System.out.println("Informe a nota do �" + qtde + " aluno:");
			nota = leitor.nextDouble();
			if (nota > media) {
				aprovados = aprovados + 1;
			}
			qtde = qtde + 1;
		}
		
		System.out.println("Alunos acima da m�dia: " + aprovados);
	}

}
