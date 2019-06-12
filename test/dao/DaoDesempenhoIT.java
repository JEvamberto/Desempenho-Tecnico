/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Desempenho;
import model.Partida;
import model.Time;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jose
 */
public class DaoDesempenhoIT {
    
    public DaoDesempenhoIT() {
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
     * Test of inserir method, of class DaoDesempenho.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        Desempenho de= new Desempenho();
        
        DaoDesempenho instance = new DaoDesempenho();
        boolean expResult = false;
        boolean result = instance.inserir(de);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class DaoDesempenho.
     */
    @Test
    public void testExcluir() {
        System.out.println("excluir");
        Object object = null;
        DaoDesempenho instance = new DaoDesempenho();
        boolean expResult = false;
        boolean result = instance.excluir(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizar method, of class DaoDesempenho.
     */
    @Test
    public void testAtualizar() {
        System.out.println("atualizar");
        Object object = null;
        DaoDesempenho instance = new DaoDesempenho();
        boolean expResult = false;
        boolean result = instance.atualizar(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class DaoDesempenho.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        DaoDesempenho instance = new DaoDesempenho();
        List expResult = null;
        List result = instance.buscar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of relatorioPasse method, of class DaoDesempenho.
     */
    @Test
    public void testRelatorioPasse() {
        System.out.println("relatorioPasse");
        Time time = null;
        Partida partida1 = null;
        DaoDesempenho instance = new DaoDesempenho();
        List expResult = null;
        List result = instance.relatorioPasse(time, partida1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of relatorioDominio method, of class DaoDesempenho.
     */
    @Test
    public void testRelatorioDominio() {
        System.out.println("relatorioDominio");
        Time time = null;
        Partida partida1 = null;
        DaoDesempenho instance = new DaoDesempenho();
        List expResult = null;
        List result = instance.relatorioDominio(time, partida1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of relatorioFinalizacao method, of class DaoDesempenho.
     */
    @Test
    public void testRelatorioFinalizacao() {
        System.out.println("relatorioFinalizacao");
        Time time = null;
        Partida partida1 = null;
        DaoDesempenho instance = new DaoDesempenho();
        List expResult = null;
        List result = instance.relatorioFinalizacao(time, partida1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarDesempenhoPartida method, of class DaoDesempenho.
     */
    @Test
    public void testBuscarDesempenhoPartida() {
        System.out.println("buscarDesempenhoPartida");
        Partida partida1 = null;
        DaoDesempenho instance = new DaoDesempenho();
        List expResult = null;
        List result = instance.buscarDesempenhoPartida(partida1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
