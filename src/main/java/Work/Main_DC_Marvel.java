package Work;

import java.util.Scanner;

public class Main_DC_Marvel {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("------------------------"); 
        System.out.println("Bienvenido Jugador!!!!!!");
        System.out.println("------------------------"); 
        System.out.println("Elige una compañia!!!!!!!"); 
        System.out.println("------------------------"); 
        System.out.println("1. Marvel");
        System.out.println("2. DC Comics");
        int EleccO = sc.nextInt();
        
        switch (EleccO) {
            case 1:
                Personaje Marvel1 = Factory_Super.Constructor("Marvel");
                Marvel1.Name();
                Marvel1.Type();
                Marvel1.Energy();
                Marvel1.Lives();
                Marvel1.Offensive();
                break;
                
            case 2:
                Personaje DC = Factory_Super.Constructor("DC");
                DC.Name();
                DC.Type();
                DC.Energy();
                DC.Lives();
                DC.Offensive();

                break;
                
            default:
                break;
        }
    }
}