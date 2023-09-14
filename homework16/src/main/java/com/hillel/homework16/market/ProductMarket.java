package com.hillel.homework16.market;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {
    private List<Product> productList;

    public ProductMarket(List<Product> productList) {
        this.productList = productList;
    }

    public List<String> printProductNames() {
        return productList.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }

    public List<String> printSortedProductNames() {
        return productList.stream()
                .map(Product::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Integer> printSortedProductByPrice() {
        return productList.stream()
                .map(Product::getPrice)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Integer> printProductPriceOver100() {
        return productList.stream()
                .map(Product::getPrice)
                .filter(product1 -> product1 > 100)
                .collect(Collectors.toList());
    }

    public List<Integer> printProductPriceLessThan50() {
        return productList.stream()
                .map(Product::getPrice)
                .filter(product1 -> product1 < 50)
                .collect(Collectors.toList());
    }

    public List<String> printProductPriceAsString() {
        return productList.stream()
                .map(Product::getPrice)
                .map(String::valueOf)
                .collect(Collectors.toList());
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