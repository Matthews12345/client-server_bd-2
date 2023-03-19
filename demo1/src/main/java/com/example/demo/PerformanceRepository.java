package com.example.demo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query; // JPQL is just an object-oriented way of defining queries based on entity attributes.
// JPQL uses the entity object model instead of database tables to define a query

import java.util.List;
public interface PerformanceRepository extends JpaRepository<Performance, Long> {
    @Query("select p from Performance p where concat(p.id, '', p.spectacle, '', p.cast_name, '', p.date_time, '', p.amount_of_tickets, '', p.available_tickets) like %?1%") // the concatted method parameter will be assigned to the query parameter with index 1.
    List<Performance> search(String keyword);
}
