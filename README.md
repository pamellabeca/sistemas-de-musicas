## Desafio MyMusics: Aplicando POO, Encapsulamento, Herança e Polimorfismo em Java

### Introdução

Este README detalhado documenta o desafio **MyMusics**, desenvolvido como parte do curso "**Java: Aplicando a Orientação a Objetos**" da Alura. O desafio visa aplicar os conceitos de **Programação Orientada a Objetos (POO)**, **Encapsulamento**, **Herança** e **Polimorfismo** em Java.

### Estrutura do Projeto

O projeto segue a estrutura padrão do IntelliJ para projetos Java. A estrutura de pastas é a seguinte:

```
src
├── br.com.alura.mymusics
│   ├── main
│   │   └── Main.java
│   └── models
│       ├── Audio.java
│       ├── Music.java
│       ├── MyFavorites.java
│       └── Podcast.java
└── pom.xml
```

### Descrição das Classes

#### `Audio`

A classe `Audio` é a classe base para músicas e podcasts. Ela encapsula as seguintes propriedades:

* `title`: Título do áudio (música ou podcast).
* `totalReproductions`: Número total de reproduções.
* `totalLikes`: Número total de curtidas.
* `classification`: Classificação do áudio (calculada de acordo com a implementação de cada subclasse).

A classe `Audio` também fornece os seguintes métodos:

* `like()`: Incrementa o número de curtidas do áudio.
* `reproduces()`: Incrementa o número de reproduções do áudio.
* `getTitle()`: Retorna o título do áudio.
* `setTitle(String title)`: Define o título do áudio.
* `getTotalReproductions()`: Retorna o número total de reproduções do áudio.
* `getTotalLikes()`: Retorna o número total de curtidas do áudio.
* `getClassification()`: Retorna a classificação do áudio (implementado nas subclasses).

#### `Music`

A classe `Music` é uma subclasse de `Audio` que representa uma música. Ela herda todas as propriedades e métodos da classe `Audio` e adiciona as seguintes propriedades:

* `album`: Álbum da música.
* `artist`: Artista da música.
* `gender`: Gênero musical da música.

A classe `Music` também sobrescreve o método `getClassification()` para calcular a classificação da música com base no número de reproduções:

* Se o número de reproduções for maior ou igual a 200, a classificação é 10.
* Caso contrário, a classificação é 8.

#### `MyFavorites`

A classe `MyFavorites` é responsável por gerenciar uma lista de músicas e podcasts favoritos. Ela fornece o seguinte método:

* `includes(Audio audio)`: Adiciona o áudio especificado à lista de favoritos, imprimindo uma mensagem de acordo com a classificação do áudio.

#### `Podcast`

A classe `Podcast` é uma subclasse de `Audio` que representa um podcast. Ela herda todas as propriedades e métodos da classe `Audio` e adiciona a seguinte propriedade:

* `host`: Apresentador do podcast.

A classe `Podcast` também sobrescreve o método `getClassification()` para calcular a classificação do podcast com base no número de curtidas:

* Se o número de curtidas for maior ou igual a 25, a classificação é 10.
* Caso contrário, a classificação é 8.

### Execução do Desafio

Para executar o desafio, siga os seguintes passos:

1. Importe o projeto no IntelliJ IDEA ou qualquer outra IDE de sua preferência.
2. Certifique-se de que o Java está instalado e configurado em seu ambiente de desenvolvimento.
3. Execute a classe `Main` no IntelliJ IDEA.

### Observações

* O código do projeto segue as melhores práticas de programação em Java, incluindo documentação de código e formatação adequada.
* O desafio foi desenvolvido com base nos conhecimentos adquiridos no curso "**Java: Aplicando a Orientação a Objetos**" da Alura.
* Este README foi escrito de forma detalhada e explicativa, com o objetivo de facilitar a compreensão do código e dos conceitos aplicados no desafio.

### Apêndice

#### Recursos Adicionais

* Java: [https://www.oracle.com/java/](https://www.oracle.com/java/)
* Alura: [https://www.alura.com.br/](https://www.alura.com.br/)

#### Autora

Este desafio foi desenvolvido por **Pamella Rebeca Bispo**.
