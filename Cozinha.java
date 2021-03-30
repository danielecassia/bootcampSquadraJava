import java.util.ArrayList;
import java.util.Arrays;

class Cozinha {

  private int numPratos;
  private String tipo;
  private int numFuncionarios;
  private int tempPreparo;
  private int horaAbertura;
  private int horaFechamento;
  private String pratoPrincipal;
  private final ArrayList<Ingrediente> ingredientes;
  private final ArrayList<Funcionario> funcionarios;

  public Cozinha(int numPratos, String tipo, int numCozinheiros, int tempPreparo, int horaAbertura, int horaFechamento,
      String pratoPrincipal) {

    this.numPratos = numPratos;
    this.tipo = tipo;
    this.numFuncionarios = numCozinheiros;
    this.tempPreparo = tempPreparo;
    this.horaAbertura = horaAbertura;
    this.horaFechamento = horaFechamento;
    this.pratoPrincipal = pratoPrincipal;
    ingredientes = new ArrayList<>();
    funcionarios = new ArrayList<>();
  }

  public void adicionarIngrediente(Ingrediente ingrediente) {
    ingredientes.add(ingrediente);
  }

  public void adicionarIngrediente(Ingrediente... ingredientes) {
    this.ingredientes.addAll(Arrays.asList(ingredientes));
  }

  public void adicionarFuncionario(Funcionario funcionario) {
    funcionarios.add(funcionario);
  }

  public void adicionarFuncionario(Funcionario... funcionarios) {
    this.funcionarios.addAll(Arrays.asList(funcionarios));
  }

  public int getnumPratos() {
    return numPratos;
  }

  public void setnumPratos(int numPratos) {
    this.numPratos = numPratos;
  }

  public String gettipo() {
    return tipo;
  }

  public void settipo(String tipo) {
    this.tipo = tipo;
  }

  public int getnumCozinheiros() {
    return numFuncionarios;
  }

  public void setnumCozinheiros(int numCozinheiros) {
    this.numFuncionarios = numCozinheiros;
  }

  public int gettempPreparo() {
    return tempPreparo;
  }

  public void settempPreparo(int tempPreparo) {
    this.tempPreparo = tempPreparo;
  }

  public int getHoraAbertura() {
    return horaAbertura;
  }

  public void setHoraAbertura(int horaAbertura) {
    this.horaAbertura = horaAbertura;
    validarHorarios();
  }

  public int getHoraFechamento() {
    return horaFechamento;
  }

  public void setHoraFechamento(int horaFechamento) {
    this.horaFechamento = horaFechamento;
    validarHorarios();
  }

  public String getPratoPrincipal() {
    return pratoPrincipal;
  }

  public void setPratoPrincipal(String pratoPrincipal) {
    this.pratoPrincipal = pratoPrincipal;
  }

  private void validarHorarios() {
    if (horaAbertura > 23)
      horaAbertura = 23;

    if (horaAbertura < 0)
      horaAbertura = 0;

    if (horaFechamento > 23)
      horaFechamento = 23;

    if (horaFechamento < 0)
      horaFechamento = 0;
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    String mensagem = "";
    mensagem += "---------------------------------------------- COZINHA " + tipo + " ----------------------------------------------\n";
    mensagem += "Número de pratos: " + numPratos + "\n";
    mensagem += "Número de funcionários: " + numFuncionarios + "\n";
    mensagem += "Prato principal: " + pratoPrincipal + "\n";
    mensagem += "Tempo médio de espera: " + tempPreparo + " min\n";
    mensagem += "Horário de abertura: " + horaAbertura + "h\n";
    mensagem += "Horário de fechamento: " + horaFechamento + "h\n";
    mensagem += "Prato principal: " + pratoPrincipal + "\n";
    mensagem += "Ingredientes:\n";
    stringBuilder.append(mensagem);

    stringBuilder.append("Ingredientes: \n");
    for (Ingrediente ingrediente : ingredientes) {
      mensagem = " - " + ingrediente.toString() + "\n";
      stringBuilder.append(mensagem);
    }

    stringBuilder.append("Funcionários: \n");

    for (Funcionario funcionario : funcionarios) {
      mensagem = " - " + funcionario.toString() + "\n";
      stringBuilder.append(mensagem);
    }

    return stringBuilder.toString();
  }

}