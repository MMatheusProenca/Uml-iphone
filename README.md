# iPhone Simulação em Java

Este projeto simula algumas das funcionalidades principais do iPhone como: reprodutor musical, aparelho telefônico e navegador de internet.

## 📊 Diagrama de Classes

<img src="/assets/Captura de Tela 2023-10-08 às 00.38.41.png">

## 📂 Estrutura

O projeto é organizado em pacotes distintos para separar as responsabilidades:

- **com.empresa.iphone.reprodutor**: Contém a interface `ReprodutorMusical`.
- **com.empresa.iphone.telefone**: Contém a interface `AparelhoTelefonico`.
- **com.empresa.iphone.navegador**: Contém a interface `NavegadorInternet`.
- **com.empresa.iphone.modelo**: Contém a classe principal `Iphone` que implementa todas as interfaces mencionadas.
- **com.empresa.iphone.MainTest**: Classe de teste para experimentar as funcionalidades do iPhone.

## 🚀 Funcionalidades

### 🎵 Reprodutor Musical
- Tocar música
- Pausar música
- Selecionar uma música específica

### 📞 Aparelho Telefônico
- Fazer uma ligação
- Atender uma chamada
- Iniciar correio de voz

### 🌐 Navegador na Internet
- Exibir uma página web
- Adicionar uma nova aba
- Atualizar a página atual
