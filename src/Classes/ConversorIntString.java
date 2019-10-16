/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Victor Turra
 */
public class ConversorIntString extends org.jdesktop.beansbinding.Converter<Integer,String>{
    
    @Override
    public String convertForward(Integer s) {
        return s.toString();
    }

    @Override
    public Integer convertReverse(String t) {
        try{
            return Integer.parseInt(t);
        }catch(NumberFormatException e){
            return null;
        }
    }
    
}
