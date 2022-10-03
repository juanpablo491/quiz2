/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import clases.Bart;
import clases.DibujarSimpsons;
import clases.Homero;
import clases.Maggie;
import clases.Marge;
import clases.lisa;

/**
 *
 * @author WINDOWS
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DibujarSimpsons Ds = new DibujarSimpsons();
       
        for(int i=0; i<5; i++){
            if (i==0){
                   Homero h = new Homero();
        Ds.dibujar(h);
                }else if(i==1){
                    Marge m = new Marge();
                    Ds.dibujar(m);
                }else if (i==2){
                    Bart b = new Bart();
                    Ds.dibujar(b);
                }else if (i==3){
                    lisa l = new lisa();
                    Ds.dibujar(l);
                }else if (i==4){
                    Maggie ma = new Maggie();
                    Ds.dibujar(ma);
                }
        }
        
        
    }
    
}
