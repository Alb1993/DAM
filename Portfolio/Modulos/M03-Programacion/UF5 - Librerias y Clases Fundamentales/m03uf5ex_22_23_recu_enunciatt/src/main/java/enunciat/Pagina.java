/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enunciat;

/**
 * @author manel
 */
public class Pagina {
    
    int n_pagina;
    String cabecera;
    String text;
    int amplada_columnes;
    int mida_font_default;

    public Pagina() {
    }

    public Pagina(int n_pagina, String titol, String text, int amplada_columnes, int mida_font_default) throws Exception {
       if(n_pagina<=0){
           throw new DocException("aaaaa");       
       }
        
        
        this.n_pagina=n_pagina;
       this.cabecera=titol;
       this.text=text;
       this.amplada_columnes=amplada_columnes;
       
        if (mida_font_default < 5 || mida_font_default > 99){
                   throw new MidaFontException("la mida de la font ha d'estar entre 5 i 99");
        }
        this.mida_font_default=mida_font_default;
       
    }

    public int getN_pagina() {
        return n_pagina;
    }

    public String getCabecera() {
        return cabecera;
    }

    public String getText() {
        return text;
    }

    public int getAmplada_columnes() {
        return amplada_columnes;
    }

    public int getMida_font_default() {
        return mida_font_default;
    }

    public void setN_pagina(int n_pagina) {
        this.n_pagina = n_pagina;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    @Override
    public String toString() {
        return "Pagina{" + "n_pagina=" + n_pagina + ", titol=" + cabecera + ", text=" + text + ", amplada_columnes=" + amplada_columnes + ", mida_font_default=" + mida_font_default + '}';
    }
    
    private static class MidaFontException extends Exception {

        public MidaFontException(String n) {
            super(n);
        }
    }

    private static class DocException extends Exception {

        public DocException(String n) {
            super(n);
        }
    }

    
}
