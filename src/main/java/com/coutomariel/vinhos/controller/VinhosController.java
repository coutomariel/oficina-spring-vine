package com.coutomariel.vinhos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coutomariel.vinhos.model.TipoVinho;
import com.coutomariel.vinhos.model.Vinho;

@Controller
public class VinhosController {

	@GetMapping("/vinhos/novo")
	public ModelAndView novo(){
		ModelAndView mv = new ModelAndView("vinho/cadastro-vinho");
		mv.addObject("vinho", new Vinho());
		mv.addObject("tipos", TipoVinho.values());
		return mv;
	}
	
	@PostMapping("/vinhos/novo")
	public String salvar(Vinho vinho){
		return "vinho/cadastro-vinho";
	}
}
