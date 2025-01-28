# Android Telemetry App

Este repositório contém a implementação de um MVP para coleta de dados de telemetria em dispositivos Android. O objetivo é testar o uso do celular do motorista como dispositivo de obtenção de informações, substituindo um equipamento dedicado. O sistema coleta dados de giroscópio, GPS e câmera, armazenando-os em um banco de dados local e enviando para um servidor backend.

## Funcionalidades

1. **Coleta de Dados**:

   - Dados de Giroscópio (x, y, z) com o timestamp.
   - Dados de GPS (latitude, longitude) com o timestamp.
   - Foto capturada pela câmera, incluindo timestamp.
   - Identificação única do dispositivo (MAC address).

2. **Armazenamento Local**:

   - Os dados coletados são armazenados em um banco de dados local usando Room.

3. **Envio para o Backend**:

   - Os dados são enviados a cada 10 segundos para os seguintes endpoints REST:
     - `POST /telemetry/gyroscope`
     - `POST /telemetry/gps`
     - `POST /telemetry/photo`

4. **Execução em Background**:

   - O aplicativo não possui interface com o usuário e roda em background.

## Estrutura do Projeto

### Diretórios Principais

- **`app/src/main/java/com/example/telemetryapp`**:
  Contém as classes principais, incluindo o serviço de coleta de dados.

- **`app/src/main/java/com/example/telemetryapp/room`**:
  Contém a implementação do banco de dados local usando Room (DAO, Entidade e Banco de Dados).

- **`app/src/main/res`**:
  Contém os recursos do projeto, como arquivos de configuração.

- **`app/src/main/AndroidManifest.xml`**:
  Configurações do aplicativo e permissões.

### Arquivos Importantes

- **`TelemetryService.kt`**:
  Classe principal que roda como um serviço em background. Ela é responsável por:

  - Iniciar a coleta de dados.
  - Agendar a execução a cada 10 segundos.

- **`AppDatabase.kt`**:
  Configuração do banco de dados local.

- **`TelemetryDao.kt`**:
  Interface DAO para inserir dados no banco de dados.

- **`Telemetry.kt`**:
  Definição da entidade de telemetria para armazenamento.

- **`AndroidManifest.xml`**:
  Declara as permissões necessárias para:

  - Acessar GPS.
  - Usar a câmera.
  - Acessar a internet.

## Tecnologias Utilizadas

- **Linguagem**: Kotlin
- **Banco de Dados**: Room (SQLite)
- **Execução em Background**: Android Service
- **Permissões**: Configuradas no `AndroidManifest.xml`
- **Requisições HTTP**: Retrofit (placeholder para futuras implementações)

## Como Rodar o Projeto

1. **Clone o Repositório**:

   ```bash
   git clone <URL-DO-REPOSITORIO>
   cd AndroidTelemetryApp
   ```

2. **Abra no Android Studio**:

   - Importar o projeto no Android Studio.

3. **Execute o App**:

   - Conecte um dispositivo Android ou use um emulador.
   - Certifique-se de que as permissões de localização e câmera estão habilitadas no dispositivo.

## Melhorias Futuras

1. Implementar o envio dos dados coletados para o backend usando Retrofit.
2. Realizar o crop das fotos capturadas para detectar e enviar apenas imagens contendo rostos.
3. Adicionar suporte para execução paralela das requisições HTTP.
4. Criar testes unitários abrangentes para todos os componentes.

## Contato

Gustavo Daniel[LinkedIn](https://www.linkedin.com/in/gustavodaniel)[Email](mailto\:gustavodaniel@example.com)

---

Se precisar de mais algum ajuste ou sugestão, é só avisar!
