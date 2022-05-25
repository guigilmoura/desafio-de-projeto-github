package JOO;

public class Vericulo {
    String cor;
    String modelo;
    int capacidadeTanque;

    Vericulo(){

    }

    Vericulo(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    String getCor() {
        return cor;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getModelo() {
        return modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque*valorCombustivel;
    }
}
