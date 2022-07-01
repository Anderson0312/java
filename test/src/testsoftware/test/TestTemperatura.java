package testsoftware.test;

import static org.junit.Assert.*;
import org.junit.Test; //import do junit

import testsoftware.projeto.Temperatura; 

public class TestTemperatura {
    
    // --------------Teste de Celsius Para Firhrenhit ---------------------
    @Test
    public void CelsiusParaFirhrenhit() {
        Temperatura test= new Temperatura();
        double saida = test.Celsius(15);
        assertEquals(59,59,saida);
    } 

    @Test
    public void CelsiusParaFirhrenhit1() {
        Temperatura test= new Temperatura();
        double saida = test.Celsius(20);
        assertEquals(68,68,saida);
    } 

    @Test
    public void CelsiusParaFirhrenhit3() {
        Temperatura test= new Temperatura();
        double saida = test.Celsius(0);
        assertEquals(32,32,saida);
    } 

    @Test
    public void CelsiusParaFirhrenhit4() {
        Temperatura test= new Temperatura();
        double saida = test.Celsius(-50);
        assertEquals(-58,-58,saida);
    } 

    @Test
    public void CelsiusParaFirhrenhit5() {
        Temperatura test= new Temperatura();
        double saida = test.Celsius(2.5);
        assertEquals(36.5,36.5,saida);
    } 


    // --------------Teste de Firhrenhit Para Celsius---------------------
    @Test
    public void FirhrenhitParaCelsius() {
        Temperatura test= new Temperatura();
        double saida = test.Farhrenheit(59);
        assertEquals(15,15,saida);
    } 

    @Test
    public void FirhrenhitParaCelsius1() {
        Temperatura test= new Temperatura();
        double saida = test.Farhrenheit(86);
        assertEquals(30,30,saida);
    } 

    @Test
    public void FirhrenhitParaCelsius2() {
        Temperatura test= new Temperatura();
        double saida = test.Farhrenheit(0);
        assertEquals(-17.7778,-17.7778,saida);
    } 

    @Test
    public void FirhrenhitParaCelsius3() {
        Temperatura test= new Temperatura();
        double saida = test.Farhrenheit(-4);
        assertEquals(-20,2,saida);
    } 

    @Test
    public void FirhrenhitParaCelsius4() {
        Temperatura test= new Temperatura();
        double saida = test.Farhrenheit(8.6);
        assertEquals(30,30,saida);
    } 

}
