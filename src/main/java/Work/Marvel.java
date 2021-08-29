
package Work;

import java.util.Scanner;

public class Marvel implements Personaje {
    
     Scanner sc = new Scanner(System.in);

    @Override
    public void Type() {
        System.out.println("El personaje a ingresar sera Heroe o Villano?:          ");
        String Type = sc.nextLine();
        System.out.println(Type);
        System.out.println();
    }

    @Override
    public void Name() {
        System.out.println("Ingrese el nombre de su personaje: ");
        String Name = sc.nextLine();
        System.out.println(Name);
        System.out.println();
    }

    @Override
    public void Energy() {
        System.out.println("El nuvel de energia del personaje:    ");
        String Energy = sc.nextLine();
        System.out.println(Energy);
        System.out.println(); 
    }

    @Override
    public void Lives() {
        System.out.println("La ccantidad de vida del personaje sera:       ");
        String Lives = sc.nextLine();
        System.out.println(Lives);
        System.out.println();  
    }

    @Override
    public void Offensive() {
        System.out.println("Capasidad de ofensiva:         ");
        String Offensive = sc.nextLine();
        System.out.println(Offensive);
        System.out.println();
    }
    
}
