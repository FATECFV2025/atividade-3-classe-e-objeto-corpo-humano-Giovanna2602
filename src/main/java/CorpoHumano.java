package main.java;

public class CorpoHumano {
    public float massa;
    private float densidade;
    private float volume;
    private float altura;
    private float peso;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public CorpoHumano(float massa, float volume)
    {
        this.massa = massa;
        this.volume = volume;
        densidade = massa / volume;
    }

    public float getMassa() {
        return massa;
    }

    public float getVolume() {
        return volume;
    }

    public float getDensidade() {
        return densidade;
    }

    public void setMassa(float massa) {
        this.massa = massa;
        densidade = massa / volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
        densidade = massa / volume;
    }

    public float CalcularIMC(){
        return peso/(altura*altura);
    }
}
