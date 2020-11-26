package com.unab.desarrollo.springdata.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.unab.desarrollo.springdata.DAO.PersonaDao;

@Controller
public class ControllerPersona {
	
	@Autowired
	private PersonaDao personadao;
	
	@GetMapping("/")
	public String inicio() {
		var personas = personadao.findAll();
		
		for(var consulta : personas) {
			
			System.out.print(consulta.getNombre());
		}
		return"index";
	}

}
