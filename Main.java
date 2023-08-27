import java.time.LocalDate;
class BasePessoa {
int codigo;
String nome;
String endereco;
String telefone;
LocalDate dataNascimento;
String rg;
String cpf;
LocalDate dataInsercao;
public BasePessoa(int codigo, String nome, String endereco, String telefone,
LocalDate dataNascimento, String rg, String cpf, LocalDate
dataInsercao) {
this.codigo = codigo;this.nome = nome;
this.endereco = endereco;
this.telefone = telefone;
this.dataNascimento = dataNascimento;
this.rg = rg;
this.cpf = cpf;
this.dataInsercao = dataInsercao;
}
}
class Professor extends BasePessoa {
String registro;
LocalDate dataContratacao;
public Professor(int codigo, String nome, String endereco, String telefone,
LocalDate dataNascimento, String rg, String cpf, LocalDate
dataInsercao,
String registro, LocalDate dataContratacao) {
super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
this.registro = registro;
this.dataContratacao = dataContratacao;
}
}class Aluno extends BasePessoa {
String matricula;
LocalDate dataMatricula;
public Aluno(int codigo, String nome, String endereco, String telefone,
LocalDate dataNascimento, String rg, String cpf, LocalDate dataInsercao,
String matricula, LocalDate dataMatricula) {
super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
this.matricula = matricula;
this.dataMatricula = dataMatricula;
}
}
public class Main {
public static void main(String[] args) {
// Exemplo de criação de objetos Professor e Aluno
LocalDate dataNascimento = LocalDate.of(1990, 5, 15);
LocalDate dataInsercao = LocalDate.of(2023, 7, 1);
LocalDate dataContratacao = LocalDate.of(2023, 7, 15);
LocalDate dataMatricula = LocalDate.of(2023, 8, 1);Professor professor = new Professor(1, "Jensen", "Rua A", "777778795",
dataNascimento, "168765", "766677888", dataInsercao,
"202308", dataContratacao);
Aluno aluno = new Aluno(2, "Beatriz", "Rua B", "989999399",
dataNascimento, "654321", "888888888", dataInsercao,
"202301", dataMatricula);
// Você pode agora usar os objetos professor e aluno conforme necessário
System.out.println("Professor: " + professor.nome);
System.out.println("Registro: " + professor.registro);
System.out.println("Aluno: " + aluno.nome);
System.out.println("Matrícula: " + aluno.matricula);
}
}