/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Cw3.Cw3;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dominik
 */
public class Testy {
    
    public Testy() {
    }
    
    @Test(timeout=100)
    public void Test_czas() {
        Cw3 p = new Cw3();
        p.progr();
    }
    
    @Test
    public void Test_wstawpocz_ArrayList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List ArrayList = new ArrayList();
        p.stworz(ArrayList);
        
        if (p.wstawpocz(ArrayList) < 20000){
            test=true;
        }
        
        assertTrue("kiedy dodamy element w ArrayList bedziemy mieli czas wykonania mniejszy niz 20000ns", test);

    }
    
    @Test
    public void Test_wstawpocz_LinkedList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List LinkedList = new LinkedList();
        p.stworz(LinkedList);
        
        if (p.wstawpocz(LinkedList) < 40000){
            test=true;
        }
        
        assertTrue("kiedy dodamy element w LinkedList bedziemy mieli czas wykonania mniejszy niz 40000ns", test);

    }
    
    @Test
    public void Test_wstawsrod_ArrayList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List ArrayList = new ArrayList();
        p.stworz(ArrayList);
        
        if (p.wstawsrod(ArrayList) < 20000){
            test=true;
        }
        
        assertTrue("kiedy dodamy element w ArrayList bedziemy mieli czas wykonania mniejszy niz 20000ns", test);

    }
    
    @Test
    public void Test_wstawsrod_LinkedList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List LinkedList = new LinkedList();
        p.stworz(LinkedList);
        
        if (p.wstawsrod(LinkedList) < 40000){
            test=true;
        }
        
        assertTrue("kiedy dodamy element w LinkedList bedziemy mieli czas wykonania mniejszy niz 40000ns", test);

    }
    
    @Test
    public void Test_wstawkon_ArrayList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List ArrayList = new ArrayList();
        p.stworz(ArrayList);
        
        if (p.wstawkon(ArrayList) < 20000){
            test=true;
        }
        
        assertTrue("kiedy dodamy element w ArrayList bedziemy mieli czas wykonania mniejszy niz 20000ns", test);

    }
    
    @Test
    public void Test_wstawkon_LinkedList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List LinkedList = new LinkedList();
        p.stworz(LinkedList);
        
        if (p.wstawkon(LinkedList) < 40000){
            test=true;
        }
        
        assertTrue("kiedy dodamy element w LinkedList bedziemy mieli czas wykonania mniejszy niz 40000ns", test);

    }
    
    @Test
    public void Test_usunpocz_ArrayList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List ArrayList = new ArrayList();
        p.stworz(ArrayList);
        
        if (p.usunpocz(ArrayList) < 20000){
            test=true;
        }
        
        assertTrue("kiedy usuniemy element w ArrayList bedziemy mieli czas wykonania mniejszy niz 20000ns", test);

    }
    
    @Test
    public void Test_usunpocz_LinkedList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List LinkedList = new LinkedList();
        p.stworz(LinkedList);
        
        if (p.usunpocz(LinkedList) < 40000){
            test=true;
        }
        
        assertTrue("kiedy usuniemy element w LinkedList bedziemy mieli czas wykonania mniejszy niz 40000ns", test);

    }
    
    @Test
    public void Test_usunsrod_ArrayList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List ArrayList = new ArrayList();
        p.stworz(ArrayList);
        
        if (p.usunsrod(ArrayList) < 20000){
            test=true;
        }
        
        assertTrue("kiedy usuniemy element w ArrayList bedziemy mieli czas wykonania mniejszy niz 20000ns", test);

    }
    
    @Test
    public void Test_usunsrod_LinkedList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List LinkedList = new LinkedList();
        p.stworz(LinkedList);
        
        if (p.usunsrod(LinkedList) < 40000){
            test=true;
        }
        
        assertTrue("kiedy usuniemy element w LinkedList bedziemy mieli czas wykonania mniejszy niz 40000ns", test);

    }
    
    @Test
    public void Test_usunkon_ArrayList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List ArrayList = new ArrayList();
        p.stworz(ArrayList);
        p.wstawpocz(ArrayList);
        
        if (p.usunkon(ArrayList) < 20000){
            test=true;
        }
        
        assertTrue("kiedy usuniemy element w ArrayList bedziemy mieli czas wykonania mniejszy niz 20000ns", test);

    }
    
    @Test
    public void Test_usunkon_LinkedList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List LinkedList = new LinkedList();
        p.stworz(LinkedList);
        p.wstawpocz(LinkedList);
        
        if (p.usunkon(LinkedList) < 40000){
            test=true;
        }
        
        assertTrue("kiedy usuniemy element w LinkedList bedziemy mieli czas wykonania mniejszy niz 40000ns", test);

    }
    
    @Test
    public void Test_dajpocz_ArrayList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List ArrayList = new ArrayList();
        p.stworz(ArrayList);
        
        if (p.dajpocz(ArrayList) < 20000){
            test=true;
        }
        
        assertTrue("kiedy pobierzemy element w ArrayList bedziemy mieli czas wykonania mniejszy niz 20000ns", test);

    }
    
    @Test
    public void Test_dajpocz_LinkedList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List LinkedList = new LinkedList();
        p.stworz(LinkedList);
        
        if (p.dajpocz(LinkedList) < 40000){
            test=true;
        }
        
        assertTrue("kiedy pobierzemy element w LinkedList bedziemy mieli czas wykonania mniejszy niz 40000ns", test);

    }
    
    @Test
    public void Test_dajsrod_ArrayList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List ArrayList = new ArrayList();
        p.stworz(ArrayList);
        
        if (p.dajsrod(ArrayList) < 20000){
            test=true;
        }
        
        assertTrue("kiedy pobierzemy element w ArrayList bedziemy mieli czas wykonania mniejszy niz 20000ns", test);

    }
    
    @Test
    public void Test_dajsrod_LinkedList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List LinkedList = new LinkedList();
        p.stworz(LinkedList);
        
        if (p.dajsrod(LinkedList) < 40000){
            test=true;
        }
        
        assertTrue("kiedy pobierzemy element w LinkedList bedziemy mieli czas wykonania mniejszy niz 40000ns", test);

    }
    @Test
    public void Test_dajkon_ArrayList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List ArrayList = new ArrayList();
        p.stworz(ArrayList);
        
        if (p.dajkon(ArrayList) < 20000){
            test=true;
        }
        
        assertTrue("kiedy pobierzemy element w ArrayList bedziemy mieli czas wykonania mniejszy niz 20000ns", test);

    }
    
    @Test
    public void Test_dajkon_LinkedList() {
        
        boolean test=false;
        
        Cw3 p = new Cw3();
        List LinkedList = new LinkedList();
        p.stworz(LinkedList);
        
        if (p.dajkon(LinkedList) < 40000){
            test=true;
        }
        
        assertTrue("kiedy pobierzemy element w LinkedList bedziemy mieli czas wykonania mniejszy niz 40000ns", test);

    }
    
    @Test
    public void Test_stworz_dlugosc() {
        
        Cw3 p = new Cw3();
        List ArrayList = new ArrayList();
        p.stworz(ArrayList);       
        
        assertEquals("ArrayList powinna zawierac 100 elementow", 100, ArrayList.size());

    }
    
    @Test
    public void Test_stworz_porownanie() {
        
        Cw3 p = new Cw3();
        List ArrayList = new ArrayList();
        List LinkedList = new LinkedList();

        p.stworz(ArrayList);
        p.stworz(LinkedList);     
        
        int actual = ArrayList.size()- LinkedList.size();
        
        assertEquals("dlugosci Arraylisty i LinkedListy powinny byc takie same", 0, actual);

    }
    
    @Test
    public void Test_stworz_elementy_pierwszy() {
        
        Cw3 p = new Cw3();
        List ArrayList = new ArrayList();

        p.stworz(ArrayList);     
        
        int x = (Integer)ArrayList.get(0);        
        
        assertSame("ArrayLista powinna zawierac pierwszy element rowny 0", 0, x);

    }
    
    @Test
    public void Test_stworz_elementy_ostatni() {
        
        Cw3 p = new Cw3();
        List ArrayList = new ArrayList();

        p.stworz(ArrayList);     
        
        int x = (Integer)ArrayList.get(99);        
        
        assertSame("ArrayLista powinna zawierac ostatni element rowny 99", 99, x);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
