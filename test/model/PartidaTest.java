/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DaoPartida;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cliente
 */
public class PartidaTest {
    
    public PartidaTest() {
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

    /**
     * Test of getData method, of class Partida.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Partida instance = new Partida();
        String expResult = null;
        String result = instance.getData();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setData method, of class Partida.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String data = "";
        Partida instance = new Partida();
        instance.setData(data);
       
    }

    /**
     * Test of getTimeCasa method, of class Partida.
     */
    @Test
    public void testGetTimeCasa() {
        System.out.println("getTimeCasa");
        Partida instance = new Partida();
        String expResult = null;
        String result = instance.getTimeCasa();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTimeCasa method, of class Partida.
     */
    @Test
    public void testSetTimeCasa() {
        System.out.println("setTimeCasa");
        String timeCasa = "";
        Partida instance = new Partida();
        instance.setTimeCasa(timeCasa);
        
    }

    /**
     * Test of getTimeFora method, of class Partida.
     */
    @Test
    public void testGetTimeFora() {
        System.out.println("getTimeFora");
        Partida instance = new Partida();
        String expResult = null;
        String result = instance.getTimeFora();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTimeFora method, of class Partida.
     */
    @Test
    public void testSetTimeFora() {
        System.out.println("setTimeFora");
        String timeFora = "";
        Partida instance = new Partida();
        instance.setTimeFora(timeFora);
        
    }

    /**
     * Test of getResultado method, of class Partida.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        Partida instance = new Partida();
        String expResult = null;
        String result = instance.getResultado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setResultado method, of class Partida.
     */
    @Test
    public void testSetResultado() {
        System.out.println("setResultado");
        String resultado = "";
        Partida instance = new Partida();
        instance.setResultado(resultado);
        
    }

    /**
     * Test of getLocalDaPartida method, of class Partida.
     */
    @Test
    public void testGetLocalDaPartida() {
        System.out.println("getLocalDaPartida");
        Partida instance = new Partida();
        String expResult = null;
        String result = instance.getLocalDaPartida();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setLocalDaPartida method, of class Partida.
     */
    @Test
    public void testSetLocalDaPartida() {
        System.out.println("setLocalDaPartida");
        String localDaPartida = "";
        Partida instance = new Partida();
        instance.setLocalDaPartida(localDaPartida);
        
    }

    /**
     * Test of getTipoDeJogo method, of class Partida.
     */
    @Test
    public void testGetTipoDeJogo() {
        System.out.println("getTipoDeJogo");
        Partida instance = new Partida();
        String expResult = null;
        String result = instance.getTipoDeJogo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTipoDeJogo method, of class Partida.
     */
    @Test
    public void testSetTipoDeJogo() {
        System.out.println("setTipoDeJogo");
        String tipoDeJogo = "";
        Partida instance = new Partida();
        instance.setTipoDeJogo(tipoDeJogo);
       
    }

    
    

    

    /**
     * Test of getId method, of class Partida.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Partida instance = new Partida();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Partida.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Partida instance = new Partida();
        instance.setId(id);
        
    }

    /**
     * Test of getHorario method, of class Partida.
     */
    @Test
    public void testGetHorario() {
        System.out.println("getHorario");
        Partida instance = new Partida();
        String expResult = null;
        String result = instance.getHorario();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHorario method, of class Partida.
     */
    @Test
    public void testSetHorario() {
        System.out.println("setHorario");
        String horario = "";
        Partida instance = new Partida();
        instance.setHorario(horario);
        
    }

    
   
}
