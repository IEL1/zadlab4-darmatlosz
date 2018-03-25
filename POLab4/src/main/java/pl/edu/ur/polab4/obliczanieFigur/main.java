package pl.edu.ur.polab4.obliczanieFigur;
/**
 *
 * @author Daria
 */
public class main {
    
    public static void main(String[] args) {
        Kwadrat Kwadrat1 = new Kwadrat(3);
        Kwadrat1.WyswietlDane();
        
        Prostokąt Prostokat = new Prostokąt(1,6);
        Prostokat.WyswietlDane();
        
        Koło Kolo1 = new Koło(7);
        Kolo1.WyswietlDane();
        
        Kula Kula1 = new Kula(6);
        Kula1.WyswietlDane();
        
        Stożek Stozek1 = new Stożek(3,6);
        Stozek1.WyswietlDane();
        
        Sześcian Szescian1 = new Sześcian(5);
        Szescian1.WyswietlDane();
        
        Prostopadłościan Prostop = new Prostopadłościan(1,3,2);
        Prostop.WyswietlDane();
    }
}