package application;

import java.util.Scanner;

import model.entities.Client;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Client client;
        String nameClient;
        int cnpj;
        String contact;

        System.out.print("Nome do cliente: ");
        nameClient = scan.nextLine();
        System.out.println();

        System.out.print("CNPJ: ");
        cnpj = Integer.parseInt(scan.nextLine());
        System.out.println();

        System.out.print("Contato (telefone ou email): ");
        contact = scan.nextLine();

        if (contact.matches("[0-9]+")) {
            client = new Client(nameClient, cnpj, false, contact);
        } else {
            client = new Client(nameClient, cnpj, true, contact);
        }
        System.out.println();
    }
}
