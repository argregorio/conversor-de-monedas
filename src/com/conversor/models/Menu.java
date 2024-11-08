package com.conversor.models;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Country> initalCountryList = new ArrayList<>(List.of(
            new Country("ARS", "Peso argentino"),
            new Country("USD", "Dolar estadounidense"),
            new Country("BRL", "Real brasileño"),
            new Country("CLP", "Peso chileno")
    ));

    private List<Country> apiCountries = new ArrayList<>();
    private String menuItems = """
            1. Convertir moneda.
            2. Listado actual de monedas.
            3. Agregar una moneda.
            4. Eliminar una moneda.
            5. Ver historial de conversiones.
            7. Salir""";

    public List<Country> getInitalCountryList() {
        return initalCountryList;
    }

    public String getMenuItems() {
        return menuItems;
    }

    public void showCountries(List<Country> country) {
        System.out.println("-----Lista de monedas-----");
        for (int i = 0; i < country.size(); i++) {
            System.out.println( (i + 1) + "." + country.get(i));
        }
    }

    public void showUserHistory(List<CurrencyPairConversion> currencyPairConversions) {
        System.out.println("-----Historial de conversiones-----");
        for (int i = 0; i < currencyPairConversions.size(); i++) {
            CurrencyPairConversion currentCurrencyPair = currencyPairConversions.get(i);
            double amount = currentCurrencyPair.getAmount();
            double amountConverted = currentCurrencyPair.getAmountConverted();
            String baseCode = currentCurrencyPair.getBaseCode();
            String targetCode = currentCurrencyPair.getTargetCode();
            String date = currentCurrencyPair.getCreatedAt();
            System.out.printf("Conversion de: %,.2f '%s' a '%s' >>> Monto final = %,.2f '%s'\n", amount, baseCode, targetCode, amountConverted, targetCode);
        }
    }

    public void appFinalMessage() {
        System.out.println("Gracias por usar la app");
        System.out.println("Saliendo...");
    }

    public List<Country> setInitalCountryList(Country country) {
        this.initalCountryList.add(country);
        return this.getInitalCountryList();
    }

    public List<Country> removeCountryFormList(int index) {
        this.initalCountryList.remove(index);
        return this.getInitalCountryList();
    }

    public List<Country> getApiCountries() {
        return apiCountries;
    }

    public void setApiCountries(List<Country> apiCountries) {
        this.apiCountries = apiCountries;
    }
}
