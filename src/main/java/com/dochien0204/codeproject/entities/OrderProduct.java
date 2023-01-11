package com.dochien0204.codeproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_product")
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_product_id")
    private Integer orderProductId;

    private Integer total;

    private float totalPrice;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cart_item_id")
    private CartItem cartItem;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}