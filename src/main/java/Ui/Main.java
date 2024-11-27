package Ui;

import model.CurrencyConverter;
import services.ExchangeRateService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExchangeRateService conversion = new ExchangeRateService();
        CurrencyConverter monedas = new CurrencyConverter(conversion);

        String menu ="""
                ***********************
                ** Conversor de Monedas **
                1) Convertir MXN a USD
                2) Convertir MXN a EUR
                3) Otras conversiones
                4) Salir
                ***********************
                """;

        int opcion;
        do {
            System.out.println(menu);
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    monedas.almacenarValores("MXN", "USD");
                    System.out.println(monedas.obtenerMensajeRespuesta());
                }
                case 2 -> {
                    monedas.almacenarValores("MXN", "EUR");
                    System.out.println(monedas.obtenerMensajeRespuesta());
                }
                case 3 -> {
                    monedas.almacenarValoresPersonalizados();
                    System.out.println(monedas.obtenerMensajeRespuesta());
                }
                case 4 -> System.out.println("Gracias por usar el conversor de monedas.");
                default -> System.out.println("Opción no válida, intente nuevamente.");
            }
        } while (opcion != 4);
    }
}
