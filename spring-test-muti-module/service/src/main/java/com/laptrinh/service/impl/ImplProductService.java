package com.laptrinh.service.impl;


import com.laptrinh.entities.Product;
import com.laptrinh.dao.IProductDAO;
import com.laptrinh.service.ICookieService;
import com.laptrinh.service.IProductService;

import java.util.List;


public class ImplProductService extends GeneralService<Product,Integer> implements IProductService {
    IProductDAO productDAO;

    ICookieService cookieService;

    public ImplProductService(IProductDAO productDAO, ICookieService cookieService) {
        this.productDAO = productDAO;
        this.cookieService = cookieService;
    }

    @Override
    public List<Product> findByKeywords(String keyWords) {
        return productDAO.findByKeywords(keyWords);
    }

    @Override
    public List<Product> findAllProductByCategory(int id) {
        return productDAO.findByCategoryId(id);
    }

    @Override
    public List<Product> findByHot(String key) {
        return productDAO.findItemByHot(key);
    }

    @Override
    public List<Product> getViewProduct(String name, String id) {
        String ids = cookieService.getCookieValue(name, id.toString());
        if (!ids.contains(id.toString())) {
            ids += "," + id.toString();
        }
        cookieService.createCookie(name, ids, 15);
        return productDAO.findByIdsInCookie(ids);
    }

    @Override
    public List<Product> getFaVoProduct(String name, String id) {
        String favos = cookieService.getCookieValue(name, "");
        if (favos.length() > 0)
        {
            return productDAO.findByIdsInCookie(favos);
        } else
            return null;
    }

    @Override
    public List<Product> findByIdsInCookie(String ids) {
        return productDAO.findByIdsInCookie(ids);
    }
}
