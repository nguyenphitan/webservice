package com.nguyenphitan.taco.repository;

import org.springframework.data.repository.CrudRepository;

import com.nguyenphitan.taco.entity.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
