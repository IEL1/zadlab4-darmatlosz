/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author darma
 */
public class Student {
    public String imię;
    public String nazwisko;
    public int nr_indeksu;
    public String nazwa_specjalności;
    public String rok_studiów;
    
    public Student(String imię, String nazwisko, int nr_indeksu, String nazwa_specjalności, String rok_studiów){
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.nazwa_specjalności = nazwa_specjalności;
        this.rok_studiów = rok_studiów;
        
    }
    public Student(String imię, String nazwisko,int nr_indeksu){
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
    }
    public Student(String imię, String nazwisko){
        this.imię = imię;
        this.nazwisko = nazwisko;
       
    }
    public Student(String imię, String nazwisko, String rok_studiów){
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.rok_studiów = rok_studiów;
    }

    Student(String imie, String nazwisko, int nr_albumu, String specjalnosci, int rok_studiow) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void pokazDane() {
        System.out.println("Pokazuje dane 1");       
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void pokazeDane() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Pokazuje dane");
    }

    void pokazujedane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           
    
}