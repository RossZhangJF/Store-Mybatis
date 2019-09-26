package com.store.dao;

import com.store.entry.WebShop;

import java.util.List;

public interface WebShopDaoMapper {
    public List<WebShop> getWebShop();
    public List<WebShop> getWebShopLimit();
}
