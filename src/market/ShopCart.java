/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package market;
import java.util.*;
/**
 *
 * @author leand
 */
public class ShopCart {
    List<ItemCart> items = new ArrayList<>();
    
    public void addItem(Product product, int quantity) {
        items.add(new ItemCart(product, quantity));
    }
    public double calcTotal(){
        double total = 0;
        for(ItemCart item : items) {
            total += item.product.price * item.amount;
        }
        return total;
    }
}
