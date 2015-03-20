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
@Table(name = "AutorLibro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AutorLibro.findAll", query = "SELECT a FROM AutorLibro a"),
    @NamedQuery(name = "AutorLibro.findById", query = "SELECT a FROM AutorLibro a WHERE a.id = :id"),
    @NamedQuery(name = "AutorLibro.findByIdAutor", query = "SELECT a FROM AutorLibro a WHERE a.idAutor = :idAutor"),
    @NamedQuery(name = "AutorLibro.findByIdLibro", query = "SELECT a FROM AutorLibro a WHERE a.idLibro = :idLibro")})
public class AutorLibro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAutor")
    private int idAutor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idLibro")
    private int idLibro;

    public AutorLibro() {
    }

    public AutorLibro(Integer id) {
        this.id = id;
    }

    public AutorLibro(Integer id, int idAutor, int idLibro) {
        this.id = id;
        this.idAutor = idAutor;
        this.idLibro = idLibro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
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
        if (!(object instanceof AutorLibro)) {
            return false;
        }
        AutorLibro other = (AutorLibro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.itschapala.sistemas.biblioteca.modelo.AutorLibro[ id=" + id + " ]";
    }
    
}
