package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Habitacion;

@Controller
public class HabitacionController {
	
	@GetMapping({ "/index", "/" })
	public ModelAndView recibirCodigo() {
		
		Habitacion habit = new Habitacion();
		
		
		ModelAndView modelView = new ModelAndView("index");
		
		modelView.addObject("habit", habit); 
		
		return modelView;
	}
	
	@PostMapping("/verHabitaciones")
	public ModelAndView verHabitaciones(@ModelAttribute("habit") Habitacion habit ) {
		
		ModelAndView modelView = new ModelAndView("listadoHabitaciones");
		return modelView;
		//System.out.println();
	}

	}