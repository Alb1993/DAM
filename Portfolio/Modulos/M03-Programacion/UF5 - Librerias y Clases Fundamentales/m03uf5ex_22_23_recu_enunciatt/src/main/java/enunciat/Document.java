/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enunciat;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author manel
 */
public class Document {

    Stack<Accio> accions;
    List<Pagina> pagines;
    Integer maxPagines;

    public Document(Integer maxPagines) {
        this.maxPagines = maxPagines;
        this.accions = new Stack<>();
        this.pagines = new ArrayList<>();
    }

    public boolean afegeixPagina(Pagina p) {
        Boolean ret = false;
        
        if (pagines.size() < maxPagines && !pagines.contains(p))
        {
            pagines.add(p);
            ret = true;
        }
        
        return ret;
    }

    public boolean suprimeixPagina(int numPag) {
        throw new UnsupportedOperationException(); // eliminar aquesta línia abans de començar a implementar
    }

    public Integer numPagines() {
        return pagines.size();
    }

    public Pagina getPagina(int n) {
        if(pagines.get(n)!=null){
            return pagines.get(n);
        }
        return null;
    }

    public boolean addAccio(Accio a) {
        throw new UnsupportedOperationException(); // eliminar aquesta línia abans de començar a implementar
    }

    public Accio undoAccio() {
        throw new UnsupportedOperationException(); // eliminar aquesta línia abans de començar a implementar
    }

    public Accio darreraAccio() {
        throw new UnsupportedOperationException(); // eliminar aquesta línia abans de començar a implementar
    }

    @Override
    public String toString() {
        return "Document{" + "accions=" + accions + ", pagines=" + pagines + '}';
    }
}
