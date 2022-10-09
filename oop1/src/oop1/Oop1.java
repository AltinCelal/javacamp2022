/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop1;

/**
 *
 * @author Celal
 */
public class Oop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("delonghi kahve makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");
        
        Product product2 = new Product();
        product2.setName("smoth kahve makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image1.jpg");
        
        Product product3 = new Product();
        product3.setName("vestel kahve makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image1.jpg");
        
        Product[] products = {product1, product2, product3};
        
        for (Product product : products)//product a herhangi bir isim verilebilir.
        {
            System.out.println(product.getName());
        }
        IndividualCustomer individualCustomer = new IndividualCustomer();        
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("0555555522");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demiroğ");
        
        CorporateCustomer comporateCustomer = new CorporateCustomer();
        comporateCustomer.setId(2);
        comporateCustomer.setCompanyName("Kodlama.io");
        comporateCustomer.setCustomerNumber("33");
        comporateCustomer.setPhone("053333330");
        comporateCustomer.setTaxNumber("11111111111");
        
        Customer[] customers = {individualCustomer,comporateCustomer};
        
    } 
    
}
