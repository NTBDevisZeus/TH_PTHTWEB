/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntb.repository.impl;

import com.ntb.hibernatedemo.HibernateUtils;
import com.ntb.pojo.Cart;
import com.ntb.pojo.OrderDetail;
import com.ntb.pojo.SaleOrder;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class ReceiptRepositoryImpl {

    private static final UserRepositoryImpl u = new UserRepositoryImpl();
    private static final ProductReponsitoryImpl pr = new ProductReponsitoryImpl();
    public void addReceipt(List<Cart> carts) {
        if (carts != null) {
            try ( Session s = HibernateUtils.getFactory().openSession()) {
                SaleOrder order = new SaleOrder();
                order.setUserId(u.getUserByUsername("dhthanh"));
                s.save(order);
                
                for (var c: carts) {
                    OrderDetail d = new OrderDetail();
                    d.setUnitPrice(c.getUnitPrice());
                    d.setQuantity(c.getQuanlity());
                    d.setProductId(pr.getProductById(c.getId()));
                    d.setOrderId(order);
                }
            }

        }
    }
}
