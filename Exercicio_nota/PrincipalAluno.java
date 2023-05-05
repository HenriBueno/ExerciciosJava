public class PrincipalAluno {
    public static void main(String [] args){
        int idAluno=1;
        Aluno Aluno1=new Aluno(Teclado.leString("Digite o nome do aluno:"+idAluno),
        Teclado.leInt("Digite o numero da matricula:"+idAluno),
        Teclado.leDouble("Digite a nota do grau A:"+idAluno),
        Teclado.leDouble("Digite a nota do grau B:"+idAluno));
       
        idAluno+=1;
        Aluno Aluno2=new Aluno(Teclado.leString("Digite o nome do aluno:"+idAluno),
        Teclado.leInt("Digite o numero da matricula:"+idAluno),
        Teclado.leDouble("Digite a nota do grau A:"+idAluno),
        Teclado.leDouble("Digite a nota do grau B:"+idAluno));
        
        idAluno+=1;
        Aluno Aluno3=new Aluno(Teclado.leString("Digite o nome do aluno:"+idAluno),
        Teclado.leInt("Digite o numero da matricula:"+idAluno),
        Teclado.leDouble("Digite a nota do grau A:"+idAluno),
        Teclado.leDouble("Digite a nota do grau B:"+idAluno));

        System.out.println("Informações dos 3 alunos:");
        Aluno1.imprimeInfo();
        System.out.println("A media final foi:"+Aluno1.calculaMediaFinal());
        Aluno2.imprimeInfo();
        System.out.println("A media final foi:"+Aluno2.calculaMediaFinal());
        Aluno3.imprimeInfo();
        System.out.println("A media final foi:"+Aluno3.calculaMediaFinal());


    }
}
