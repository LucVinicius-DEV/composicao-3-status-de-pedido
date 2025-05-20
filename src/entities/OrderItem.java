package entities;

// Classe que representa um item de pedido (linha de pedido)
public class OrderItem {
  
  // Atributos
  private Integer quantity;   // Quantidade do produto
  private Double price;       // Preço unitário (cópia do preço do produto no momento da compra)
  
  // Relação de composição com Product
  private Product product;    // Produto associado ao item
  
  // Construtor padrão
  public OrderItem() {
  }
  
  // Construtor com parâmetros
  public OrderItem(Integer quantity, Double price, Product product) {
    this.quantity = quantity;
    this.price = price;
    this.product = product;
  }
  
  // Métodos getters e setters
  public Integer getQuantity() {
    return quantity;
  }
  
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
  
  public Double getPrice() {
    return price;
  }
  
  public void setPrice(Double price) {
    this.price = price;
  }
  
  public Product getProduct() {
    return product;
  }
  
  public void setProduct(Product product) {
    this.product = product;
  }
  
  // Método para calcular o subtotal do item (preço * quantidade)
  public Double subTotal() {
    return price * quantity;
  }
}
