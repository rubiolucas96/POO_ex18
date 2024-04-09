package model;

public abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocMax;
    private int qtdRodas;
    private Motor motor;
    
    public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, Motor motor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        this.motor = motor;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public String getCor() {
        return cor;
    }
    
    public float getVelocMax() {
        return velocMax;
    }
    
    public int getQtdRodas() {
        return qtdRodas;
    }
    
    public Motor getMotor() {
        return motor;
    }
    
    public abstract float calcVel(float velocMax);
}
