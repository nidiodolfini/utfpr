package br.edu.utfpr.atividadejava1utfpr;

public class Teste2 {
    private static Passeio passeio = new Passeio();
    private static Carga carga = new Carga();
    
    private static Passeio vetPasseio[] = new Passeio[2];
    private static Carga vetCarga[] = new Carga[2];
    
    private static Leitura leitura = new Leitura();

    public static void main(String[] args) {
        
        System.out.println("Sistema de Gestão de Veículos - Menu Inicial");
        
        boolean continua = true;
        int opcao = 0;
        
        while(continua){
            System.out.println("\n1. Cadastrar Veículo de Passeio");
            System.out.println("\n2. Cadastrar Veículo de Carga");
            System.out.println("\n3. Imprimir Todos os Veículos de Passeio");
            System.out.println("\n4. Imprimir Todos os Veículos de Carga");
            System.out.println("\n5. Imprimir Veículo de Passeio pela Placa");
            System.out.println("\n6. Imprimir Veículo de Carga pela Placa");
            System.out.println("\n7. Sair do Sistema");
    
            
            try{
                opcao = Integer.parseInt(leitura.entDados("\nEscolha um opção"));
            }catch(NumberFormatException nfe){
                System.out.println("O valor deve ser um número inteiro");
                leitura.entDados("");
            }
        }
        
        
        
        
    }
        
}

