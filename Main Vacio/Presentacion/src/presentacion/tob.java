/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

/**
 *
 * @author DELL
 */
public class tob {
    //Parte de Jeremyt Osorto;
    private double attkaadd;
    private double defadd;
    private int expadd;
    private String nombre;
    private int vida;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public tob(double attkaadd, double defadd, int expadd, String nombre, int vida) {
        this.attkaadd = attkaadd;
        this.defadd = defadd;
        this.expadd = expadd;
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public tob(double attkaadd, double defadd, int expadd, String nombre) {
        this.attkaadd = attkaadd;
        this.defadd = defadd;
        this.expadd = expadd;
        this.nombre = nombre;
    }

    public tob(double attkaadd, double defadd, int expadd) {
        this.attkaadd = attkaadd;
        this.defadd = defadd;
        this.expadd = expadd;
    }

    public double getAttkaadd() {
        return attkaadd;
    }

    public void setAttkaadd(double attkaadd) {
        this.attkaadd = attkaadd;
    }
    
    public double getDefadd() {
        return defadd;
    }

    public void setDefadd(double defadd) {
        this.defadd = defadd;
    }

    public int getExpadd() {
        return expadd;
    }

    public void setExpadd(int expadd) {
        this.expadd = expadd;
    }

    @Override
    public String toString() {
        return "Nombre= "+nombre+"\nMejora ataque=" + attkaadd + "\nMejora defensa=" + defadd + "\nExperiencia=" + expadd+"\nMejora Vida="+vida+"\n";
    }
    
    public static void compra(int opc, int opc1, Entidad jugador, tob[] espada, tob[] escudo, int precio){
        
        if(precio<=jugador.Getdinero()){
            switch (opc){
                case 1:
                    switch (opc1){
                        case 1:
                            jugador.Setatk(espada[0].getAttkaadd()+jugador.Getatk());
                            jugador.Setexp(espada[0].getExpadd()+jugador.Getexp());
                            jugador.Sethp(espada[0].getVida()+jugador.Gethp());
                            break;
                        case 2:
                            jugador.Setdef(escudo[0].getDefadd()+jugador.Getdef());
                            jugador.Setexp(escudo[0].getExpadd()+jugador.Getexp());
                            jugador.Sethp(escudo[0].getVida()+jugador.Gethp());
                            break;
                        default:
                            System.out.println("Ingrese un valor admitido");
                    }
                    System.out.println("Compra exitosa");
                    jugador.Setdinero(jugador.Getdinero()-precio);
                    break;
                case 2:
                    switch (opc1){
                        case 1:
                            jugador.Setatk(espada[1].getAttkaadd()+jugador.Getatk());
                            jugador.Setexp(espada[1].getExpadd()+jugador.Getexp());
                            jugador.Sethp(espada[1].getVida()+jugador.Gethp());
                            break;
                        case 2:
                            jugador.Setdef(escudo[1].getDefadd()+jugador.Getdef());
                            jugador.Setexp(escudo[1].getExpadd()+jugador.Getexp());
                            jugador.Sethp(escudo[1].getVida()+jugador.Gethp());
                            break;
                        default:
                            System.out.println("Ingrese un valor admitido");
                    }
                    System.out.println("Compra exitosa");
                    jugador.Setdinero(jugador.Getdinero()-precio);
                    break;
                case 3:
                    switch (opc1){
                        case 1:
                            jugador.Setatk(espada[2].getAttkaadd()+jugador.Getatk());
                            jugador.Setexp(espada[2].getExpadd()+jugador.Getexp());
                            jugador.Sethp(espada[2].getVida()+jugador.Gethp());
                            break;
                        case 2:
                            jugador.Setdef(escudo[2].getDefadd()+jugador.Getdef());
                            jugador.Setexp(escudo[2].getExpadd()+jugador.Getexp());
                            jugador.Sethp(escudo[2].getVida()+jugador.Gethp());
                            break;
                        default:
                            System.out.println("Ingrese un valor admitido");
                    }
                    System.out.println("Compra exitosa");
                    jugador.Setdinero(jugador.Getdinero()-precio);
                    break;
                default:
                    System.out.println("Ingrese un valor admitido");
                    break;
            }
        }
        else{
            System.out.println("No tiene el dinero suficiente");
        }
        
    }
    
    public static boolean batalla(int eleccion, boolean elegirpelea, int rand, Entidad[] enemigoFacil, Entidad[] enemigoMedio, Entidad[] enemigoDificil, Entidad jugador, int maxhp){
        int exp, health, dinero;
        double attk,deff;
        
        if (eleccion == 1) {
            attk=enemigoFacil[rand].Getatk();
            deff=enemigoFacil[rand].Getdef();
            exp=enemigoFacil[rand].Getexp();
            health=enemigoFacil[rand].Gethp();
            dinero=enemigoFacil[rand].Getdinero();
        }
        else if (eleccion == 2) {
            attk=enemigoMedio[rand].Getatk();
            deff=enemigoMedio[rand].Getdef();
            exp=enemigoMedio[rand].Getexp();
            health=enemigoMedio[rand].Gethp();
            dinero=enemigoMedio[rand].Getdinero();
        }
        else if (eleccion == 3) {
            attk=enemigoDificil[rand].Getatk();
            deff=enemigoDificil[rand].Getdef();
            exp=enemigoDificil[rand].Getexp();
            health=enemigoDificil[rand].Gethp();
            dinero=enemigoDificil[rand].Getdinero();
        }
        else {
            System.out.println("Error! Escoja otra vez.");
            elegirpelea=true;
            return elegirpelea;
        }
        
        double danoenemigo;
        double danousuario;
        int cont=1;
        do{
            System.out.println("Round: "+cont);
            danoenemigo=(jugador.Getatk()+deff/(jugador.Getatk()));
            danousuario=(attk+jugador.Getdef()/(attk));
            health=health-(int)danousuario;
            maxhp=((maxhp-(int)danoenemigo));
            System.out.println("Vida enemigo: "+health+"\nVida Usuario: "+maxhp);
            cont++;
        }
        while((health>0&&maxhp>0));
        
        if(maxhp>0){
            System.out.println("Has ganado");
            jugador.Setdinero(dinero+jugador.Getdinero());
            jugador.Setexp(dinero+jugador.Getexp());
        }
        else{
            System.out.println("Has perdido :(");
        }
        
        elegirpelea=false;
        return elegirpelea;
    }
    
    public static boolean pelea(Entidad dragon, Entidad jugador, int maxhp){
        boolean jueg;
        
        
        int cont=1;
        double danoenemigo, danousuario;
        
        int exp, health, dinero;
        double attk,deff;
        
        attk=dragon.Getatk();
        deff=dragon.Getdef();
        exp=dragon.Getexp();
        health=dragon.Gethp();
        dinero=dragon.Getdinero();
        
        
        do{
            System.out.println("Round: "+cont);
            danoenemigo=(jugador.Getatk()+deff/(jugador.Getatk()));
            danousuario=(attk+jugador.Getdef()/(attk));
            health=health-(int)danousuario;
            maxhp=((maxhp-(int)danoenemigo));
            System.out.println("Vida enemigo: "+health+"\nVida Usuario: "+maxhp);
            cont++;
        }
        while((health>0&&maxhp>0));
        
        
        if(maxhp>0){
            System.out.println("¡¡¡¡¡¡GRACIAS!!!!!! NOS HAS SALVADO DEL DRAGON >:D");
            jugador.Setdinero(dinero+jugador.Getdinero());
            jugador.Setexp(dinero+jugador.Getexp());
            jueg=false;
        }
        else{
            System.out.println("Has perdido :(");
            jueg=true;
        }
        return jueg;
    }
    
}
