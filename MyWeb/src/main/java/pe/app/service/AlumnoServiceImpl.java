package pe.app.service;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import pe.app.model.*;
import pe.app.repository.*;

@Service
public class AlumnoServiceImpl implements AlumnoService
{
	@Autowired
	private AlumnoRepository repository;
	
	public AlumnoServiceImpl() {}

	@Override
	@Transactional
	public void insert(Alumno alumno) {
		repository.save(alumno);
	}

	@Override
	@Transactional
	public void update(Alumno alumno) {
		repository.save(alumno);
	}

	@Override
	@Transactional
	public void delete(Long id_alumno) {
		repository.delete(findById(id_alumno));
	}

	@Override
	@Transactional(readOnly=true)
	public Alumno findById(Long id_alumno) {
		return repository.findOne(id_alumno);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Alumno> findAll() {
		return (Collection<Alumno>)repository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public boolean isExist(Long id_alumno) {
		return repository.exists(id_alumno);
	}
}
