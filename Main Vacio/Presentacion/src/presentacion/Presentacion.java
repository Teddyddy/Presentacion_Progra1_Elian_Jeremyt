/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presentacion;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Elian y Jeremyt
 */
public class Presentacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Atributos
        Scanner scan = new Scanner (System.in);
        String nombre;
        int lvl;
        int hp;
        double atk;
        double def;
        int dinero;
        int exp;
        //Enemigos faciles
        
        nombre = "Slime";
        lvl = 1;
        hp = 20;
        atk = 7;
        def = 3;
        dinero = 50;
        exp = 25;
        Entidad slime = new Entidad(nombre, lvl, hp, atk, def, dinero, exp);
        
        nombre = "Lobo";
        lvl = 2;
        hp = 25;
        atk = 12;
        def = 6;
        dinero = 80;
        exp = 35;
        Entidad lobo = new Entidad(nombre, lvl, hp ,atk, def, dinero, exp);
        
        //Enemigos intermedios
        
        nombre = "Gnoll";
        lvl = 5;
        hp = 40;
        atk = 23;
        def = 15;
        dinero = 160;
        exp = 45;
        Entidad gnoll = new Entidad(nombre, lvl, hp, atk, def, dinero, exp);
        
        nombre = "Mercenario";
        lvl = 7;
        hp = 50;
        atk = 27;
        def = 20;
        dinero = 200;
        exp = 60;
        Entidad merc = new Entidad(nombre, lvl, hp, atk, def, dinero, exp);
        
        //Enemigos dificiles
        
        nombre = "Ogro";
        lvl = 12;
        hp = 75;
        atk = 35;
        def = 28;
        dinero = 350;
        exp = 85;
        Entidad ogro = new Entidad(nombre, lvl, hp, atk, def, dinero, exp);
        
        nombre = "Lich";
        lvl = 15;
        hp = 100;
        atk = 40;
        def = 32;
        dinero = 500;
        exp = 100;
        Entidad lich = new Entidad(nombre, lvl, hp, atk, def, dinero, exp);
        
        //Jefe final
        
        nombre = "Dragon";
        lvl = 30;
        hp = 300;
        atk = 80;
        def = 60;
        dinero = 1000000;
        exp = 9999999;
        Entidad dragon = new Entidad(nombre, lvl, hp, atk, def, dinero, exp);
        //contador para subir de nivel
        int lvlup = 100;
        
        // Usuario define su personaje
        System.out.println("Bienvenido(a)! has sido seleccionado por el rey para cazar al terrorifico dragon");
        System.out.println("que ha atormentado al reino por años, hoy es el dia en el que empiezas to gran odisea!");
        System.out.print("Porfavor, Ingresa to nombre: ");
        nombre = scan.next();
        lvl = 1;
        hp = 30;
        atk = 5;
        def = 5;
        dinero = 50;
        exp = 0;
        Entidad jugador = new Entidad (nombre, lvl, hp, atk, def, dinero, exp);
        //valor de hp actuales
        int maxhp = hp;
        boolean juego = true;
        do {
            maxhp = maxhp;
            exp = jugador.Getexp();
            if (maxhp <= 0) {
                juego = false;
                break;
            }
            if (exp >= lvlup) {
                lvl = jugador.Getlvl();
                lvl++;
                jugador.Setlvl(lvl);
                System.out.println("Felicidades! has subido al nivel " + lvl + "!!!");
                exp = exp - lvlup;
                jugador.Setexp(exp);
                lvlup = lvlup + (lvl * 5);
                System.out.println("Escoja un atributo a incrementar!:");
                System.out.println("1) Hp + 10");
                System.out.println("2) Atk + 3");
                System.out.println("3) Def + 3");
                boolean lvlmenu = true;
                do {
                    int lvlatributo = scan.nextInt();
                    if (lvlatributo == 1) {
                        hp = jugador.Gethp();
                        hp = hp + 10;
                        jugador.Sethp(hp);
                        lvlmenu = false;
                        System.out.println("Los Hit Points han incrementado por 10!");
                    }
                    else if (lvlatributo == 2) {
                        atk = jugador.Getatk();
                        atk = atk + 3;
                        jugador.Setatk(atk);
                        lvlmenu = false;
                        System.out.println("El Ataque ha incrementado por 3!");
                    }
                    else if (lvlatributo == 3) {
                        def = jugador.Getatk();
                        def = def + 3;
                        jugador.Setdef(def);
                        lvlmenu = false;
                        System.out.println("La Defensa ha incrementado por 3!");
                    }
                    else {
                        System.out.println("Error! porfavor ingrese cual atributo desea incrementar otra vez.");
                    }
                } while (lvlmenu == true);
                hp = jugador.Gethp();
                maxhp = hp;
                System.out.println("Tambien se han restaurado los Hit Points al maximo!");
            }
            System.out.println("Que deseas hacer ahora Aventurero(a)?");
            System.out.println("1) Ver estadisticas del Jugador");
            System.out.println("2) Ir a batalla!");
            System.out.println("3) Descansar por la fogata... (Restaurar HP)");
            System.out.println("4) Visitar un vendedor ambulante!");
            System.out.println("5) Luchar contra el Dragon!!!");
            System.out.println("6) Rendirme... (Terminar el Juego)");
            int menu = scan.nextInt();
            switch (menu) {
                case 1:
                    System.out.println(jugador.toString());
                    hp = jugador.Gethp();
                    System.out.println("Hit points actuales: "+ maxhp + "/" + hp);
                    exp = jugador.Getexp();
                    System.out.println("puntos de experiencia para el siguiente nivel: "+ exp + "/" + lvlup);
                    break;
                    
                case 2:
                    System.out.println("Que tipo de enemigo deseas pelear?");
                    System.out.println("1) Enemigo facil");
                    System.out.println("2) Enemigo intermedio");
                    System.out.println("3) Enemigo dificil");
                    boolean elegirpelea = true;
                    do {
                        int eleccion = scan.nextInt();
                        if (eleccion == 1) {
                            
                            elegirpelea = false;
                        }
                        else if (eleccion == 2) {
                            
                            elegirpelea = false;
                        }
                        else if (eleccion == 3) {
                            
                            elegirpelea = false;
                        }
                        else {
                            System.out.println("Error! Escoja otra vez.");
                        }
                    }while (elegirpelea == true);
                    break;
                    
                case 3:
                    System.out.println("Tomas un buen descanso...");
                    System.out.println("...");
                    hp = jugador.Gethp();
                    maxhp = hp;
                    System.out.println("Se han restaurado los Hit Points al maximo!");
                    break;
                    
                case 4:
                    System.out.println("Vendedor: Bienvenido(a) quieres hechar un vistazo a mis productos?");
                    break;
                    
                case 5:
                    System.out.println("Hola mundo");
                    break;
                    
                case 6:
                    juego = false;
                    break;
                    
                default:
                    System.out.println("Error! intente de nuevo.");
                    break;
            }
            System.out.println("");
        } while (juego == true);
    }
    
}
