package com.sda.weather.frontend;

import java.util.Scanner;

public class UserInterface {

    public void run() {
        System.out.println("Aplikacja jest uruchomiona\n");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Witaj w aplikacji pogodowej, co chcesz zrobić?");
            System.out.println("1. Dodać lokalizację do bazy danych");
            System.out.println("2. Wyświetlić wszystkie dostępne lokalizacje");
            System.out.println("3. Pobrać pogodę w wybranej lokalizacji");
            System.out.println("0. Zamknąć aplikacje");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    createEntry();
                    break;
                case 2:
                    getAllLocalizations();
                    break;
                case 3:
                    getEntry();
                    break;
                case 0:
                    return;
            }
            System.out.println();
        }
    }

    private void getAllLocalizations() {
        // GET: /entry do serwera
        // wyświetla lokalizacje
        //todo
    }

    private void createEntry() {
        // POST: /entry do serwera
        // dodanie lokalizacji
        //todo
    }

    private void getEntry() {
        // GET: /entry do serwera
        // pobranie rekordu
        //todo
    }

}
