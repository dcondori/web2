package pe.app.service;

import java.util.*;
import pe.app.model.*;

public interface AlumnoService 
{
	public abstract void insert(Alumno alumno);
	public abstract void update(Alumno alumno);
	public abstract void delete(Long id_alumno);
	public abstract Alumno findById(Long id_alumno);
	public abstract Collection<Alumno> findAll();
	public abstract boolean isExist(Long id_alumno);
}
