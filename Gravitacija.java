import java.util.*;
public class Gravitacija {
    public static void main(String[] args) {
        System.out.print("OIS je zakon!");
    }

    public static void double izracun(int nadmorskaVisina) {
        double rezultat = (6.674 * Math.pow(10, −11) * 1 * (5.972 * Math.pow(10, 24))) / (Math.pow(Math.pow(6.371, 106) + nadmorskaVisina, 2));
        return rezultat;
    }

    public static void (nadmorskaVisina, gravitacijskiPospesek) {
        
        System.out.println(nadmorskaVisina, gravitacijskiPospesek);
        
    }    
}