# Atividade JUnit (Testes Automatizados) 🧪

![Status](https://img.shields.io/badge/status-concluído-green)
![Tech](https://img.shields.io/badge/tech-Java%20Puro-orange)
![Test Framework](https://img.shields.io/badge/framework-JUnit%205-red)
[![Licença](https://img.shields.io/badge/licen%C3%A7a-MIT-blue)](./LICENSE)

> Uma suíte de testes automatizados unitários desenvolvida em Java para validar regras de negócio essenciais como cálculo de descontos, autenticação de usuários, verificações lógicas, médias escolares e conversões de temperatura.

---

## 📜 Sobre o Projeto

Este projeto consiste na resolução de uma atividade prática focada em **Garantia de Qualidade (QA)** e **Testes Unitários**. A aplicação foi construída utilizando **Java puro (sem Maven/Gradle)**, estruturando as dependências do **JUnit 5** diretamente no `classpath` do ambiente de desenvolvimento.

A arquitetura do projeto foi dividida rigidamente entre a camada de negócio (`dominio`) e a camada de validação técnica (`testes`), garantindo desacoplamento e um ambiente isolado para simulação de cenários corretos e incorretos.

---

## ✨ Funcionalidades & Cenários Testados

O projeto engloba a resolução de 5 desafios lógicos de negócio:

1. **Gestão de Produtos (`Produto`):**
   * Cálculo de desconto automático de 10% sobre o preço base.
   * Regra de frete grátis ativa exclusivamente para compras com valor estritamente superior a R$100.
2. **Sistema de Autenticação (`Login`):**
   * Validação restrita de credenciais administrativas (`usuario: "admin"` e `senha: "123"`).
   * Testes cobrindo acessos bem-sucedidos e falhas por usuário ou senha incorretos.
3. **Validador Numérico (`Verificador`):**
   * Verificação de paridade matemática (Números Pares e Ímpares).
   * Verificação de sinal numérico (Números Positivos e Negativos).
4. **Desempenho Acadêmico (`Aluno`):**
   * Cálculo aritmético da média de duas notas bimestrais.
   * Validação de status de aprovação baseado na média mínima estipulada em 7.0.
5. **Conversor Climático (`Temperatura`):**
   * Algoritmo de conversão térmica de graus Celsius para Fahrenheit.
   * Alerta visual e lógico para indicar temperaturas consideradas altas (acima de 30°C).

---

## 🚀 Tecnologias e Ferramentas

* **Java SE** (Linguagem de Programação principal).
* **JUnit 5 (Jupiter)** (Framework de testes unitários).
* **VS Code Java Extension Pack** (Suporte ao ambiente de desenvolvimento e execução gráfica).

---

## ⚙️ Como Executar e Rodar os Testes Localmente

Como este projeto foi construído no modo "No Build Tools", a biblioteca do JUnit está gerenciada localmente através da pasta `lib/`.

**Pré-requisitos:**
* [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/) instalado na versão 17 ou superior.
* Extensão **Extension Pack for Java** ativada no seu VS Code.

**Passos:**

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/jmtmds/atividade-junit.git
   ```

2. **Abra o projeto no VS Code:**
   ```bash
   code atividade-junit
   ```

3. **Vincule o arquivo `.jar` (Caso o VS Code peça):**
   * No menu lateral inferior esquerdo, expanda a aba **`JAVA PROJECTS`**.
   * Expanda a pasta **`Referenced Libraries`**.
   * Clique no ícone de **`+`** (sinal de mais), navegue até a pasta `lib/` do projeto, selecione o arquivo `junit-platform-console-standalone-1.10.2.jar` e confirme.

4. **Executando os Testes:**
   * Clique no ícone do **Tubo de Ensaio (Testing)** na barra lateral esquerda do seu VS Code.
   * Passe o mouse sobre o nome do projeto `AtividadeJUnit` e clique no botão de **Play (Seta)** para rodar todos os testes em lote.
   * Todos os testes devem retornar com sucesso indicando o check verde ($\checkmark$).

---

## 👨‍💻 Autor

**João Marcos Tavares**

* **LinkedIn:** [linkedin.com/in/jmtmds](https://www.linkedin.com/in/jmtmds)
* **Email:** [jm3tavares@gmail.com](mailto:jm3tavares@gmail.com)
* **GitHub:** [github.com/jmtmds](https://github.com/jmtmds)
