/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Jogador;
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
public class DaoJogadorIT {
    
    public DaoJogadorIT() {
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
     * Test of inserir method, of class DaoJogador.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir-Jogador");
        Jogador jogador = new Jogador();
        jogador.setNome("Ricardo");
        jogador.setMelhor_pe('D');
        jogador.setNumero_uniforme(12);
        jogador.setPosicao("Lateral esquerdo");
        Time time= new Time();
        time.setId(1);
        jogador.setTime(time);
        jogador.setDataDeNascimento("20/05/1996");
       
        
        DaoJogador instance = new DaoJogador();
        boolean expResult = true;
        boolean result = instance.inserir(jogador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
        /**
     * Test of atualizar method, of class DaoJogador.
     */
    @Test
    public void testAtualizar() {
        System.out.println("atualizar-Jogador");
        Jogador jogador = new Jogador();
        jogador.setNome("João Lima");
        jogador.setMelhor_pe('E');
        jogador.setNumero_uniforme(12);
        jogador.setPosicao("Lateral Direito");
        Time time= new Time();
        time.setId(1);
        jogador.setTime(time);
        jogador.setDataDeNascimento("20/05/1986");
        jogador.setId(13);
        DaoJogador instance = new DaoJogador();
        boolean expResult = true;
        boolean result = instance.atualizar(jogador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    /**
     * Test of excluir method, of class DaoJogador.
     */
    @Test
    public void testExcluir() {
        System.out.println("excluir-jogador");
        Jogador jogador = new Jogador();
        jogador.setId(13);
     
     
  
        DaoJogador instance = new DaoJogador();
        boolean expResult = true;
        boolean result = instance.excluir(jogador);
        assertEquals(expResult, result);
 
        
    }



    /**
     * Test of buscar method, of class DaoJogador.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        DaoJogador instance = new DaoJogador();
        List expResult = null;
        List result = instance.buscar();
        assertNotEquals(expResult, result);
        

    }

   
  
    
}
