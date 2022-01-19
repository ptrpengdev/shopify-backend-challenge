package shopify.challenge.shengwei.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import shopify.challenge.shengwei.entity.Inventory;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Integer>{

}
