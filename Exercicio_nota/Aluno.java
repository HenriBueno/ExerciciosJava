public class Aluno{
    private String nome;
    private int matricula;
    private double notaA;
    private double notaB;

    public Aluno(String nome, int matricula, double notaA, double notaB){
        this.nome=nome;
        this.matricula=matricula;
        this.notaA=notaA;
        this.notaB=notaB;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula=matricula;
    }
    
    public double getNotaA(){
        return notaA;
    }
    public void setNotaA(double notaA){
        this.notaA=notaA;
    }

    public double getNotaB(){
        return notaB;
    }
    public void setNotaB(double notaB){
        this.notaB=notaB;
    }

    public double calculaMediaFinal(){
        return (notaA*0.33)+(notaB*0.67);
    }

    public void imprimeInfo(){
        System.out.println("Nome do aluno:"+nome);
        System.out.println("Numero da matricula:"+matricula);
        System.out.println("Nota do grau A:"+notaA);
        System.out.println("Nota do grau B:"+notaB);
        
    }

}