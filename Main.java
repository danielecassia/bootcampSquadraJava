import java.time.LocalDate;

class Main {
  public static void main(String[] args) {

    System.out.println("... INICIANDO OS TRABALHOS DOS RESTAURANTES ...");
    System.out.println();


    // intancia da classe Cozinha - MINEIRA
    Cozinha cozinhaMineira = new Cozinha(10, "MINEIRA", 4, 50, 14, 20, "Feijoada");

    // adicionando os ingredientes - MINEIRA
    var ingrediente = new Ingrediente("Feijão", LocalDate.of(2024, 06, 20));
    cozinhaMineira.adicionarIngrediente(ingrediente);
    
    ingrediente = new Ingrediente("Farinha", LocalDate.of(2024, 06, 20));
    cozinhaMineira.adicionarIngrediente(ingrediente);

    ingrediente = new Ingrediente("Arroz", LocalDate.of(2024, 06, 20));
    cozinhaMineira.adicionarIngrediente(ingrediente);

    ingrediente = new Ingrediente("Carne de porco", LocalDate.of(2021, 4, 05));
    cozinhaMineira.adicionarIngrediente(ingrediente);

    ingrediente = new Ingrediente("Linguiça", LocalDate.of(2021, 4, 05));
    cozinhaMineira.adicionarIngrediente(ingrediente);

    // adicionando os funcionśrios - MINEIRA
    var funcionario = new Funcionario("Gustavo Ferreira", Funcionario.Funcao.Garcon);
    cozinhaMineira.adicionarFuncionario(funcionario);

    funcionario = new Funcionario("Edna Luz", Funcionario.Funcao.Cozinheiro);
    cozinhaMineira.adicionarFuncionario(funcionario);

    funcionario = new Funcionario("Alexsandro", Funcionario.Funcao.Recepsonista);
    cozinhaMineira.adicionarFuncionario(funcionario);

    funcionario = new Funcionario("Eni Souza", Funcionario.Funcao.Limpeza);
    cozinhaMineira.adicionarFuncionario(funcionario);

    // imprime os dados da classe Cozinha - MINEIRA
    System.out.println(cozinhaMineira);
    System.out.println();


    // intancia da classe Cozinha - CHINESA
    Cozinha cozinhaChinesa = new Cozinha(10, "CHINESA", 3, 50, 10, 21, "Yakissoba");

    // adicionando os ingredientes - CHINESA
    ingrediente = new Ingrediente("Champignon", LocalDate.of(2021, 12, 20));
    cozinhaChinesa.adicionarIngrediente(ingrediente);

    ingrediente = new Ingrediente("Brócolis", LocalDate.of(2021, 4, 05));
    cozinhaChinesa.adicionarIngrediente(ingrediente);

    ingrediente = new Ingrediente("Macarrão", LocalDate.of(2021, 12, 20));
    cozinhaChinesa.adicionarIngrediente(ingrediente);

    ingrediente = new Ingrediente("Carne", LocalDate.of(2021, 4, 05));
    cozinhaChinesa.adicionarIngrediente(ingrediente);

    // adicionando os funcionários - CHINESA
    funcionario = new Funcionario("Djalma Santos", Funcionario.Funcao.Cozinheiro);
    cozinhaChinesa.adicionarFuncionario(funcionario);

    funcionario = new Funcionario("Lucas Chaves", Funcionario.Funcao.Garcon);
    cozinhaChinesa.adicionarFuncionario(funcionario);

    funcionario = new Funcionario("Ana Claudia", Funcionario.Funcao.Recepsonista);
    cozinhaChinesa.adicionarFuncionario(funcionario);

    // imprime os dados da classe Cozinha - CHINESA
    System.out.println(cozinhaChinesa);
    System.out.println();



    // intancia da classe Cozinha - ITALIANA
    Cozinha cozinhaItaliana = new Cozinha(10, "ITALIANA", 2, 50, 13, 22, "Macarronada");

    // adicionando os ingredientes - ITALIANA
    ingrediente = new Ingrediente("Molho", LocalDate.of(2021, 12, 20));
    cozinhaItaliana.adicionarIngrediente(ingrediente);

    ingrediente = new Ingrediente("Macarrão", LocalDate.of(2021, 12, 20));
    cozinhaItaliana.adicionarIngrediente(ingrediente);

    ingrediente = new Ingrediente("Carne", LocalDate.of(2021, 4, 05));
    cozinhaItaliana.adicionarIngrediente(ingrediente);

    // adicionando os funcionários - ITALIANA
    funcionario = new Funcionario("Ana Maria Braga", Funcionario.Funcao.Cozinheiro);
    cozinhaItaliana.adicionarFuncionario(funcionario);

    funcionario = new Funcionario("Louro", Funcionario.Funcao.Recepsonista);
    cozinhaItaliana.adicionarFuncionario(funcionario);
    
    // imprime os dados da classe Cozinha - ITALIANA
    System.out.println(cozinhaItaliana);
    System.out.println();
  }
}