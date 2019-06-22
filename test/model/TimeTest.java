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
 * @author Cliente
 */
public class TimeTest {
    
    public TimeTest() {
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
     * Test of getId method, of class Time.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Time instance = new Time();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        
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
        
    }

    /**
     * Test of getNome method, of class Time.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Time instance = new Time();
        String expResult = null;
        String result = instance.getNome();
        assertEquals(expResult, result);
        
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
        
    }

    
    
}
