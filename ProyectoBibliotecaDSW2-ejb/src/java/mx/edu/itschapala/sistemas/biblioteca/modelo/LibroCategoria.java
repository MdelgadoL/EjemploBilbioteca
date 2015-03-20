/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.sistemas.biblioteca.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author snake_gt
 */
@Entity
@Table(name = "LibroCategoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LibroCategoria.findAll", query = "SELECT l FROM LibroCategoria l"),
    @NamedQuery(name = "LibroCategoria.findById", query = "SELECT l FROM LibroCategoria l WHERE l.id = :id"),
    @NamedQuery(name = "LibroCategoria.findByIdCategoria", query = "SELECT l FROM LibroCategoria l WHERE l.idCategoria = :idCategoria"),
    @NamedQuery(name = "LibroCategoria.findByIdLibro", query = "SELECT l FROM LibroCategoria l WHERE l.idLibro = :idLibro")})
public class LibroCategoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCategoria")
    private int idCategoria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idLibro")
    private int idLibro;

    public LibroCategoria() {
    }

    public LibroCategoria(Integer id) {
        this.id = id;
    }

    public LibroCategoria(Integer id, int idCategoria, int idLibro) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.idLibro = idLibro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LibroCategoria)) {
            return false;
        }
        LibroCategoria other = (LibroCategoria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.itschapala.sistemas.biblioteca.modelo.LibroCategoria[ id=" + id + " ]";
    }
    
}
