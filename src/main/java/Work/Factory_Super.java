
package Work;

public class Factory_Super {
    
    public static Personaje Constructor(String Tipo){
        
        switch (Tipo){
            case "Marvel":
                return new Marvel();
                
            case "DC":
                return new DC();

            default:
                return null;
        }
    }
}
