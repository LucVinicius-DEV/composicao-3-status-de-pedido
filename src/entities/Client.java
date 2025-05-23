package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

// Classe que representa um cliente no sistema
public class Client {
  
  // Formatador de data estático para padronizar exibição de datas
  private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  
  // Atributos básicos do cliente
  private String name;      // Nome do cliente
  private String email;     // Email do cliente
  private Date birthDate;   // Data de nascimento
  
  // construtor padrao
  public Client() {
  }
  
  // Construtor com parâmetros
  public Client(String name, String email, Date birthDate) {
    this.name = name;
    this.email = email;
    this.birthDate = birthDate;
  }
  
  // Métodos getters e setters
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getEmail() {
    return email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public Date getBirthDate() {
    return birthDate;
  }
  
  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }
  
  // Sobrescreve toString() para exibir dados do cliente formatados
  @Override
  public String toString() {
    return name + " (" + sdf.format(birthDate) + ") - " + email;
  }
}
