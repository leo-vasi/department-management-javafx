# Store Deparment Management (JavaFX + JDBC)

Este projeto é uma aplicação desktop construída com **JavaFX** para a interface gráfica e **JDBC** para interação com o banco de dados. Foi desenvolvido com o objetivo de explorar a integração entre essas tecnologias, além de consolidar conhecimentos em design orientado a objetos.

## Funcionalidades

- **Gerenciamento de Vendedores (Seller):**
  - Cadastro, edição, listagem e remoção de vendedores.
  - Associação de vendedores a departamentos.
  - Validação de dados no formulário.

- **Gerenciamento de Departamentos (Department):**
  - Cadastro, edição, listagem e remoção de departamentos.

- **Navegação:**
  - Menu principal para acesso às telas de vendedores, departamentos e informações "Sobre".

## Estrutura do Projeto

### Pacote `entity`
- **`Department`**: Representa um departamento com os atributos `id` (Integer) e `name` (String).
- **`Seller`**: Representa um vendedor com os atributos:
  - `id` (Integer): Identificador único.
  - `name` (String): Nome do vendedor.
  - `email` (String): E-mail.
  - `birthDate` (Date): Data de nascimento.
  - `baseSalary` (Double): Salário base.
  - `department` (Department): Associação com um departamento.

### Pacote `db`
- **`DB`**: Gerencia a conexão com o banco de dados e oferece utilitários para fechar recursos como `Statement` e `ResultSet`.
- **`DbException`**: Trata exceções relacionadas ao banco de dados.
- **`DbIntegrityException`**: Trata violações de integridade referencial no banco.

### Pacote `exceptions`
- **`ValidationException`**: Permite gerenciar múltiplos erros de validação associados a campos específicos do formulário.

### Pacote `listeners`
- **`DataChangeListener`**: Interface que define o método `onDataChanged`, usado para reagir a mudanças nos dados.

### Pacote `util`
- **`Alerts`**: Facilita a exibição de alertas no JavaFX.
- **`Constraints`**: Define restrições para campos de texto.
- **`Utils`**: Contém métodos utilitários para manipulação de componentes JavaFX e formatação de dados.

### Controladores
- **`SellerFormController`**: Gerencia o formulário de vendedores, com funcionalidades como:
  - Validação e exibição de erros.
  - Salvar ou cancelar alterações.
  - Carregar departamentos no formulário.

- **`SellerListController`**: Gerencia a lista de vendedores e as ações de CRUD associadas.

- **`MainViewController`**: Controla o menu principal e a navegação entre telas.

### Serviços
- **`DepartmentService` e `SellerService`**: Realizam operações de CRUD para departamentos e vendedores, respectivamente.

## Requisitos

- **Java 17** ou superior.
- **Maven** como gerenciador de dependências.
- **Banco de Dados MySQL**.

## Configuração

1. Clone o repositório:
   ```bash
   git clone https://github.com/leo-vasi/department-management-javafx.git
   ```

2. Configure o arquivo `db.properties` com as credenciais do banco de dados:
   ```properties
   dburl=jdbc:mysql://localhost:3306/db_management
   dbuser=root
   dbpassword=
   ```

3. Execute a aplicação (recomendado: IntelliJ IDEA ou Eclipse).


## Tecnologias Utilizadas

- **JavaFX**: Interface gráfica.
- **JDBC**: Acesso ao banco de dados.
- **MySQL**: Banco de dados relacional.
- **Maven**: Gerenciador de dependências.


