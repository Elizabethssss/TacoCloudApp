package com.elizabeth.taco.tacocloud.data;

import com.elizabeth.taco.tacocloud.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
