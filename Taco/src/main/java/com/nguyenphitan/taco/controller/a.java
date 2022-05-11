package com.nguyenphitan.taco.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.client.RestTemplate;

public class DesignTacoController {
	private RestTemplate rest = new RestTemplate();

	@ModelAttribute
	public void addIngredientsToModel(Model model) {
		List<Ingredient> ingredients = Arrays.asList(rest.getForObject("http://localhost:8080/
		ingredients",Ingredient[].class));
		Type[] types = Ingredient.Type.values();
		for (Type type : types) {
			model.addAttribute(type.toString().toLowerCase(),
			
			filterByType(ingredients, type));
		}
	}
}
