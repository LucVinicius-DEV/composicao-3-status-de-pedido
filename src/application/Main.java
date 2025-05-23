package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {
  
  public static void main(String[] args) throws ParseException {
    
    // Configura localização para usar ponto como separador decimal
    Locale.setDefault(Locale.US);
    
    // Cria scanner para leitura de dados e formatador de data
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    // Leitura dos dados do cliente
    System.out.println("Enter client data:");
    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Email: ");
    String email = sc.next();
    System.out.print("Birth date (DD/MM/YYYY): ");
    Date birthDate = sdf.parse(sc.next());
    
    // Cria objeto Cliente com os dados lidos
    Client client = new Client(name, email, birthDate);
    
    // Leitura dos dados do pedido
    System.out.println("Enter order data:");
    System.out.print("Status: ");
    OrderStatus status = OrderStatus.valueOf(sc.next());
    
    // Cria objeto Order com data atual, status lido e cliente criado
    Order order = new Order(new Date(), status, client);
    
    // Leitura dos itens do pedido
    System.out.print("How many items to this order? ");
    int n = sc.nextInt();
    
    // Loop para ler cada item do pedido
    for (int i=1; i<=n; i++) {
      System.out.println("Enter #" + i + " item data:");
      System.out.print("Product name: ");
      sc.nextLine();
      String productName = sc.nextLine();
      System.out.print("Product price: ");
      double productPrice = sc.nextDouble();
      System.out.print("Quantity: ");
      int quantity = sc.nextInt();
      
      // Cria objetos Product e OrderItem
      Product product = new Product(productName, productPrice);
      OrderItem item = new OrderItem(quantity, productPrice, product);
      
      // Adiciona item ao pedido (composição)
      order.addItem(item);
    }
    
    // Exibe resumo do pedido usando toString() da classe Order
    System.out.println();
    System.out.println("ORDER SUMMARY:");
    System.out.println(order);
    
    sc.close();
  }
}
