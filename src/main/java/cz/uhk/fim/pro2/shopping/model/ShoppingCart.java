package cz.uhk.fim.pro2.shopping.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int cartId;
    private List<Child> childList;
    private double vat;
    private double subtotal;
    private double total;

    public ShoppingCart() {
        this.childList = new ArrayList<>();
    }

    public ShoppingCart(int cartId, List<Child> childList, double vat, double subtotal, double total) {
        this.cartId = cartId;
        this.childList = childList;
        this.vat = vat;
        this.subtotal = subtotal;
        this.total = total;
    }

    public void addChild(Child child) {
        this.childList.add(child);
    }

    public void removeChild(Child child) {
        this.childList.remove(child);
    }

    public void removeChild(int index) {
        this.childList.remove(index);
    }

    public void clearCart() {
        this.childList.clear();
    }

    public int getChildCount() {
        return childList.size();
    }

    public double calculateTotal() {
        System.out.println(this.calculateSubtotal());
        System.out.println((1+vat));
        return this.calculateSubtotal() * (1 + vat);
    }

    public double calculateSubtotal() {
        double sum = 0.0;
        for (Child child : this.childList) {
            sum += child.getPrice();
        }
        return sum;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartId=" + cartId +
                ", childList=" + childList +
                ", vat=" + vat +
                ", subtotal=" + subtotal +
                ", total=" + total +
                '}';
    }
}
