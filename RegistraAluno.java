public class RegistraAluno {
    
    private String nome;
    private int idade;
    private String endereco;
    private String curso;
    private String matricula;

    public RegistraAluno(String nome, int idade, String endereco, String curso, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.curso = curso;
        this.matricula = matricula;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
    }

    public void imprimir(double nota1, double nota2) {
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
    }
}
