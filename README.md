![Banner](https://github.com/LucVinicius-DEV/composicao-com-stringbuilder/blob/main/banner.png)

# 📦 Composição com Enum — Status de Pedido

Este projeto simula um sistema de **gestão de pedidos**, utilizando **composição de objetos** e o uso de `enum` para controlar os **estágios de processamento** de um pedido (como *Pendente*, *Processando*, *Enviado* e *Entregue*).

---

## 📚 Projeto disponível

- [`Client.java`](./src/entities/Client.java) — Representa o cliente com nome, e-mail e data de nascimento.
- [`OrderItem.java`](./src/entities/OrderItem.java) — Representa um item do pedido, com quantidade, preço e produto.
- [`Product.java`](./src/entities/Product.java) — Representa o produto com nome e preço.
- [`Order.java`](./src/entities/Order.java) — Classe principal que representa o pedido, data, status, cliente e itens.
- [`OrderStatus.java`](./src/entities/enums/OrderStatus.java) — Enum com os status possíveis do pedido.
- [`Main.java`](./src/application/Main.java) — Classe de execução que simula o processo de criação de um pedido completo.

---

## ⚙️ Tecnologias Utilizadas

- Java
- Git & GitHub
- Replit (IDE online)

---

## 🧩 Conceitos Aplicados

- Composição entre objetos (`Order`, `Client`, `OrderItem`, `Product`)
- Enumeração (`OrderStatus`) para estados do pedido
- Manipulação de datas (`SimpleDateFormat`)
- Programação Orientada a Objetos com encapsulamento e responsabilidade única

---

## ▶️ Como Executar

1. Clone o repositório ou acesse via Replit.
2. Abra o arquivo `Main.java`.
3. Execute e observe a simulação de um pedido com seus itens e status exibidos no console.

---

## ✨ Exemplo de Saída

```
Enter client data:
Name: Alex Green
Email: alex@gmail.com
Birth date (DD/MM/YYYY): 15/03/1985

Enter order data:
Status: PROCESSING

How many items to this order? 2

Enter #1 item data:
Product name: TV
Product price: 1000.00
Quantity: 1

Enter #2 item data:
Product name: Mouse
Product price: 40.00
Quantity: 2

ORDER SUMMARY:
Order moment: 20/05/2025 14:32:10
Order status: PROCESSING
Client: Alex Green (15/03/1985) - alex@gmail.com
Order items:
TV, $1000.00, Quantity: 1, Subtotal: $1000.00
Mouse, $40.00, Quantity: 2, Subtotal: $80.00
Total price: $1080.00
```

---

## 👨‍💻 Autor

Desenvolvido por Lucas Vinícius com apoio da Luna durante os estudos de composição e enumeração em Java.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Lucas%20Vinícius-blue?style=flat&logo=linkedin)](https://www.linkedin.com/in/lucas-vin%C3%ADcius-05b41a35b/)  
[![GitHub](https://img.shields.io/badge/GitHub-LucVinicius--DEV-black?style=flat&logo=github)](https://github.com/LucVinicius-DEV)

---

Se esse projeto te ajudou, deixe uma ⭐ no repositório e acompanhe minha evolução!
