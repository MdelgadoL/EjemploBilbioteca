/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.sistemas.biblioteca.vista;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import mx.edu.itschapala.sistemas.biblioteca.bl.AutorBLLocal;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Autor;

/**
 *
 * @author snake_gt
 */
@ManagedBean
@SessionScoped
public class AutorBean {
//----------------------------------------------------------------
//                        LLAmadas a los EJB
//----------------------------------------------------------------
    @EJB
    private AutorBLLocal autorBL;

//----------------------------------------------------------------
//                        Caractateresticas
//----------------------------------------------------------------
    private List<Autor> lista;
    private Autor autor;//objeto no autoadministrado
    
//----------------------------------------------------------------
//                      Constructor Obligatrio
//----------------------------------------------------------------
    public AutorBean() {
            autor= new Autor();
    }
    
    
//----------------------------------------------------------------
//                  Metodos GET y SET necesarios
//----------------------------------------------------------------
    public List<Autor> getLista(){
        lista=autorBL.getLista();
        return lista;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    } 
    
//----------------------------------------------------------------
//                          Eventos
//----------------------------------------------------------------
    public void prepararNuevo(ActionEvent evt){
        autor= new Autor();
    }
    
    
//----------------------------------------------------------------
//                         Acciones
//----------------------------------------------------------------
    public String procesarPeticion(){
        autorBL.registrar(autor);
        return "AutorLista";
    }
  
    
}
