package shopify.challenge.shengwei.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopify.challenge.shengwei.entity.Inventory;
import shopify.challenge.shengwei.entity.Location;
import shopify.challenge.shengwei.repository.InventoryRepo;
import shopify.challenge.shengwei.repository.LocationRepo;
import shopify.challenge.shengwei.service.InventoryService;

@Service
@Transactional
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	InventoryRepo inventoryRepo;

	@Autowired
	LocationRepo locationRepo;



	@Override
	public List<Inventory> getAllInventoryItems() {
		List<Inventory> result = inventoryRepo.findAll();
		return result;
	}

	@Override
	public Inventory addNewInventoryItem(Inventory data) {
		data.setCreatedDt(new Date());
		return inventoryRepo.save(data);
	}

	@Override
	public List<Location> getLocations() {
		return locationRepo.findAll();
	}

	@Override
	public Inventory getInventoryById(Integer id) {
		return inventoryRepo.findById(id).get();
	}

	@Override
	public void deleteInventoryById(Integer id) {
		inventoryRepo.deleteById(id);
	}

	@Override
	public void saveLocationByName(String locationStr) {
		Location result = locationRepo.findByLocation(locationStr);
		if(result == null) {
			Location location = new Location();
			location.setLocation(locationStr);
			locationRepo.save(location);
		}
		
		
	}

	@Override
	public void updateNewInventoryItem(Inventory item) {
		Optional<Inventory> result = inventoryRepo.findById(item.getId());
		if(result.isPresent()) {
			Inventory original = result.get();
			original.setProdDesc(item.getProdDesc());
			original.setProdName(item.getProdDesc());
			original.setProdType(item.getProdType());
			original.setLocation(item.getLocation());
			original.setQuantity(item.getQuantity());
			original.setUpdateDt(new Date());
			inventoryRepo.save(original);
		}
	}



}
