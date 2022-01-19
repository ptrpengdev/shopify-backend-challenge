package shopify.challenge.shengwei.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import shopify.challenge.shengwei.entity.Inventory;
import shopify.challenge.shengwei.entity.Location;
import shopify.challenge.shengwei.service.InventoryService;

@Controller
public class InventoryController {

	@Autowired
	InventoryService inventoryService;

	@GetMapping(value = "/index")
	public String index(Model model) {
		model.addAttribute("listOfInventory", inventoryService.getAllInventoryItems());
		return "index";
	}

	@GetMapping("/showNewInventoryForm")
	public String showNewEmployeeForm(ModelMap model) {
		// create model attribute to bind form data
		Inventory item = new Inventory();
		model.addAttribute("inventory", item);
		model.addAttribute("locations", inventoryService.getLocations());
		return "new_inventory";
	}

	@PostMapping(value = "/addNewInventoryItem")
	public String addNewInventoryItem(@ModelAttribute("inventory") @Valid Inventory item, BindingResult bindingResult, ModelMap model) throws Exception {
		if (bindingResult.hasErrors()) {
			model.addAttribute("locations", inventoryService.getLocations());
			return "new_inventory";
		}
		inventoryService.addNewInventoryItem(item);
		return "redirect:/index";
	}

	@GetMapping(value = "/getLocations")
	public List<Location> getLocations() throws Exception {
		return inventoryService.getLocations();
	}

	@GetMapping(value = "/updateInventoryForm/{id}")
	public String updateInventoryForm(@PathVariable(value = "id") Integer id, ModelMap model) throws Exception {
		Inventory inventory = inventoryService.getInventoryById(id);
		model.addAttribute("inventory", inventory);
		model.addAttribute("locations", inventoryService.getLocations());
		return "update_inventory";
	}
	
	@PostMapping(value = "/updateNewInventoryItem")
	public String updateNewInventoryItem(@Valid Inventory item, BindingResult bindingResult, ModelMap model) throws Exception {
		if (bindingResult.hasErrors()) {
			model.addAttribute("locations", inventoryService.getLocations());
			return "update_inventory";
		}
		inventoryService.updateNewInventoryItem(item);
		return "redirect:/index";
	}

	
	@GetMapping(value = "/deleteInventory/{id}")
	public String deleteInventory(@PathVariable(value = "id") Integer id) throws Exception {
		inventoryService.deleteInventoryById(id);
		return "redirect:/index";
	}

	@GetMapping(value ="/showNewLocationForm")
	public String createNewLocation(Model model) throws Exception {
		Location item = new Location();
		model.addAttribute("location", item);
		return "new_location";
	}
	
	@PostMapping(value ="/saveNewLocation")
	public String createNewLocation(String location) throws Exception {
		inventoryService.saveLocationByName(location);
		return "redirect:/index";
	}
	@GetMapping(value = "/error")
	public String errorPage() throws Exception {
		return "error";
	}

}
