package com.elizabeth.taco.tacocloud.data;

import com.elizabeth.taco.tacocloud.entity.Taco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacoRepository extends CrudRepository<Taco, Long> {
}
