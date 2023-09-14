package application;

import java.util.Scanner;

import model.entities.Client;
import model.entities.FieldInt;
import model.entities.FieldString;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Client client;
        String nameClient;
        int cnpj;
        String contact;
        String dataApresentacao;
        String produto;
        int propostaValor;
        String dataEnvioProposta;
        String dataEnvioContrato;
        String dataAssinaturaContrato;
        String estagioOperacao;

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

        client.createFieldString("Data da apresentação", "Apresentação", 2, null);
        client.createFieldString("Produto", "Criação da proposta", 2, null);
        client.createFieldInt("Valor da proposta", "Criação da proposta", 2, 0);
        client.createFieldString("Data do envio da proposta", "Envio de proposta", 2, null);
        client.createFieldString("Data do envio do contrato", "Contrato enviado", 2, null);
        client.createFieldString("Data da assinatura do contrato", "Contrato assinado", 2, null);
        client.createFieldString("Estágio da Operação", "Em operação assistida", 3, null);

        System.out.print("Qual a data da apresentacao? ");
        dataApresentacao = scan.nextLine();

        client.getFields().forEach(obj -> {
            if (obj.getName() == "Data da apresentação") {
                ((FieldString) obj).setContent(dataApresentacao);
            }
        });
        System.out.println();

        System.out.print("Qual o produto? ");
        produto = scan.nextLine();

        client.getFields().forEach(obj -> {
            if (obj.getName() == "Produto") {
                ((FieldString) obj).setContent(produto);
            }
        });
        System.out.println();

        System.out.print("Qual o valor da proposta? ");
        propostaValor = Integer.parseInt(scan.nextLine());

        client.getFields().forEach(obj -> {
            if (obj.getName() == "Valor da proposta") {
                ((FieldInt) obj).setContent(propostaValor);
            }
        });
        System.out.println();

        System.out.print("Qual a data do envio da proposta? ");
        dataEnvioProposta = scan.nextLine();

        client.getFields().forEach(obj -> {
            if (obj.getName() == "Data do envio da proposta") {
                ((FieldString) obj).setContent(dataEnvioProposta);
            }
        });
        System.out.println();

        System.out.print("Qual a data do envio do contrato? ");
        dataEnvioContrato = scan.nextLine();

        client.getFields().forEach(obj -> {
            if (obj.getName() == "Data do envio do contrato") {
                ((FieldString) obj).setContent(dataEnvioContrato);
            }
        });
        System.out.println();

        System.out.print("Qual a data da assinatura do contrato? ");
        dataAssinaturaContrato = scan.nextLine();

        client.getFields().forEach(obj -> {
            if (obj.getName() == "Data da assinatura do contrato") {
                ((FieldString) obj).setContent(dataAssinaturaContrato);
            }
        });
        System.out.println();

        System.out.print("Qual o estágio da Operação? ");
        estagioOperacao = scan.nextLine();

        client.getFields().forEach(obj -> {
            if (obj.getName() == "Estágio da Operação") {
                ((FieldString) obj).setContent(estagioOperacao);
            }
        });
        System.out.println();

        System.out.println(client.getFields());
    }
}
