/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllers;

/**
 *
 * @author yonay
 */
public class ProductCommand extends FrontCommand {
    
    public void process(){
        Product product = Product.find(req.getParameter("name"));
        req.setAttribute("mensaje",  )
    }
}
