/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DaoTime;
import java.util.List;
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
public class TimeIT {
    
    public TimeIT() {
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
     * Test of nomeTime method, of class Time.
     */
    @Test
    public void testNomeTime() {
        System.out.println("nomeTime");
        Time instance = new Time();
        List expResult = null;
        List result = instance.nomeTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Time.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Time instance = new Time();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Time.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Time instance = new Time();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Time.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Time instance = new Time();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Time.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Time instance = new Time();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrarTime method, of class Time.
     */
    @Test
    public void testCadastrarTime() {
        System.out.println("cadastrarTime");
        String nome = "";
        Time instance = new Time();
        instance.cadastrarTime(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizarTime method, of class Time.
     */
    @Test
    public void testAtualizarTime() {
        System.out.println("atualizarTime");
        int id = 0;
        String nome = "";
        Time instance = new Time();
        instance.atualizarTime(id, nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirTime method, of class Time.
     */
    @Test
    public void testExcluirTime() {
        System.out.println("excluirTime");
        int id = 0;
        Time instance = new Time();
        instance.excluirTime(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTime method, of class Time.
     */
    @Test
    public void testBuscarTime() {
        System.out.println("buscarTime");
        Time instance = new Time();
        List expResult = null;
        List result = instance.buscarTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Time.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Time instance = new Time();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDaoTime method, of class Time.
     */
    @Test
    public void testGetDaoTime() {
        System.out.println("getDaoTime");
        Time instance = new Time();
        DaoTime expResult = null;
        DaoTime result = instance.getDaoTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
