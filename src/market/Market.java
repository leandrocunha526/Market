/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package market;

/**
 *
 * @author leand
 */
public class Market {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product product1 = new Product("Arroz", 10.50);
        Product product2 = new Product("Feijão", 8.0);
        ShopCart shopCart = new ShopCart();
        shopCart.addItem(product1, 5);
        shopCart.addItem(product2, 6);
        double totalPay = shopCart.calcTotal();
        Client client1 = new Client("João", "joão@email.com");
        System.out.println("Cliente: " + client1.name + " (" + client1.email + ")");
        System.out.println("Itens do carrinho: ");
        for(ItemCart item: shopCart.items){
            System.out.println("Nome: " + item.product.name);
            System.out.println("Preço: " + item.product.price);
        }
        System.out.println("Total a pagar: " + totalPay);
    }
    
}
