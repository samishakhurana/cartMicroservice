package com.eCommerce.cart.entity;

import javax.persistence.*;


@Entity @IdClass(PrimaryKey.class)
@Table(name= "Cart")
public class CartEntity {
    @Id

    private int productId;
    @Id
    @Column(name="merchantId")
    private int merchantId;
    @Id
    private int userId;

    private int quantity;

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String productname;
    private String imgurl;
    private int price;

    @Override
    public String toString() {
        return "CartEntity{" +
                "productId=" + productId +
                ", merchantId=" + merchantId +
                ", userId=" + userId +
                ", quantity=" + quantity +
                '}';
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


//    public int getProductId() {
//        return productId;
//    }
//
//    public void setProductId(int productId) {
//        this.productId = productId;
//    }
//
//    public int getMerchantId() {
//        return merchantId;
//    }
//
//    public void setMerchantId(int merchantId) {
//        this.merchantId = merchantId;
//    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }
}
