/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Time;
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
public class DaoTimeIT {
    
    public DaoTimeIT() {
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
     * Test of inserir method, of class DaoTime.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        Time time = new Time() ;
        time.setNome("EvambertoLima");
        DaoTime instance = new DaoTime();
        boolean expResult = true;
        boolean result = instance.inserir(time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of excluir method, of class DaoTime.
     */
    
    @Ignore
    @Test
    public void testExcluir() {
        System.out.println("excluir");
        Time time = new Time() ;
        time.setId(3);
        DaoTime instance = new DaoTime();
        boolean expResult = true;
        boolean result = instance.excluir(time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of atualizar method, of class DaoTime.
     */
    @Ignore
    @Test
    public void testAtualizar() {
        System.out.println("atualizar");
        Time time = new Time();
        time.setId(4);
        time.setNome("Palmeiras");
        DaoTime instance = new DaoTime();
        boolean expResult = true;
        boolean result = instance.atualizar(time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of buscar method, of class DaoTime.
     */
    @Ignore
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        DaoTime instance = new DaoTime();
        List expResult = null;
        List result = instance.buscar();
        assertNotEquals(expResult, result);
       
      
    }

}
