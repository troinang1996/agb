package com.laptrinh.config;

import com.laptrinh.dao.IProductDAO;
import com.laptrinh.service.ICookieService;
import com.laptrinh.service.IProductService;
import com.laptrinh.dao.impl.ImplProductDAO;
import com.laptrinh.service.impl.ImplProductService;
import com.laptrinh.repository.ProductRepositoryJPA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Config {
    @Bean
    public IProductService productService(IProductDAO productDAO, ICookieService cookieService){
        return new ImplProductService(productDAO, cookieService);

    }
    @Bean
    public IProductDAO productDAO(ProductRepositoryJPA productRepositoryJPA){
        return new ImplProductDAO(productRepositoryJPA);
    }
}
