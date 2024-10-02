import java.time.LocalDate;

// Classe base Pessoa
class Pessoa {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    // Construtor da classe Pessoa
    public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}

// Classe Vendedor que herda de Pessoa
class Vendedor extends Pessoa {
    private LocalDate dataContratacao;
    private double salarioBase;
    private double percentualComissao;

    // Construtor da classe Vendedor
    public Vendedor(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase,
            double percentualComissao) {
        super(nome, cpf, dataNascimento);
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.percentualComissao = percentualComissao;
    }

    // Getters
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }
}

// Classe Gerente que herda de Pessoa
class Gerente extends Pessoa {
    private LocalDate dataContratacao;
    private double salarioBase;
    private String departamento;

    // Construtor da classe Gerente
    public Gerente(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase,
            String departamento) {
        super(nome, cpf, dataNascimento);
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    // Getters
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getDepartamento() {
        return departamento;
    }
}

// Classe Cliente que herda de Pessoa
class Cliente extends Pessoa {
    private String email;
    private String numeroCartaoFidelidade;
    private String telefone;

    // Construtor da classe Cliente
    public Cliente(String nome, String cpf, LocalDate dataNascimento, String email, String numeroCartaoFidelidade,
            String telefone) {
        super(nome, cpf, dataNascimento);
        this.email = email;
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
        this.telefone = telefone;
    }

    // Getters
    public String getEmail() {
        return email;
    }

    public String getNumeroCartaoFidelidade() {
        return numeroCartaoFidelidade;
    }

    public String getTelefone() {
        return telefone;
    }
}
