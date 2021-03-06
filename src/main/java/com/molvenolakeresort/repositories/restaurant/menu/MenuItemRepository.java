package com.molvenolakeresort.repositories.restaurant.menu;

import com.molvenolakeresort.models.restaurant.menu.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long>{
}