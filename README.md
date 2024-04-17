# App de Pedido de Restaurante

## Descrição

Este projeto é um aplicativo de pedidos de restaurante que permite aos usuários visualizar um cardápio e fazer pedidos diretamente pela interface do usuário. Embora tenha sido feito progresso significativo no desenvolvimento do aplicativo, ainda há algumas funcionalidades importantes que precisam ser implementadas para atender completamente aos requisitos estabelecidos.

## Funcionalidades a serem implementadas

Entre as funcionalidades que ainda precisam ser implementadas estão os cálculos (soma e subtração) em concordância com as requisições do usuário.

## Arquivos Principais

### `activity_main.xml`

O arquivo `activity_main.xml` define a interface de usuário do aplicativo de pedidos de restaurante. Ele descreve a disposição e os elementos visuais que os usuários encontrarão ao interagir com o aplicativo.

- **ScrollView:** Permite a rolagem vertical para os usuários visualizarem todo o cardápio, mesmo em dispositivos com telas menores, garantindo uma experiência de usuário consistente e acessível.
- **LinearLayouts:** Agrupam os elementos de interface em seções verticais, fornecendo uma estrutura organizada para apresentar o cardápio em categorias distintas, como entradas, pratos principais, bebidas e sobremesas.
- **Seções de comida:** Cada LinearLayout representa uma categoria específica do cardápio, tornando mais fácil para os clientes identificarem e selecionarem os itens desejados, simplificando o processo de pedido.
- **CheckBoxes:** Permitem que os usuários selecionem os itens de menu desejados dentro de cada categoria, fornecendo uma maneira intuitiva e interativa de fazer pedidos diretamente da interface do usuário.
- **TextViews:** Exibem informações importantes sobre os itens do menu, como nome, preço e tempo de preparo, ajudando os clientes a tomarem decisões informadas ao fazerem seus pedidos.
- **EditText:** Permite que os clientes insiram preferências especiais ou solicitações adicionais relacionadas aos itens selecionados, personalizando suas escolhas de acordo com suas preferências individuais.
- **Botão de pedido:** Facilita aos usuários a finalização e o envio de seus pedidos para processamento pelo restaurante, concluindo a interação do cliente com o aplicativo de forma eficiente e conveniente.

### `colors.xml`

O arquivo `colors.xml` é uma parte essencial do projeto do aplicativo de pedidos de restaurante, fornecendo uma definição centralizada de cores que são usadas em toda a interface do usuário.

### `strings.xml`

O arquivo `strings.xml` desempenha um papel fundamental no projeto, cada string definida neste arquivo é atribuída a um identificador único e é utilizada em diferentes partes do aplicativo para exibir informações relevantes aos usuários.

Segue cada propósito das strings definidas neste arquivo:

- **app_name:** Define o nome do aplicativo, que é exibido em vários contextos, como a barra de título da janela do aplicativo e na lista de aplicativos do dispositivo.
- **text_Header:** Esta string define o título principal da tela do cardápio do restaurante.
- **editText_preferences:** Define o texto de orientação para o campo de entrada onde os usuários podem inserir suas preferências especiais em relação ao pedido.
- **button_Order:** Define o texto exibido no botão de realização do pedido, que os usuários podem clicar para finalizar seus pedidos e enviá-los para o restaurante.

As demais strings definidas neste arquivo são divididas em categorias de acordo com os diferentes tipos de itens do cardápio: Entradas, Pratos Principais, Bebidas e Sobremesas.

Cada string definida neste arquivo é essencial para garantir que as informações relevantes sobre os itens do cardápio sejam exibidas corretamente na interface do usuário, facilitando a seleção e finalização dos pedidos pelos usuários.

### `MainActivity.kt`

A `MainActivity` é a classe principal do aplicativo de pedidos de restaurante, responsável por gerenciar a interface do usuário e as interações do usuário com a aplicação.

Segue o propósito de cada parte do código:

- **class MainActivity : AppCompatActivity(), View.OnClickListener:** Declara a classe MainActivity, que herda funcionalidades da classe AppCompatActivity e implementa a interface View.OnClickListener para lidar com eventos de clique em elementos de UI.
- **onCreate:** Método que é chamado quando a atividade é criada. Ele prepara a interface do usuário, configura o comportamento do botão e define o que acontece quando ele é clicado. É o ponto de partida da atividade e onde a maioria das configurações iniciais é feita.
- **onClick:** Método que é chamado quando um elemento de UI é clicado. Ele verifica se o botão de pedido foi clicado e, se sim, chama o método realizarPedido() para processar o pedido.
- **realizarPedido():** Método que é chamado quando o botão de pedido é clicado. Ele verifica se pelo menos um item foi selecionado, exibe uma mensagem de erro se nenhum item foi selecionado e exibe uma mensagem de confirmação se o pedido for bem-sucedido.
- **findCheckboxes():** Método de extensão que encontra todos os CheckBoxes dentro de um ViewGroup. Ele é usado para percorrer a hierarquia de visualização e encontrar todos os elementos CheckBox dentro do contêiner de seleção de itens.

Este código da `MainActivity` é essencial para garantir o funcionamento adequado da interface do usuário e o processamento correto dos pedidos dos clientes no aplicativo.

## Instalação

Para executar o aplicativo, siga estas etapas:

1. Clone este repositório.
2. Abra o projeto no Android Studio.
3. Execute o aplicativo em um dispositivo Android ou em um emulador.

