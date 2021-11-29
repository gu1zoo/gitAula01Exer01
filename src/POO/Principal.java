/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author IFSC
 */
public class Principal {
    public static void main(String[] args){
        Mesa mesa = new Mesa();
        
        mesa.setCor("Marrom");
        mesa.setAltura(1);
        mesa.setComprimento(3);
        mesa.setMaterial("MDF");
        mesa.setQtdLugares(4);
        
       System.out.println("------Mesa--------");
       System.out.println("Altura: "+mesa.getAltura());
       System.out.println("Comprimento: "+mesa.getComprimento());
       System.out.println("Material: "+mesa.getMaterial());
       System.out.println("Cor: "+ mesa.getCor());
       System.out.println("Quantidade de lugares: "+mesa.getQtdLugares());
               
       Sofa sofa = new Sofa();
       
       sofa.setComprimento(4);
       sofa.setCor("Marrom");
       sofa.setEscConforto(7);
       sofa.setLargura(2);
       sofa.setMaterial("Algodão");
       
       System.out.println("----------Sofa-------");
       System.out.println("Comprimento : "+sofa.getComprimento());
       System.out.println("Largura: " +sofa.getLargura());
       System.out.println("Material: " + sofa.getMaterial());
       System.out.println("Cor: "+sofa.getCor());
       System.out.println("Escala de conforto: "+ sofa.getEscConforto());
       
       
      
        
        
    }
    
}
