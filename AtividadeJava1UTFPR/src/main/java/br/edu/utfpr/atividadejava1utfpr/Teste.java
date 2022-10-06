package br.edu.utfpr.atividadejava1utfpr;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nidio dos Santos Dolfini at Especialização em Java - Java I - UTFPR
 */

public class Teste {
    private static Passeio passeio = new Passeio();
    private static Carga carga = new Carga();
    
    private static Passeio vecPasseio[] = new Passeio[2];
    private static Carga vecCarga[] = new Carga[2];
    
//    private static final List<Passeio> vecPasseio = new ArrayList<>();
//    private static final List<Carga> vecCarga = new ArrayList<>();
    private static Leitura leitura = new Leitura();

    public static void main(String[] args) {

        int opcao = 0;

        do {
            try {

                System.out.println("Sistema de Gestão de Veiculos - Menu Inicial");
                System.out.println("");
                System.out.println("1 - Cadastrar Veiculo de Passeio");
                System.out.println("2 - Cadastrar Veiculo de Carga");
                System.out.println("3 - Imprimir Todos os Veiculos de Passeio");
                System.out.println("4 - Imprimir Todos os Veiculos de Carga");
                System.out.println("5 - Imprimir Veiculo de Passeio pela Placa");
                System.out.println("6 - Imprimir Veiculo de Carga pela Placa");
                System.out.println("7 - Sair do Sistema");

                opcao = Integer.parseInt(leitura.entDados("\nSelecione uma opção: "));

                switch (opcao) {

                    case 1:
                        for (int i = 0; i < 5; i++) {

                            if (vecPasseio.size() == 5) {
                                leitura.entDados("\nLimite maximo de 5 Veiculos de Passeio atingido - Press <Enter>");
                                break;
                            }

                            System.out.println("Cadastrado Veiculo de Passeio");
                            if (!cadastrarVeiculoPasseio()) {
                                leitura.entDados("\nPlaca Já cadastrada em um veiculo de Passeio - Press <Enter>");
                                break;
                            } else {
                                String sair = "";

                                while (!sair.equalsIgnoreCase("n") && !sair.equalsIgnoreCase("s")) {
                                    sair = leitura.entDados("\nDeseja realizar um novo cadastro? (S)im/(N)�o>");
                                }

                                if (sair.equalsIgnoreCase("n")) {
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        for (int i = 0; i < 5; i++) {

                            if (vecCarga.size() == 5) {
                                leitura.entDados("\nLimite maximo de 5 Veiculos de Carga atingido - Press <Enter>");
                                break;
                            }

                            System.out.println("Cadastrado Veiculo de Carga");
                            if (!cadastrarVeiculoCarga()) {
                                leitura.entDados("\nPlaca já cadastrada - Press <Enter>");
                                break;
                            }

                            String sair = "";

                            while (!sair.equalsIgnoreCase("n") && !sair.equalsIgnoreCase("s")) {
                                sair = leitura.entDados("\nDeseja realizar um novo cadastro? (S)im/(N)ão>");
                            }

                            if (sair.equalsIgnoreCase("n")) {
                                break;
                            }
                        }
                        break;
                    case 3:
                        System.out.println("\n");
                        System.out.println("Lista com todos os  Veiculos de Passeio : ");
                        listarTodosVeiculosPasseio();
                        System.out.println("\n");
                        break;
                    case 4:
                        System.out.println("\n");
                        System.out.println("Lista com todos os  Veículos de Carga");
                        listarTodosVeiculosCarga();
                        System.out.println("\n");
                        break;
                    case 5:
                        System.out.println("\nProcurar veiculo de passeio pela placa");
                        procurarVeiculosPasseioPorPlaca(leitura.entDados("\nDigite a placa: "));
                        break;
                    case 6:
                        System.out.println("\n Procurar veiculo de Carga pela placa");
                        procurarVeiculosCargaPorPlaca(leitura.entDados("\nDigite a placa: "));
                        break;
                    case 7:
                        System.out.println("Fim");
                        break;
                    default:
                        System.out.println("Opção não encontrada");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Opçãoo inválida - Press Enter");
                leitura.entDados("");
                System.out.println("\n");
            }

        } while (opcao != 7);

    }

    public static boolean cadastrarVeiculoPasseio() throws Exception {

        Passeio newPasseio = new Passeio();

        newPasseio.setModelo(leitura.entDados("Modelo do Veiculo: "));
        newPasseio.setMarca(leitura.entDados("Marca do Veiculo: "));
        newPasseio.setCor(leitura.entDados("Cor do Veiculo: "));
        newPasseio.setPlaca(leitura.entDados("Placa do Veiculo: "));
        newPasseio.setVelocMax(Integer.parseInt(leitura.entDados("Velocidade Maxima do veiculo: ")));
        newPasseio.setQtdRodas(Integer.parseInt(leitura.entDados("Quantidade de rodas do Veiculo: ")));
        newPasseio.getMotor().setPotencia(Integer.parseInt(leitura.entDados("Potencia do veiculo: ")));
        newPasseio.getMotor().setQtdPist(Integer.parseInt(leitura.entDados("Quantidade de pistao do veiculo: ")));
        newPasseio.setQtdPassageiros(Integer.parseInt(leitura.entDados("Quantidade de passageiros do Veiculo: ")));

        if (vecPasseio.stream().filter(i -> i.getPlaca().equalsIgnoreCase(newPasseio.getPlaca())).findAny()
                .isPresent()) {
            return false;
        }

        return vecPasseio.add(newPasseio);
    }

    public static boolean cadastrarVeiculoCarga() {

        Carga newCarga = new Carga();

        newCarga.setModelo(leitura.entDados("Modelo do Veiculo: "));
        newCarga.setMarca(leitura.entDados("Marca do Veiculo: "));
        newCarga.setCor(leitura.entDados("Cor do Veiculo: "));
        newCarga.setPlaca(leitura.entDados("Placa do Veiculo: "));
        newCarga.setVelocMax(Integer.parseInt(leitura.entDados("Velocidade Maxima do veiculo: ")));
        newCarga.setQtdRodas(Integer.parseInt(leitura.entDados("Quantidade de rodas do Veiculo: ")));
        newCarga.getMotor().setPotencia(Integer.parseInt(leitura.entDados("Potencia do veiculo: ")));
        newCarga.getMotor().setQtdPist(Integer.parseInt(leitura.entDados("Quantidade de pistao do veiculo: ")));
        newCarga.setCargaMax(Integer.parseInt(leitura.entDados("Carga Maxima do Veiculo: ")));
        newCarga.setTara(Integer.parseInt(leitura.entDados("Tara do Veiculo: ")));

        if (vecCarga.stream().filter(i -> i.getPlaca().equalsIgnoreCase(newCarga.getPlaca())).findAny().isPresent()) {
            return false;
        }
        return vecCarga.add(newCarga);
    }

    public static void listarTodosVeiculosCarga() {
        for (Carga carga : vecCarga) {
            System.out.println("Veiculo de Carga né: " + (vecCarga.indexOf(carga) + 1));
            System.out.println(carga.toString());
            System.out.println("Soma de todos números inteiros: " + carga.calcular());
            carga.calcVel();
        }
    }

    public static void listarTodosVeiculosPasseio() {
        for (Passeio passeio : vecPasseio) {
            System.out.println("Veiculo de Passeio nº: " + (vecPasseio.indexOf(passeio) + 1));
            System.out.println(passeio.toString());
            System.out.println("Soma das quantidades de letras:" + passeio.calcular());
            passeio.calcVel();
        }
    }

    public static void procurarVeiculosCargaPorPlaca(String placa) {
        System.out.println("Placa Procurada na lista de Veiculos de Carga: " + placa);
        for (Carga carga : vecCarga) {
            if (carga.getPlaca().equals(placa)) {
                System.out.println(carga.toString());
                System.out.println("Soma de todos números inteiros: " + carga.calcular());
                carga.calcVel();
            }
        }
    }

    public static void procurarVeiculosPasseioPorPlaca(String placa) {
        System.out.println("Placa Procurada na lista de Veiculos de Passeio: " + placa);
        for (Passeio passeio : vecPasseio) {
            if (passeio.getPlaca().equals(placa)) {
                System.out.println("Veiculo de Passeio nº: " + vecPasseio.indexOf(passeio));
                System.out.println(passeio.toString());
                System.out.println("Soma das quantidades de letras: " + passeio.calcular());
                passeio.calcVel();
            }

        }
    }
}
