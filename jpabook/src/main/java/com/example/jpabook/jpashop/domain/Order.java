package com.example.jpabook.jpashop.domain;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.*;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "ORDERS")
public class Order extends BaseEntity {
    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private Member member;
    @OneToMany(mappedBy = "order", cascade = ALL)
    private List<OrderItem> orderItem = new ArrayList<>();
    @OneToOne(fetch = LAZY, cascade = ALL)
    @JoinColumn(name = "DELIVERY_ID")
    private Delivery delivery;
    private LocalDateTime orderDate;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
}
