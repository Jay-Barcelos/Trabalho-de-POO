package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public abstract class BasePessoa {
    protected int codigo;
    protected String nome;
    protected String email;
    private String telefone;
    private Date dataNascimento;
    public String usuario;
    public String senha;

    
    public BasePessoa(int codigo, String nome, String email, String telefone, Date dataNascimento, String usuario,
            String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.usuario = usuario;
        this.senha = senha;
    }

    public BasePessoa() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}

class Funcionario {
    private int codigo;
    private String nome;
    private String telefone;
    private String contaCorrente;
    private String registro;
    private String cracha;
    private String usuario;
    private String senha;

    public Funcionario(int codigo, String nome, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
    }
}

class Passageiro {
    private int codigo;
    private String nome;
    private String email;
    private String numeroCartao;
    private String documento;
    private String registro;
    private Date dataNascimento;
    private String usuario;

    public Passageiro(int codigo, String nome, String email, String numeroCartao, String documento, Date dataNascimento, String usuario) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.numeroCartao = numeroCartao;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
        this.usuario = usuario;
    }
}
