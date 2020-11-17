package it.unive.try_interfaces;

public class Auto implements Gareggia,Trasporta{
    private int velocità;
    private int passeggeri;

    public int getVelocità() {
        return velocità;
    }

    public void setVelocità(int velocità) {
        this.velocità = velocità;
    }

    public int getPasseggeri() {
        return passeggeri;
    }

    public void setPasseggeri(int passeggeri) {
        this.passeggeri = passeggeri;
    }

    public Auto(int velocità,int passeggeri){
        this.passeggeri=passeggeri;
        this.velocità=velocità;
    }

    public void guida(){
        System.out.println("La macchina trasporta "+this.passeggeri+" persone alla velocità di "+this.velocità);
    }

}
