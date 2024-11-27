Conversor de Monedas
Este proyecto es un conversor de monedas que permite convertir entre varias divisas utilizando una API externa para obtener las tasas de cambio más recientes. El conversor es interactivo y fácil de usar, basado en la terminal.

Características
Convierte entre diversas monedas como MXN, USD, EUR, y más.
Utiliza la API de ExchangeRate-API para obtener tasas de cambio en tiempo real.
Soporta entradas personalizadas para monedas no predefinidas.
Interfaz de usuario amigable a través de la terminal.
Tecnologías
Java 17 (o superior)
API de ExchangeRate-API
JSON para manejar las respuestas de la API (utilizando la librería Gson)
Requisitos
Java 17 o superior.
Conexión a Internet para obtener las tasas de cambio desde la API.
Instalación
1. Clonar el repositorio
Primero, clona el repositorio en tu máquina local:
- git clone https://github.com/tu_usuario/conversor-de-monedas.git
- cd conversor-de-monedas

2. Instalar dependencias (si usas Maven)
- Si estás utilizando Maven para gestionar dependencias, asegúrate de tenerlo instalado en tu máquina. Si no lo tienes, puedes descargarlo desde aquí.

Asegúrate de que tu archivo pom.xml está correctamente configurado para incluir las dependencias necesarias. Si usas Maven, ejecuta:
- mvn clean install

3. Compilar y ejecutar
Si estás usando Maven:
- mvn exec:java -Dexec.mainClass="ui.Main"
  
Si no usas Maven, asegúrate de tener la librería gson-2.8.9.jar en tu carpeta lib, y compílalo usando javac y java:
- javac -cp lib/gson-2.8.9.jar src/**/*.java
- java -cp "lib/gson-2.8.9.jar:src" ui.Main

Uso
Al ejecutar el programa, se mostrará un menú interactivo en la terminal:

***********************
** Conversor de Monedas **
1) Convertir MXN a USD
2) Convertir MXN a EUR
3) Otras conversiones
4) Salir
***********************
Opciones del menú
- Convertir MXN a USD: Convierte pesos mexicanos a dólares estadounidenses.
- Convertir MXN a EUR: Convierte pesos mexicanos a euros.
- Otras conversiones: Permite ingresar cualquier código de moneda válido y convertir entre ellas.
- Salir: Finaliza el programa.
Para cada opción, el programa te pedirá ingresar la cantidad de dinero que deseas convertir, y te devolverá el resultado con la tasa de cambio actualizada.

API utilizada
- Este proyecto utiliza la API de ExchangeRate-API para obtener las tasas de cambio en tiempo real. Necesitarás una clave de API para que funcione.

Cómo obtener una clave de API
- Ve a ExchangeRate-API y regístrate.

Obtén tu clave de API (la encontrarás en tu panel de usuario).

Inserta tu clave de API en la clase ExchangeRateService.java en el siguiente fragmento de código:

private final String apiKey = "TU_API_KEY"; // Reemplaza con tu clave de API válida.

Licencia
Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para más detalles.
