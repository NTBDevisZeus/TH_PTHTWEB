/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ntb.hibernatedemo;

import com.ntb.pojo.Cart;
import com.ntb.pojo.Category;
import com.ntb.repository.impl.CategoryRepositoryImpl;
import com.ntb.repository.impl.ProductReponsitoryImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
        List<Cart> carts = new ArrayList<>();
        
//        CategoryRepositoryImpl s = new CategoryRepositoryImpl();
//        s.getCates().forEach(c -> System.out.println(c.getName()));
//        Map<String, String> params = new HashMap<>();
////        params.put("q", "iPhone");
//        params.put("page", "2");
//        
//        ProductReponsitoryImpl s = new ProductReponsitoryImpl();
//        s.getProducts(params).forEach(p -> System.out.printf("%s - %.1f\n",p.getName(),p.getPrice()));
    }
}
