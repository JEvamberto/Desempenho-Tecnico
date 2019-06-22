/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DaoJogador;
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
public class JogadorTest {
    
    public JogadorTest() {
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
     * Test of getNome method, of class Jogador.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Jogador instance = new Jogador();
        String expResult = null;
        String result = instance.getNome();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNome method, of class Jogador.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Jogador instance = new Jogador();
        instance.setNome(nome);
        
    }

    /**
     * Test of getPosicao method, of class Jogador.
     */
    @Test
    public void testGetPosicao() {
        System.out.println("getPosicao");
        Jogador instance = new Jogador();
        String expResult = null;
        String result = instance.getPosicao();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPosicao method, of class Jogador.
     */
    @Test
    public void testSetPosicao() {
        System.out.println("setPosicao");
        String posicao = "";
        Jogador instance = new Jogador();
        instance.setPosicao(posicao);
        
    }

    /**
     * Test of getNumero_uniforme method, of class Jogador.
     */
    @Test
    public void testGetNumero_uniforme() {
        System.out.println("getNumero_uniforme");
        Jogador instance = new Jogador();
        int expResult = 0;
        int result = instance.getNumero_uniforme();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNumero_uniforme method, of class Jogador.
     */
    @Test
    public void testSetNumero_uniforme() {
        System.out.println("setNumero_uniforme");
        int numero_uniforme = 0;
        Jogador instance = new Jogador();
        instance.setNumero_uniforme(numero_uniforme);
        
    }

    /**
     * Test of getMelhor_pe method, of class Jogador.
     */
    @Test
    public void testGetMelhor_pe() {
        System.out.println("getMelhor_pe");
        Jogador instance = new Jogador();
        char expResult = '\u0000';
        char result = instance.getMelhor_pe();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setMelhor_pe method, of class Jogador.
     */
    @Test
    public void testSetMelhor_pe() {
        System.out.println("setMelhor_pe");
        char melhor_pe = ' ';
        Jogador instance = new Jogador();
        instance.setMelhor_pe(melhor_pe);
        
    }

    /**
     * Test of getId method, of class Jogador.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Jogador instance = new Jogador();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Jogador.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Jogador instance = new Jogador();
        instance.setId(id);
        
    }

    /**
     * Test of getDataDeNascimento method, of class Jogador.
     */
    @Test
    public void testGetDataDeNascimento() {
        System.out.println("getDataDeNascimento");
        Jogador instance = new Jogador();
        String expResult = null;
        String result = instance.getDataDeNascimento();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDataDeNascimento method, of class Jogador.
     */
    @Test
    public void testSetDataDeNascimento() {
        System.out.println("setDataDeNascimento");
        String DataDeNascimento = "";
        Jogador instance = new Jogador();
        instance.setDataDeNascimento(DataDeNascimento);
       
    }

    /**
     * Test of getTime method, of class Jogador.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Jogador instance = new Jogador();
        Time expResult = null;
        Time result = instance.getTime();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTime method, of class Jogador.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        Time time = null;
        Jogador instance = new Jogador();
        instance.setTime(time);
        
    }

    

}
