package com.vegetable.mgmt.repository;

import java.util.List;

import com.vegetable.mgmt.entities.CartDTO;
import com.vegetable.mgmt.entities.VegetableDTO;

public interface ICartRepository {

	public VegetableDTO addToCart(VegetableDTO item);
	public VegetableDTO updateItemQuantity(VegetableDTO id,int quantity);
	public List<VegetableDTO> viewAllItems(CartDTO cart);
	public CartDTO removeAllItems(CartDTO cart);
	
}
