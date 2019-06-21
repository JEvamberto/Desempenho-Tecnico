/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Desempenho;
import model.Jogador;
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
        System.out.println("inserir-Desempenho");
        Desempenho de= new Desempenho();
        de.setAssistencia(12);
        de.setDesarme(13);
        de.setDominioCerto(20);
        de.setDominioErrado(20);
        de.setDrible(23);
        de.setFinalizacoesGols(12);
        de.setGol(12);
        de.setPassesCertos(13);
        de.setPassesErrados(10);
        Partida partida = new Partida();
        partida.setId(1);
        Jogador jogador = new Jogador();
        jogador.setId(1);
        de.setJogador(jogador);
        de.setPartida(partida);
       
        
        DaoDesempenho instance = new DaoDesempenho();
        boolean expResult = true;
        boolean result = instance.inserir(de);
        assertEquals(expResult, result);
 
    }
        /**
     * Test of atualizar method, of class DaoDesempenho.
     */
    @Test
    public void testAtualizar() {
        
        System.out.println("atualizar-Desempenho");
              Desempenho de= new Desempenho();
        de.setAssistencia(12);
        de.setDesarme(13);
        de.setDominioCerto(40);
        de.setDominioErrado(30);
        de.setDrible(34);
        de.setFinalizacoesGols(52);
        de.setGol(121);
        de.setPassesCertos(13);
        de.setPassesErrados(105);
        Partida partida = new Partida();
        partida.setId(1);
        Jogador jogador = new Jogador();
        jogador.setId(11);
        de.setJogador(jogador);
        de.setPartida(partida);
       
      
        DaoDesempenho instance = new DaoDesempenho();
        boolean expResult = true;
        boolean result = instance.atualizar(de);
        assertEquals(expResult, result);
 
    }


    /**
     * Test of excluir method, of class DaoDesempenho.
     */
    @Test
    public void testExcluir() {
        System.out.println("excluir-Desempenho");
        Desempenho desempenho= new Desempenho();
        desempenho.setId(11);
        DaoDesempenho instance = new DaoDesempenho();
        boolean expResult = true;
        boolean result = instance.excluir(desempenho);
        assertEquals(expResult, result);
   
    }


    /**
     * Test of buscar method, of class DaoDesempenho.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar-Desempenho");
        DaoDesempenho instance = new DaoDesempenho();
        List expResult = null;
        List result = instance.buscar();
        assertNotEquals(expResult, result);
     
    }

  
}
