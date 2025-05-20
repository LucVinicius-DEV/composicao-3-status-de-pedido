package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

// Classe que representa um pedido (composição principal)
public class Order {
  
  // Formatador de data para exibição padronizada
  private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
  
  // Atributos básicos do pedido
  private Date moment;           // Data/hora do pedido
  private OrderStatus status;    // Status do pedido (usando enum)
  
  // Relações de composição
  private Client client;                     // Associação "tem-um" com Cliente
  private List<OrderItem> items = new ArrayList<>();  // Composição "tem-muitos" com OrderItem
  
  // Construtor padrão
  public Order() {
  }
  
  // Construtor com parâmetros (não inclui a lista de itens)
  public Order(Date moment, OrderStatus status, Client client) {
    this.moment = moment;
    this.status = status;
    this.client = client;
  }
  
  // Métodos getters e setters (exceto para items que tem métodos especiais)
  public Date getMoment() {
    return moment;
  }
  
  public void setMoment(Date moment) {
    this.moment = moment;
  }
  
  public OrderStatus getStatus() {
    return status;
  }
  
  public void setStatus(OrderStatus status) {
    this.status = status;
  }
  
  public Client getClient() {
    return client;
  }
  
  public void setClient(Client client) {
    this.client = client;
  }
  
  // Métodos para manipular a composição com OrderItem
  public void addItem(OrderItem item) {
    items.add(item);
  }
  
  public void removeItem(OrderItem item) {
    items.remove(item);
  }
  
  // Método para calcular o valor total do pedido
  public Double total() {
    double sum = 0.0;
    for (OrderItem item : items) {
      sum += item.subTotal();
    }
    return sum;
  }
  
  // Sobrescreve toString() para gerar um relatório completo do pedido
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Order moment: ");
    sb.append(sdf.format(moment) + "\n");
    sb.append("Order status: ");
    sb.append(status + "\n");
    sb.append("Client: ");
    sb.append(client + "\n");
    sb.append("Order items:\n");
    for (OrderItem item : items) {
      sb.append(item.getProduct().getName() + ", ");
      sb.append("$" + String.format("%.2f", item.getPrice()) + ", ");
      sb.append("Quantity: " + item.getQuantity() + ", ");
      sb.append("Subtotal: $" + String.format("%.2f", item.subTotal()) + "\n");
    }
    sb.append("Total price: $");
    sb.append(String.format("%.2f", total()));
    return sb.toString();
  }
}
