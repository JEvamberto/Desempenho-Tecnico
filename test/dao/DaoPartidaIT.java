/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Partida;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author jose
 */
public class DaoPartidaIT {
    
    public DaoPartidaIT() {
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
     * Test of inserir method, of class DaoPartida.
     */

    @Test
    public void testInserir() {
        System.out.println("inserir-Partida");
        Partida part= new Partida();
        part.setData("22/09/2018");
        part.setHorario("22:00");
        part.setLocalDaPartida("Itaquera");
        part.setResultado("10X0");
        part.setTimeCasa("Corinthians");
        part.setTimeFora("São Paulo");
        part.setTipoDeJogo("Amistoso");
        DaoPartida instance = new DaoPartida();
        boolean expResult = true;
        boolean result = instance.inserir(part);
        assertEquals(expResult, result);
       
    }
        /**
     * Test of atualizar method, of class DaoPartida.
     */
   
    @Test
    
    public void testAtualizar() {
        System.out.println("atualizar-Partida");
        Partida part= new Partida();
        part.setData("22/09/2018");
        part.setHorario("22:00");
        part.setLocalDaPartida("Itaquera");
        part.setResultado("20X0");
        part.setTimeCasa("Brasil");
        part.setTimeFora("Argentina");
        part.setTipoDeJogo("Amistoso");
        part.setId(5);
        DaoPartida instance = new DaoPartida();
        boolean expResult = true;
        boolean result = instance.atualizar(part);
        assertEquals(expResult, result);
    
    }

    /**
     * Test of excluir method, of class DaoPartida.
     */
      
    @Test
    public void testExcluir() {
        System.out.println("excluir-Partida");
        Partida part = new Partida();
        part.setId(5);
      
        DaoPartida instance = new DaoPartida();
        boolean expResult = true;
        boolean result = instance.excluir(part);
        assertEquals(expResult, result);
     
    }



    /**
     * Test of buscar method, of class DaoPartida.
     */
      
    @Test
    public void testBuscar() {
        System.out.println("buscar-Partida");
        DaoPartida instance = new DaoPartida();
        List expResult = null;
        List result = instance.buscar();
        assertNotEquals(expResult, result);
        
    }

    /**
     * Test of buscarNomePartida method, of class DaoPartida.
     */
   
}
