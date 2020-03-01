import java.util.*;
public class Gravitacija {
    public static void main(String[] args) {
        System.out.print("OIS je zakon!");

		Scanner sc = new Scanner(System.in);
		double nadmorskaVis = sc.nextInt();
		double pospesek = izracun(nadmorskaVis);
		
		izpis(nadmorskaVis, pospesek);
    }
    public static double izracun(double nadmorskaVisina) {
        double rezultat = (10000000 / (6371000 + nadmorskaVisina)) * (6674 * 5972 / (6371000 + nadmorskaVisina));
        return rezultat;
    }

    public static void izpis(double nadmorskaVisina, double gravitacijskiPospesek) {
        
        System.out.println(gravitacijskiPospesek);
        System.out.println(nadmorskaVisina);
    }        
} 