package com.supermarketTwo.supermarketTwo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {
    
    List<Item> findByCategory(String category);

    List<Item> findByPriceLessThan(Double price);

    List<Item> findByDiscountGreaterThan(Double discount);

    List<Item> findByDate(Date date);


}
