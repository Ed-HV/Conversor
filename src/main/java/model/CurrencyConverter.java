package model;

import services.ExchangeRateService;
import java.util.Scanner;

public class CurrencyConverter {
    private String monedaBase;
    private String monedaObjetivo;
    private double cantidad;

    private final Scanner lectura = new Scanner(System.in);
    private final ExchangeRateService conversion;

    public CurrencyConverter(ExchangeRateService conversion) {
        this.conversion = conversion;
    }

    public void almacenarValores(String monedaBase, String monedaObjetivo) {
        this.monedaBase = monedaBase;
        this.monedaObjetivo = monedaObjetivo;

        System.out.println("Ingrese el valor que deseas convertir:");
        this.cantidad = Double.parseDouble(lectura.nextLine());
    }

    public void almacenarValoresPersonalizados() {
        System.out.println("Ingrese la moneda base (3 letras, ej: MXN):");
        this.monedaBase = lectura.next().toUpperCase();

        System.out.println("Ingrese la moneda objetivo (3 letras, ej: USD):");
        this.monedaObjetivo = lectura.next().toUpperCase();

        System.out.println("Ingrese la cantidad a convertir:");
        this.cantidad = lectura.nextDouble();
    }

    public String obtenerMensajeRespuesta() {
        return monedaBase + " " + cantidad + " equivale a " + monedaObjetivo + " " +
                conversion.Conversion(monedaBase, monedaObjetivo, cantidad);
    }
}
