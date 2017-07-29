package pe.app.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import pe.app.validator.*;
import pe.app.validator.Text.*;

@Entity
@Table(name="Alumnos")
public class Alumno 
{
	@Id
	@TableGenerator(name="TGenerator",initialValue=1020,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE,generator="TGenerator")
	private Long id_alumno;
	
	@Column
	@Text(value=TextType.LETTERS,message="Ingrese nombre (solo letras).")
	private String nombre;
	
	@Column
	@NotNull(message="Seleccion sexo.")
	private Character sexo;
	
	@Column
	@NotNull(message="Ingrese pensión (solo numérico con punto decimal).")
	private Double pension;
	
	public Alumno() {
	}

	public Long getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(Long id_alumno) {
		this.id_alumno = id_alumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Double getPension() {
		return pension;
	}

	public void setPension(Double pension) {
		this.pension = pension;
	}
}
