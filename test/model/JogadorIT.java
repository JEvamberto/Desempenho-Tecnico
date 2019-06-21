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
 * @author jose
 */
public class JogadorIT {
    
    public JogadorIT() {
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
     * Test of cadastrarJogador method, of class Jogador.
     */
    @Test
    public void testCadastrarJogador() {
        System.out.println("cadastrarJogador");
        String nome = "";
        String dataNascimento = "";
        String posicao = "";
        char melhor_pe = ' ';
        Time time = null;
        Jogador instance = new Jogador();
        instance.cadastrarJogador(nome, dataNascimento, posicao, melhor_pe, time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizarJogador method, of class Jogador.
     */
    @Test
    public void testAtualizarJogador() {
        System.out.println("atualizarJogador");
        int id = 0;
        String nome = "";
        String dataNascimento = "";
        String posicao = "";
        char melhor_pe = ' ';
        Time time = null;
        Jogador instance = new Jogador();
        instance.atualizarJogador(id, nome, dataNascimento, posicao, melhor_pe, time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirJogador method, of class Jogador.
     */
    @Test
    public void testExcluirJogador() {
        System.out.println("excluirJogador");
        int id = 0;
        Jogador instance = new Jogador();
        instance.excluirJogador(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarJogador method, of class Jogador.
     */
    @Test
    public void testBuscarJogador() {
        System.out.println("buscarJogador");
        Jogador instance = new Jogador();
        List expResult = null;
        List result = instance.buscarJogador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Jogador.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Jogador instance = new Jogador();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicao method, of class Jogador.
     */
    @Test
    public void testGetPosicao() {
        System.out.println("getPosicao");
        Jogador instance = new Jogador();
        String expResult = "";
        String result = instance.getPosicao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMelhor_pe method, of class Jogador.
     */
    @Test
    public void testGetMelhor_pe() {
        System.out.println("getMelhor_pe");
        Jogador instance = new Jogador();
        char expResult = ' ';
        char result = instance.getMelhor_pe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataDeNascimento method, of class Jogador.
     */
    @Test
    public void testGetDataDeNascimento() {
        System.out.println("getDataDeNascimento");
        Jogador instance = new Jogador();
        String expResult = "";
        String result = instance.getDataDeNascimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Jogador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Jogador instance = new Jogador();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDaoJogador method, of class Jogador.
     */
    @Test
    public void testGetDaoJogador() {
        System.out.println("getDaoJogador");
        Jogador instance = new Jogador();
        DaoJogador expResult = null;
        DaoJogador result = instance.getDaoJogador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarJogadorPeloId method, of class Jogador.
     */
    @Test
    public void testBuscarJogadorPeloId() {
        System.out.println("buscarJogadorPeloId");
        int id = 0;
        Jogador instance = new Jogador();
        Jogador expResult = null;
        Jogador result = instance.buscarJogadorPeloId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Jogador.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Jogador instance = new Jogador();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Jogador.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Jogador instance = new Jogador();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
