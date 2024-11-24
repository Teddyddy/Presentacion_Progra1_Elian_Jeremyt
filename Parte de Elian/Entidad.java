/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

/**
 *
 * @author elianguillen
 */
public class Entidad {
    
    private String nombre;
    private int lvl;
    private int hp;
    private double atk;
    private double def;
    private int dinero;
    private int exp;
    
    public Entidad (String nombre, int lvl, int hp, double atk, double def, int dinero, int exp){
        this.nombre = nombre;
        this.lvl = lvl;
        this.atk = atk;
        this.def = def;
        this.hp = hp;
        this.dinero = dinero;
        this.exp = exp;
    }
    
    public String Getnombre() {
        return nombre;
    }
    
    public int Getlvl() {
        return lvl;
    }
    
    public int Getexp() {
        return exp;
    }
    
    public int Getdinero() {
        return dinero;
    }
    
    public int Gethp() {
        return hp;
    }
    
    public double Getatk() {
        return atk;
    }
    
    public double Getdef() {
        return def;
    }
    
    public void Setnombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void Setlvl(int lvl) {
        this.lvl = lvl;
    }
    
    public void Setexp(int exp) {
        this.exp = exp;
    }
    
    public void Setdinero(int dinero) {
        this.dinero = dinero;
    }
    
    public void Sethp(int hp) {
        this.hp = hp;
    }
    
    public void Setatk(double atk) {
        this.atk = atk;
    }
    
    public void Setdef(double def) {
        this.def = def;
    }
    
    @Override
    public String toString() {
        return "Estadisticas del Jugador: {" +
                "nombre='" + nombre + '\'' +
                ", Nivel='" + lvl + '\'' +
                ", EXP='" + exp + '\'' +
                ", HP='" + hp + '\'' +
                ", Atk='" + atk + '\'' +
                ", def='" + def + '\'' +
                ", dinero='" + dinero + '\'' +
                '}';
    }
}
