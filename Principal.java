/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Autor objAut1 = new Autor("Lucas", 1995, "teste");
        
        Livro objLiv1 = new Livro ("Teste Titulo","new edit",1959);
        
        objAut1.setObra(objLiv1);
        objLiv1.setEscritor(objAut1);
        
        System.out.println("Livro: "+objAut1.getObra().getTitulo());
        System.out.println("Autor: "+objLiv1.getEscritor().getNome());

    }
    
}
