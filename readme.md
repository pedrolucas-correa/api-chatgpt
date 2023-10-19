# Projeto ChatGPT

Este projeto é uma implementação da API da OpenAI que permite enviar solicitações para o ChatGPT. Ele utiliza a biblioteca Java theokanning/openai-gpt3-java para se comunicar com a API e facilitar a interação com o ChatGPT.

## Requisitos

Antes de iniciar, certifique-se de que você tem os seguintes requisitos:

- [Java 17](https://openjdk.java.net/projects/jdk/17/)
- [Maven](https://maven.apache.org/)
- Uma chave de API válida da OpenAI

## Configuração

1. Clone o repositório do projeto:
   ```bash
   git clone https://github.com/seu-usuario/chatgpt.git
   cd chatgpt
   ```

2. Abra o arquivo `ChatGptApplication.java` e substitua `"sua-chave-de-api-aqui"` pela sua chave de API da OpenAI:
   ```java
   var service = new OpenAiService("sua-chave-de-api-aqui");
   ```

3. Execute o aplicativo Spring Boot:
   ```bash
   mvn spring-boot:run
   ```

## Uso

Este projeto demonstra como melhorar textos em Java usando a API GPT-3 da OpenAI. Você pode adaptar o código para criar endpoints e classes que facilitem o uso do projeto em suas próprias aplicações.

O exemplo existente no `ChatGptApplication.java` mostra como usar a API para aprimorar a gramática e a ortografia de uma frase. Você pode estender essa funcionalidade para atender às suas necessidades específicas.

## Próximos Passos

Aqui estão algumas ideias para estender este projeto:

1. **Endpoints REST**: Crie endpoints REST para expor a funcionalidade do projeto. Por exemplo, você pode criar um endpoint que aceita um texto e retorna o texto aprimorado.

2. **Classe de Utilitário**: Crie uma classe de utilitário que encapsule a lógica de chamada para a API GPT-3. Isso facilitará o uso em várias partes do seu aplicativo.

3. **Documentação**: Crie uma documentação detalhada para o seu projeto, explicando como usar os endpoints e classes que você criou.

