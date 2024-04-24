package es.jpa.hibernate.example.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.id.IntegralDataTypeHolder;

@Entity
@Table(name = "aula")
public class Aula implements Serializable{
    private static final long serialVersionUID = -7250234396452258822L;
    @Id
    @GeneratedValue( strategy = GenerationType.Auto)
    @Column(name = "id_person")
	private Integer id;
}
