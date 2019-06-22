/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DaoDesempenho;
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
public class DesempenhoTest {
    
    public DesempenhoTest() {
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
     * Test of getTotalDePasses method, of class Desempenho.
     */
    @Test
    public void testGetTotalDePasses() {
        System.out.println("getTotalDePasses");
        Desempenho instance = new Desempenho();
        int expResult = 0;
        int result = instance.getTotalDePasses();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTotalDePasses method, of class Desempenho.
     */
    @Test
    public void testSetTotalDePasses() {
        System.out.println("setTotalDePasses");
        int totalDePasses = 0;
        Desempenho instance = new Desempenho();
        instance.setTotalDePasses(totalDePasses);
        
    }

    /**
     * Test of getPassesCertos method, of class Desempenho.
     */
    @Test
    public void testGetPassesCertos() {
        System.out.println("getPassesCertos");
        Desempenho instance = new Desempenho();
        int expResult = 0;
        int result = instance.getPassesCertos();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPassesCertos method, of class Desempenho.
     */
    @Test
    public void testSetPassesCertos() {
        System.out.println("setPassesCertos");
        int passesCertos = 0;
        Desempenho instance = new Desempenho();
        instance.setPassesCertos(passesCertos);
        
    }

    /**
     * Test of getPassesErrados method, of class Desempenho.
     */
    @Test
    public void testGetPassesErrados() {
        System.out.println("getPassesErrados");
        Desempenho instance = new Desempenho();
        int expResult = 0;
        int result = instance.getPassesErrados();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPassesErrados method, of class Desempenho.
     */
    @Test
    public void testSetPassesErrados() {
        System.out.println("setPassesErrados");
        int passesErrados = 0;
        Desempenho instance = new Desempenho();
        instance.setPassesErrados(passesErrados);
        
    }

    /**
     * Test of getFinalizacoesTotais method, of class Desempenho.
     */
    @Test
    public void testGetFinalizacoesTotais() {
        System.out.println("getFinalizacoesTotais");
        Desempenho instance = new Desempenho();
        int expResult = 0;
        int result = instance.getFinalizacoesTotais();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFinalizacoesTotais method, of class Desempenho.
     */
    @Test
    public void testSetFinalizacoesTotais() {
        System.out.println("setFinalizacoesTotais");
        int finalizacoesTotais = 0;
        Desempenho instance = new Desempenho();
        instance.setFinalizacoesTotais(finalizacoesTotais);
        
    }

    /**
     * Test of getFinalizacoesGols method, of class Desempenho.
     */
    @Test
    public void testGetFinalizacoesGols() {
        System.out.println("getFinalizacoesGols");
        Desempenho instance = new Desempenho();
        int expResult = 0;
        int result = instance.getFinalizacoesGols();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFinalizacoesGols method, of class Desempenho.
     */
    @Test
    public void testSetFinalizacoesGols() {
        System.out.println("setFinalizacoesGols");
        int finalizacoesGols = 0;
        Desempenho instance = new Desempenho();
        instance.setFinalizacoesGols(finalizacoesGols);
        
    }

    /**
     * Test of getDominioTotal method, of class Desempenho.
     */
    @Test
    public void testGetDominioTotal() {
        System.out.println("getDominioTotal");
        Desempenho instance = new Desempenho();
        int expResult = 0;
        int result = instance.getDominioTotal();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDominioTotal method, of class Desempenho.
     */
    @Test
    public void testSetDominioTotal() {
        System.out.println("setDominioTotal");
        int dominioTotal = 0;
        Desempenho instance = new Desempenho();
        instance.setDominioTotal(dominioTotal);
        
    }

    /**
     * Test of getDominioCerto method, of class Desempenho.
     */
    @Test
    public void testGetDominioCerto() {
        System.out.println("getDominioCerto");
        Desempenho instance = new Desempenho();
        int expResult = 0;
        int result = instance.getDominioCerto();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDominioCerto method, of class Desempenho.
     */
    @Test
    public void testSetDominioCerto() {
        System.out.println("setDominioCerto");
        int dominioCerto = 0;
        Desempenho instance = new Desempenho();
        instance.setDominioCerto(dominioCerto);
        
    }

    /**
     * Test of getDominioErrado method, of class Desempenho.
     */
    @Test
    public void testGetDominioErrado() {
        System.out.println("getDominioErrado");
        Desempenho instance = new Desempenho();
        int expResult = 0;
        int result = instance.getDominioErrado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDominioErrado method, of class Desempenho.
     */
    @Test
    public void testSetDominioErrado() {
        System.out.println("setDominioErrado");
        int dominioErrado = 0;
        Desempenho instance = new Desempenho();
        instance.setDominioErrado(dominioErrado);
        
    }

    /**
     * Test of getDesarme method, of class Desempenho.
     */
    @Test
    public void testGetDesarme() {
        System.out.println("getDesarme");
        Desempenho instance = new Desempenho();
        int expResult = 0;
        int result = instance.getDesarme();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDesarme method, of class Desempenho.
     */
    @Test
    public void testSetDesarme() {
        System.out.println("setDesarme");
        int desarme = 0;
        Desempenho instance = new Desempenho();
        instance.setDesarme(desarme);
        
    }

    /**
     * Test of getGol method, of class Desempenho.
     */
    @Test
    public void testGetGol() {
        System.out.println("getGol");
        Desempenho instance = new Desempenho();
        int expResult = 0;
        int result = instance.getGol();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setGol method, of class Desempenho.
     */
    @Test
    public void testSetGol() {
        System.out.println("setGol");
        int gol = 0;
        Desempenho instance = new Desempenho();
        instance.setGol(gol);
        
    }

    /**
     * Test of getAssistencia method, of class Desempenho.
     */
    @Test
    public void testGetAssistencia() {
        System.out.println("getAssistencia");
        Desempenho instance = new Desempenho();
        int expResult = 0;
        int result = instance.getAssistencia();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAssistencia method, of class Desempenho.
     */
    @Test
    public void testSetAssistencia() {
        System.out.println("setAssistencia");
        int assistencia = 0;
        Desempenho instance = new Desempenho();
        instance.setAssistencia(assistencia);
        
    }

    /**
     * Test of getDrible method, of class Desempenho.
     */
    @Test
    public void testGetDrible() {
        System.out.println("getDrible");
        Desempenho instance = new Desempenho();
        int expResult = 0;
        int result = instance.getDrible();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDrible method, of class Desempenho.
     */
    @Test
    public void testSetDrible() {
        System.out.println("setDrible");
        int drible = 0;
        Desempenho instance = new Desempenho();
        instance.setDrible(drible);
       
    }

    /**
     * Test of getJogador method, of class Desempenho.
     */
    @Test
    public void testGetJogador() {
        System.out.println("getJogador");
        Desempenho instance = new Desempenho();
        Jogador expResult = null;
        Jogador result = instance.getJogador();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setJogador method, of class Desempenho.
     */
    @Test
    public void testSetJogador() {
        System.out.println("setJogador");
        Jogador jogador = null;
        Desempenho instance = new Desempenho();
        instance.setJogador(jogador);
        
    }

    /**
     * Test of getId method, of class Desempenho.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Desempenho instance = new Desempenho();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Desempenho.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Desempenho instance = new Desempenho();
        instance.setId(id);
        
    }

    /**
     * Test of getPartida method, of class Desempenho.
     */
    @Test
    public void testGetPartida() {
        System.out.println("getPartida");
        Desempenho instance = new Desempenho();
        Partida expResult = null;
        Partida result = instance.getPartida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPartida method, of class Desempenho.
     */
    @Test
    public void testSetPartida() {
        System.out.println("setPartida");
        Partida partida = null;
        Desempenho instance = new Desempenho();
        instance.setPartida(partida);
        
    }


    /**
     * Test of getDaoDesempenho method, of class Desempenho.
     */
    @Test
    public void testGetDaoDesempenho() {
        System.out.println("getDaoDesempenho");
        Desempenho instance = new Desempenho();
        DaoDesempenho expResult = null;
        DaoDesempenho result = instance.getDaoDesempenho();
        assertEquals(expResult, result);
        
    }
    
}
