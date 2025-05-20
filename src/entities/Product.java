package entities;

// Classe que representa um produto no sistema
public class Product {
  
  // Atributos básicos do produto
  private String name;      // Nome do produto
  private Double price;     // Preço unitário
  
  // Construtor padrão
  public Product() {
  }
  
  // Construtor com parâmetros
  public Product(String name, Double price) {
    this.name = name;
    this.price = price;
  }
  
  // Métodos getters e setters
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Double getPrice() {
    return price;
  }
  
  public void setPrice(Double price) {
    this.price = price;
  }
}
