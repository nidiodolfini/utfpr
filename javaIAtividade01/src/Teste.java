public class Teste {
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo();
        Veiculo v2 = new Veiculo();
        Veiculo v3 = new Veiculo();
        Veiculo v4 = new Veiculo();
        Veiculo v5 = new Veiculo();

        v1.setPlaca("brx-1235");
        v1.setMarca("Fiat");
        v1.setModelo("Uno");
        v1.setCor("Preto");
        v1.setVelocMax(130);
        v1.getMotor().setQtdPist(2);
        v1.getMotor().setPotencia(50);
        System.out.println("Placa: " + v1.getPlaca() + "\n" +
                "Marca: " + v1.getMarca() + "\n"+
                "Modelo: " + v1.getModelo()+ "\n" +
                "Cor: " + v1.getCor()+ "\n" +
                "Velocidade: " + v1.getVelocMax()+ "\n" +
                "Quantidade Pistão: " + v1.getMotor().getQtdPist()+ "\n" +
                "Potencia: " + v1.getMotor().getPotencia()+ "\n");


        v2.setPlaca("tfv-9512");
        v2.setMarca("GM");
        v2.setModelo("Opala");
        v2.setCor("Cobre");
        v2.setVelocMax(280);
        v2.getMotor().setQtdPist(6);
        v2.getMotor().setPotencia(171);
        System.out.println("Placa: " + v2.getPlaca() + "\n" +
                "Marca: " + v2.getMarca() + "\n"+
                "Modelo: " + v2.getModelo()+ "\n" +
                "Cor: " + v2.getCor()+ "\n" +
                "Velocidade: " + v2.getVelocMax()+ "\n" +
                "Quantidade Pistão: " + v2.getMotor().getQtdPist()+ "\n" +
                "Potencia: " + v2.getMotor().getPotencia()+ "\n");

        v3.setPlaca("gtr-4562");
        v3.setMarca("VW");
        v3.setModelo("Fusca");
        v3.setCor("Bege");
        v3.setVelocMax(120);
        v3.getMotor().setQtdPist(3);
        v3.getMotor().setPotencia(65);
        System.out.println("Placa: " + v3.getPlaca() + "\n" +
                "Marca: " + v3.getMarca() + "\n"+
                "Modelo: " + v3.getModelo()+ "\n" +
                "Cor: " + v3.getCor()+ "\n" +
                "Velocidade: " + v3.getVelocMax()+ "\n" +
                "Quantidade Pistão: " + v3.getMotor().getQtdPist()+ "\n" +
                "Potencia: " + v3.getMotor().getPotencia()+ "\n");


        v4.setPlaca("pio-7891");
        v4.setMarca("VW");
        v4.setModelo("Gol");
        v4.setCor("branco");
        v4.setVelocMax(130);
        v4.getMotor().setQtdPist(2);
        v4.getMotor().setPotencia(84);
        System.out.println("Placa: " + v4.getPlaca() + "\n" +
                "Marca: " + v4.getMarca() + "\n"+
                "Modelo: " + v4.getModelo()+ "\n" +
                "Cor: " + v4.getCor()+ "\n" +
                "Velocidade: " + v4.getVelocMax()+ "\n" +
                "Quantidade Pistão: " + v4.getMotor().getQtdPist()+ "\n" +
                "Potencia: " + v4.getMotor().getPotencia()+ "\n");

        v5.setPlaca("qaz-8844");
        v5.setMarca("VW");
        v5.setModelo("Kombi");
        v5.setCor("Amarela");
        v5.setVelocMax(120);
        v5.getMotor().setQtdPist(3);
        v5.getMotor().setPotencia(78);
        System.out.println("Placa: " + v5.getPlaca() + "\n" +
                "Marca: " + v5.getMarca() + "\n"+
                "Modelo: " + v5.getModelo()+ "\n" +
                "Cor: " + v5.getCor()+ "\n" +
                "Velocidade: " + v5.getVelocMax()+ "\n" +
                "Quantidade Pistão: " + v5.getMotor().getQtdPist()+ "\n" +
                "Potencia: " + v5.getMotor().getPotencia()+ "\n");

    }
}
