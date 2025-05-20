package entities.enums;

// Enum que define os possíveis estados de um pedido
public enum OrderStatus {
  
  PENDING_PAYMENT, // Pagamento pendente
  PROCESSING,      // Em processamento
  SHIPPED,         // Enviado
  DELIVERED;       // Entregue
}
