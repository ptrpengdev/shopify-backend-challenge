package shopify.challenge.shengwei.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import shopify.challenge.shengwei.entity.Location;

@Repository
public interface LocationRepo extends JpaRepository<Location, Integer>{

	public Location findByLocation(String location);
	
}
