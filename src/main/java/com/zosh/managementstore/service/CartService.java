package com.zosh.managementstore.service;

import com.zosh.managementstore.exception.ProductException;
import com.zosh.managementstore.modal.Cart;
import com.zosh.managementstore.modal.User;
import com.zosh.managementstore.request.AddItemRequest;

public interface CartService {
    public Cart createCart(User user);
    public String addCartItem(Long userId, AddItemRequest req) throws ProductException;
    public Cart findUserCart(Long userId);
}
