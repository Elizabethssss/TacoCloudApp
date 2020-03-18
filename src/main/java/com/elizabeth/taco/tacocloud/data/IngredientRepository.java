package com.elizabeth.taco.tacocloud.data;

import com.elizabeth.taco.tacocloud.entity.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
