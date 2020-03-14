package com.ecommerce.microcommerce.model;

public class ProductAdmin {


    private String produit;
    private int marge;

    public ProductAdmin() {
    }

    public ProductAdmin(String produit, int marge) {
        this.produit = produit;
        this.marge = marge;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String porduit) {
        this.produit = porduit;
    }

    public int getMarge() {
        return marge;
    }

    public void setMarge(int marge) {
        this.marge = marge;
    }

    @Override
    public String toString() {
        return "ProductAdmin{" +
                "produit='" + produit + '\'' +
                ", marge=" + marge +
                '}';
    }
}
