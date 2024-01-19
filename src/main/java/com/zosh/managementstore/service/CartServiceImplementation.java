package com.zosh.managementstore.service;

import com.zosh.managementstore.exception.ProductException;
import com.zosh.managementstore.modal.Cart;
import com.zosh.managementstore.modal.User;
import com.zosh.managementstore.request.AddItemRequest;

public class CartServiceImplementation implements CartService{
    @Override
    public Cart createCart(User user) {
        return null;
    }

    @Override
    public String addCartItem(Long userId, AddItemRequest req) throws ProductException {
        return null;
    }

    @Override
    public Cart findUserCart(Long userId) {
        return null;
    }
}
