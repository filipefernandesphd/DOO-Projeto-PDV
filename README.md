## Projeto PDV

Sistema para gerenciamento de **Ponto de Venda (PDV)**.

## Estrutura do Projeto

O projeto contém a seguinte estrutura:

- `src`: pasta para manter os códigos-fonte
- `lib`: pasta para menter as dependências
- `bin`: arquivos de saída da compilação

## System Design

O sistema será projetado com base na arquitetura **Model-View-Controller (MVC)**, sendo:

- `Model`: representa as entidades do PDV e as regras de negócio
- `View`: representa a interação do usuário com o sistema
- `Controller`: recebe as ações da View e coordena as operações do sistema
- `Repository`: persistência dos dados (.txt)

## Requisitos Funcionais

### Produto

- O produto deve conter: `nome, descrição, preço e estoque`

## Javadoc

Execute o comando no terminal para gerar o Javadoc:
`javadoc -d doc -sourcepath src -subpackages br.com.pdv`

## Desenvolvido e Mantido por

[Filipe Fernandes, Ph.D.](http://filipefernandesphd.com)