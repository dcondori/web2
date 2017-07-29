package pe.app.controller;

import java.util.*;
import javax.servlet.http.*;
import javax.validation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;
import pe.app.model.*;
import pe.app.service.*;

@Controller
public class AlumnoController 
{
	@Autowired
	@Qualifier("alumnoServiceImpl")
	private AlumnoService service;
	
	public AlumnoController() {}
	
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	public String insertGET(Model model) {
		model.addAttribute("alumno",new Alumno());
		return "insert";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insertPOST(@Valid Alumno alumno,Errors errors) {
		
		if(errors.hasErrors())
			return "insert";
		
		service.insert(alumno);
		return "redirect:/insert";
	}
	
	@RequestMapping(value="/findById",method=RequestMethod.GET)
	public String findByIdGET(Model model) {
		model.addAttribute("alumno",new Alumno());
		return "findById";
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/findById",method=RequestMethod.POST,params="btnBuscar")
	public String findById_buscarPOST(Model model,Map map,HttpServletRequest request) {
		
		String id_alumnoCad=request.getParameter("id_alumno");
		
		if(id_alumnoCad.trim().length()!=0)
		{
			try 
			{
				Long id_alumno=Long.parseLong(id_alumnoCad);
				
				if(service.isExist(id_alumno))
				{
					model.addAttribute("alumno",service.findById(id_alumno));
					return "findById";
				}
			}
			catch(Exception e) {}
		}
		
		return "error_id";
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/findById",method=RequestMethod.POST,params="btnGuardar")
	public String findById_guardarPOST(Model model,Map map,HttpServletRequest request,@Valid Alumno alumno,Errors errors) {
		
		String id_alumnoCad=request.getParameter("id_alumno");
		
		if(id_alumnoCad.trim().length()!=0)
		{
			try 
			{
				Long id_alumno=Long.parseLong(id_alumnoCad);
				
				if(service.isExist(id_alumno))
				{
					if(errors.hasErrors())
						return "findById";
					
					service.update(alumno);		
					return "redirect:/findById";
				}
			}
			catch(Exception e) {}
		}
		
		return "error_id";
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/findById",method=RequestMethod.POST,params="btnEliminar")
	public String findById_eliminarPOST(Model model,Map map,HttpServletRequest request) {
		
		String id_alumnoCad=request.getParameter("id_alumno");
		
		if(id_alumnoCad.trim().length()!=0)
		{
			try 
			{
				Long id_alumno=Long.parseLong(id_alumnoCad);
				
				if(service.isExist(id_alumno))
				{
					service.delete(id_alumno);
					return "redirect:/findById";
				}
			}
			catch(Exception e) {}
		}
		
		return "error_id";
	}
	
	@SuppressWarnings({"unchecked","rawtypes"})
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public String findAllGET(Map map) {
		map.put("key_findAll",service.findAll());
		return "findAll";
	}
	
	@RequestMapping(value="/findAll/edit/{id_alumno}",method=RequestMethod.GET)
	public String findAll_editarGET(Model model,@PathVariable("id_alumno") Long id_alumno) {
		model.addAttribute("alumno",service.findById(id_alumno));
		return "edit";
	}
	
	@RequestMapping(value="/findAll/edit/{id_alumno}",method=RequestMethod.POST)
	public String findAll_editarPOST(@Valid Alumno alumno,Errors errors) {
		
		if(errors.hasErrors())
			return "edit";
		
		service.update(alumno);
		return "redirect:/findAll";
	}
	
	@RequestMapping(value="/findAll/delete/{id_alumno}",method=RequestMethod.GET)
	public String findAll_eliminarGET(@PathVariable("id_alumno") Long id_alumno) {
		service.delete(id_alumno);
		return "redirect:/findAll";
	}
}
