package com.store.dao;

import com.store.entry.Page;
import com.store.entry.WebShop;

import java.util.List;

public interface PageDaoMapper {
    public List <Page<WebShop>> getPagePaging(Integer pageStart);
}
