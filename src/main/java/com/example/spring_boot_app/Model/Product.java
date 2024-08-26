package com.example.spring_boot_app.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int product_id;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "category_id")
    private int category_id;

    @Column(name = "vendor_id")
    private int vendor_id;

    @Column(name = "product_img")
    private String product_img;

    @Column(name = "product_descrip")
    private String product_descrip;

    @Column(name = "product_price")
    private float product_price;

    @Column(name = "product_quantity")
    private int product_quantity;

    @JoinColumn(name = "category_id",insertable = false,updatable = false)
    @JsonBackReference(value = "categorys-products")
    @ManyToOne
    private Category category;

    @JoinColumn(name = "vendor_id",insertable = false,updatable = false)
    @JsonBackReference(value = "vendors-products")
    @ManyToOne
    private Vendor vendor;
}
