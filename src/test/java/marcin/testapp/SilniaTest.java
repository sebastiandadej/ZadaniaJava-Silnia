/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package marcin.testapp;

import marcin.testapp.impl.OptymalnaSilnia;
import marcin.testapp.impl.SzybkaSilnia;
import marcin.testapp.impl.BigDecimalSilnia;
import marcin.testapp.impl.GuavaSilnia;
import marcin.testapp.impl.NieRekursywnaSilnia;
import marcin.util.Runner;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 *
 * @author mgr
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SilniaTest {

    private KalkulatorSilni szybkaSilnia;
    private KalkulatorSilni optymalnaSilnia;
    private KalkulatorSilni duzaSilnia;
    private KalkulatorSilni nierekSilnia;
    private KalkulatorSilni guavaSilnia;
    private KalkulatorSilni[]wszytkieKalkulatory;
    
    public SilniaTest(){
        szybkaSilnia = new SzybkaSilnia();
        optymalnaSilnia = new OptymalnaSilnia();
        duzaSilnia = new BigDecimalSilnia();
        nierekSilnia = new NieRekursywnaSilnia();
        guavaSilnia = new GuavaSilnia();
        wszytkieKalkulatory=new KalkulatorSilni[4];
        wszytkieKalkulatory[0]=szybkaSilnia;
        wszytkieKalkulatory[1]=optymalnaSilnia;
        wszytkieKalkulatory[2]=duzaSilnia;
        wszytkieKalkulatory[3]=nierekSilnia;
    }
    
    
    //to jest prosty test, który sprawdza implementację dostarczonego algorytmu, który liczy opierając się na typach long
    @Test
    public void t001PodstawowyTest(){
        //given
            int silnia=10;
        //when
            String wynik=szybkaSilnia.licz(silnia);
        //then
            Assert.assertEquals("3628800",wynik);
    }

    //test warunku brzegowego - liczby ujemne
    @Test(expected = Exception.class)
    public void t002ArgumentyUjemne(){
        //given
            int silnia=-1;
        //when
            String wynik=szybkaSilnia.licz(silnia);
        //then
            Assert.fail();
    }    
    
    //test warunku brzegowego - duże argumenty
    @Test
    public void t003DuzeArgumenty(){
        //given
            int silnia=50;
        //when
            String wynik=optymalnaSilnia.licz(silnia);
        //then
            //w teście sprawdzam tylko pierwsze 10 cyfr
            Assert.assertEquals(wynik.substring(0,10), "3041409320");
    }        
    
    //test wszystkich algorytmów
    @Test
    public void t004Wszystkie(){
        for(KalkulatorSilni kalkulator:wszytkieKalkulatory){
        //given
            int silnia=9;
        //when
            String wynik=kalkulator.licz(silnia);
        //then
            //w teście sprawdzam tylko pierwsze n cyfr
            Assert.assertEquals("362880", wynik);
        }
    }            
    
    //@Test(timeout = 150)
    public void a_liczSilnieProstePrzypadki() {
        Assert.assertEquals("265252859812191058636308480000000", nierekSilnia.licz(30));
        Assert.assertEquals("265252859812191058636308480000000", duzaSilnia.licz(30));
        Assert.assertEquals(duzaSilnia.licz(30), "265252859812191058636308480000000");
        
        Assert.assertEquals(szybkaSilnia.licz(3), "6");
        Assert.assertEquals(szybkaSilnia.licz(0), "1");

        long czasWykonaniaSzybka = new Runner<String>() {
            @Override
            public String run() {
                Assert.assertEquals(duzaSilnia.licz(12), "479001600");
                return "ok";
            }
        }.getCzasWykonania();

        long czasWykonaniaDuza = new Runner<String>() {
            @Override
            public String run() {
                Assert.assertEquals(szybkaSilnia.licz(12), "479001600");
                return "ok";
            }
        }.getCzasWykonania();

        System.out.println("czasWykonania90:" + czasWykonaniaSzybka);
        System.out.println("czasWykonania90:" + czasWykonaniaDuza);

    }

    //@Test
    public void b_warunkiBrzegowe() {
        Assert.assertEquals(szybkaSilnia.licz(0), "1");
    }

    //@Test(expected = Exception.class)
    public void warunkiBrzegowe1() {
        Assert.assertEquals(szybkaSilnia.licz(-1000), "1");
    }

    //@Test
    public void duzeLiczby() {
        Assert.assertEquals(szybkaSilnia.licz(15), "1307674368000");
    }


}
