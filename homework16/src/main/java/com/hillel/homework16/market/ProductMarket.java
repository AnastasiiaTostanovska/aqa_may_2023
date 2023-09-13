package com.hillel.homework16.market;

import com.hillel.homework16.market.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMarket {
    private List<Product> productList;

    public ProductMarket(List<Product> productList) {
        this.productList = productList;
    }

    public ArrayList<String> printProductNames(){
        ArrayList<String> allProductNames = new ArrayList<>();
        for(Product product: productList){
            allProductNames.add(product.getName());
        }
        return allProductNames;
    }
    public ArrayList<String> printSortedProductNames(){
        ArrayList<String> sortedProductNames = new ArrayList<>();
        for(Product product: productList){
            sortedProductNames.add(product.getName());
        }
        Collections.sort(sortedProductNames);
        return sortedProductNames;
    }
    public ArrayList<Integer> printProductPriceOver100(){
        ArrayList<Integer> productPriceOver100 = new ArrayList<>();
        for(Product product: productList){
            if (product.getPrice() >100) {
                productPriceOver100.add(product.getPrice());
            }
        }
        return productPriceOver100;
    }
    public ArrayList<Integer> printProductPriceLessThan50(){
        ArrayList<Integer> productPriceLessThan50 = new ArrayList<>();
        for(Product product: productList){
            if (product.getPrice() < 50) {
                productPriceLessThan50.add(product.getPrice());
            }
        }
        return productPriceLessThan50;
    }
    public ArrayList<String> printProductPriceAsString(){
        ArrayList<String> productPriceAsString = new ArrayList<>();
        for(Product product: productList){
            productPriceAsString.add(String.valueOf(product.getPrice()));
        }
        return productPriceAsString;
    }

    public List<Product> getProductList() {
        return productList;
    }
    @Override
    public String toString() {
        return "ProductMarket{" +
                "productList=" + productList +
                '}';
    }
}