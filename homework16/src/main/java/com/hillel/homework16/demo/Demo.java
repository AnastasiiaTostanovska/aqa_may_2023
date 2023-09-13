package com.hillel.homework16.demo;

import com.hillel.homework16.market.Product;
import com.hillel.homework16.market.ProductMarket;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Grape", 89));
        productList.add(new Product("Mango", 112));
        productList.add(new Product("Avocado",150));
        productList.add(new Product("Watermelon",22));
        productList.add(new Product("Apple",15));

        ProductMarket miniMarket = new ProductMarket(productList);
        System.out.println(miniMarket.printProductNames());
        System.out.println(miniMarket.printSortedProductNames());
        System.out.println(miniMarket.printProductPriceOver100());
        System.out.println(miniMarket.printProductPriceLessThan50());
        System.out.println(miniMarket.printProductPriceAsString());

    }
}