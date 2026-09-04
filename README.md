# Café Decorator

Projeto Java que aplica o padrão Decorator para montar bebidas e adicionar complementos sem alterar as classes originais.

## Repositório

[Acesse o repositório no GitHub](https://github.com/luis-sandri/CafeDecorator)

## Objetivo

O sistema calcula descrições e preços de bebidas personalizadas com adicionais encadeados.

## Padrão utilizado

O padrão Decorator adiciona comportamentos a objetos existentes por meio de classes que os encapsulam.

## Estrutura

- `Bebida` define descrição e preço.
- As bebidas concretas implementam `Bebida`.
- `BebidaDecorator` mantém uma bebida-base.
- Os adicionais ampliam descrição e preço da bebida-base.
- `SistemaCafeteria` cria os pedidos e imprime os resumos.

## Diagrama de classes

```mermaid
classDiagram
    direction TB

    class Bebida {
        <<interface>>
        +getDescricao() String
        +getPreco() double
    }

    class BebidaDecorator {
        <<abstract>>
        #bebidaBase Bebida
        +BebidaDecorator(Bebida bebida)
    }

    class CafeExpresso {
        +getDescricao() String
        +getPreco() double
    }
    class CafeComLeite {
        +getDescricao() String
        +getPreco() double
    }
    class Cappuccino {
        +getDescricao() String
        +getPreco() double
    }
    class ChocolateQuente {
        +getDescricao() String
        +getPreco() double
    }

    class ComLeiteExtra {
        +ComLeiteExtra(Bebida bebida)
        +getDescricao() String
        +getPreco() double
    }
    class ComDoseExpresso {
        +ComDoseExpresso(Bebida bebida)
        +getDescricao() String
        +getPreco() double
    }
    class ComChocolateExtra {
        +ComChocolateExtra(Bebida bebida)
        +getDescricao() String
        +getPreco() double
    }
    class SistemaCafeteria {
        +main(String[] args) void
        -imprimirResumo(Bebida bebida) void
    }

    Bebida <|.. CafeExpresso
    Bebida <|.. CafeComLeite
    Bebida <|.. Cappuccino
    Bebida <|.. ChocolateQuente
    Bebida <|.. BebidaDecorator
    BebidaDecorator <|-- ComLeiteExtra
    BebidaDecorator <|-- ComDoseExpresso
    BebidaDecorator <|-- ComChocolateExtra
    BebidaDecorator o-- Bebida : encapsula
    SistemaCafeteria --> Bebida : cria pedidos
```

## Como executar

1. Abra a pasta `src` em uma IDE Java.
2. Execute a classe `SistemaCafeteria`.
3. Consulte o terminal para visualizar cada pedido e seu total.

## Exemplo de saída

![Saída do programa](assets/saida-execucao.png)

## Resultado esperado

O programa monta café expresso, café com leite e cappuccino usando combinações de adicionais.