//	private static final List<Passeio> passeioList = new ArrayList<>();
//	private static final List<Carga> cargaList = new ArrayList<>();
//	private static Leitura leitura = new Leitura();
//
//	public static void main(String[] args) {
//
//		int opcao = 0;
//
//		do {
//			try {
//
//				System.out.println("Sistema de Gest�o de Ve�culos - Menu Inicial");
//				System.out.println("\n");
//				System.out.println("1 - Cadastrar Ve�culo de Passeio");
//				System.out.println("2 - Cadastrar Ve�culo de Carga");
//				System.out.println("3 - Imprimir Todos os Ve�culos de Passeio");
//				System.out.println("4 - Imprimir Todos os Ve�culos de Carga");
//				System.out.println("5 - Imprimir Ve�culo de Passeio pela Placa");
//				System.out.println("6 - Imprimir Ve�culo de Carga pela Placa");
//				System.out.println("7 - Sair do Sistema");
//
//				opcao = Integer.parseInt(leitura.entDados("\nSelecione uma op��o: "));
//
//				switch (opcao) {
//
//				case 1:
//					for (int i = 0; i < 5; i++) {
//
//					
//						if (passeioList.size() == 5) {
//							leitura.entDados("\nLimite maximo de 5 Ve�culos de Passeio atingido - Press <Enter>");
//							break;
//						} 
//						
//						System.out.println("===== Cadastrado Ve�culo de Passeio ======");
//						if (!cadastrarVeiculoPasseio()) {
//							leitura.entDados("\nPlaca J� cadastrada em um veiculo de Passeio - Press <Enter>");
//							break;
//						} else {
//							String sair = "";
//
//							while (!sair.equalsIgnoreCase("n") && !sair.equalsIgnoreCase("s")) {
//								sair = leitura.entDados("\nDeseja realizar um novo cadastro? (S)im/(N)�o>");
//							}
//
//							if (sair.equalsIgnoreCase("n"))
//								break;
//						}
//					}
//					break;
//				case 2:
//					for (int i = 0; i < 5; i++) {						
//
//						if (cargaList.size() == 5) {
//							leitura.entDados("\nLimite maximo de 5 Ve�culos de Carga atingido - Press <Enter>");
//							break;
//						}
//						
//						System.out.println("===== Cadastrado Ve�culo de Carga ======");
//						if (!cadastrarVeiculoCarga()) {
//							leitura.entDados("\nPlaca J� cadastrada em um veiculo de Carga - Press <Enter>");
//							break;
//						}
//						
//						String sair = "";
//
//						while (!sair.equalsIgnoreCase("n") && !sair.equalsIgnoreCase("s")) {
//							sair = leitura.entDados("\nDeseja realizar um novo cadastro? (S)im/(N)�o>");
//						}
//
//						if (sair.equalsIgnoreCase("n")) break;
//					}
//					break;
//				case 3:
//					System.out.println("\n");
//					System.out.println("Lista com todos os  Ve�culos de Passeio : ");
//					listarTodosVeiculosPasseio();
//					System.out.println("\n");
//					break;
//				case 4:
//					System.out.println("\n");
//					System.out.println("Lista com todos os  Ve�culos de Carga");
//					listarTodosVeiculosCarga();
//					System.out.println("\n");
//					break;
//				case 5:
//					System.out.println("\n===== Procurar veiculo de passeio pela placa =====");
//					procurarVeiculosPasseioPorPlaca(leitura.entDados("\nDigite a placa para Realizar a busca: "));
//					break;
//				case 6:
//					System.out.println("\n===== Procurar veiculo de Carga pela placa =====");
//					procurarVeiculosCargaPorPlaca(leitura.entDados("\nDigite a placa para Realizar a busca: "));
//					break;
//				case 7:
//					System.out.println("Fim");
//					break;
//				default:
//					System.out.println("Op��o n�o encontrada");
//					break;
//				}
//
//			} catch (Exception e) {
//				System.out.println("Op��o inv�lida, tente novamente - Press Enter");
//				leitura.entDados("");
//				System.out.println("\n");
//			}
//
//		} while (opcao != 7);
//
//	}
//
//	public static boolean cadastrarVeiculoPasseio() throws Exception {
//
//		Passeio newPasseio = new Passeio();
//
//		newPasseio.setModelo(leitura.entDados("\nModelo do Veiculo: "));
//		newPasseio.setMarca(leitura.entDados("\nMarca do Veiculo: "));
//		newPasseio.setCor(leitura.entDados("\nCor do Veiculo: "));
//		newPasseio.setPlaca(leitura.entDados("\nPlaca do Veiculo: "));
//		newPasseio.setVelocMax(Integer.parseInt(leitura.entDados("\nVelocidade Maxima do veiculo: ")));
//		newPasseio.setQtdRodas(Integer.parseInt(leitura.entDados("\nQtde de rodas do Veiculo: ")));
//		newPasseio.getMotor().setPotencia(Integer.parseInt(leitura.entDados("\nPotencia do veiculo: ")));
//		newPasseio.getMotor().setQtdPist(Integer.parseInt(leitura.entDados("\nQtde de pistao do veiculo: ")));
//		newPasseio.setQtdPassageiros(Integer.parseInt(leitura.entDados("\nQtde de passageiros do Veiculo: ")));
//
//		if (passeioList.stream().filter(i -> i.getPlaca().equalsIgnoreCase(newPasseio.getPlaca())).findAny()
//				.isPresent()) {
//			return false;
//		}
//
//		return passeioList.add(newPasseio);
//	}
//
//	public static boolean cadastrarVeiculoCarga() {
//
//		Carga newCarga = new Carga();
//
//		newCarga.setModelo(leitura.entDados("\nModelo do Veiculo: "));
//		newCarga.setMarca(leitura.entDados("\nMarca do Veiculo: "));
//		newCarga.setCor(leitura.entDados("\nCor do Veiculo: "));
//		newCarga.setPlaca(leitura.entDados("\nPlaca do Veiculo: "));
//		newCarga.setVelocMax(Integer.parseInt(leitura.entDados("\nVelocidade Maxima do veiculo: ")));
//		newCarga.setQtdRodas(Integer.parseInt(leitura.entDados("\nQtde de rodas do Veiculo: ")));
//		newCarga.getMotor().setPotencia(Integer.parseInt(leitura.entDados("\nPotencia do veiculo: ")));
//		newCarga.getMotor().setQtdPist(Integer.parseInt(leitura.entDados("\nQtde de pistao do veiculo: ")));
//		newCarga.setCargaMax(Integer.parseInt(leitura.entDados("\nCarga Maxima do Veiculo: ")));
//		newCarga.setTara(Integer.parseInt(leitura.entDados("\nTara do Veiculo: ")));
//
//		if (cargaList.stream().filter(i -> i.getPlaca().equalsIgnoreCase(newCarga.getPlaca())).findAny().isPresent()) {
//			return false;
//		}
//
//		return cargaList.add(newCarga);
//	}
//
//	public static void listarTodosVeiculosCarga() {
//
//		for (Carga carga : cargaList) {
//
//			System.out.println("\n===== Veiculo de Carga n�: " + (cargaList.indexOf(carga) + 1) + " ======");
//			System.out.println(carga.toString());
//			System.out.println("\nSoma de todos os valores de atributos num�ricos: " + carga.calcular()+"\n");
//                                carga.calcVel();
//		}
//	}
//
//	public static void listarTodosVeiculosPasseio() {
//
//		for (Passeio passeio : passeioList) {
//
//			System.out.println("\n===== Veiculo de Passeio n�: " + (passeioList.indexOf(passeio) + 1) + " ======");
//			System.out.println(passeio.toString());
//			System.out.println("\nSoma das quantidades de letras existentes em todos os atributos do tipo String: "
//					+ passeio.calcular()+"\n");
//                                passeio.calcVel();
//		}
//	}
//
//	public static void procurarVeiculosCargaPorPlaca(String placa) {
//
//		System.out.println("\n===== Placa Procurada na lista de Veiculos de Carga: " + placa + " ======");
//		
//		for (Carga carga : cargaList) {
//
//			if (carga.getPlaca().equals(placa)) {
//
//				System.out.println(carga.toString());
//				System.out.println("\nSoma de todos os valores de atributos num�ricos: " + carga.calcular()+"\n");
//                                carga.calcVel();
//			}
//		}
//	}
//
//	public static void procurarVeiculosPasseioPorPlaca(String placa) {
//		
//		System.out.println("\n===== Placa Procurada na lista de Veiculos de Passeio: " + placa + " ======");
//				
//		for (Passeio passeio : passeioList) {
//
//			if (passeio.getPlaca().equals(placa)) {
//
//				System.out.println("\n===== Veiculo de Passeio n�: " + passeioList.indexOf(passeio) + " ======");
//				System.out.println(passeio.toString());
//				System.out.println("\nSoma das quantidades de letras existentes em todos os atributos do tipo String: "
//						+ passeio.calcular()+"\n");
//                                passeio.calcVel();
//				
//			}
//
//		}
//	}
