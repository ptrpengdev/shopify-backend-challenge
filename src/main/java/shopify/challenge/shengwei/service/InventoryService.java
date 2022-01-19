package shopify.challenge.shengwei.service;

import java.util.List;

import shopify.challenge.shengwei.entity.Inventory;
import shopify.challenge.shengwei.entity.Location;

public interface InventoryService {

	public List<Inventory> getAllInventoryItems();

	public Inventory addNewInventoryItem(Inventory data);

	public List<Location> getLocations();

	public Inventory getInventoryById(Integer id);

	public void deleteInventoryById(Integer id);

	public void saveLocationByName(String location);

	public void updateNewInventoryItem(Inventory item);

	
}
