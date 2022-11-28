package com.dochien0204.codeproject.entities;

import com.dochien0204.codeproject.entities.base.AbstractAuditingEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
public class Book extends AbstractAuditingEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "book_id")
  private Integer bookId;

  private String bookName;

  private Integer available;

  private Double price;

  private String image;

  private String description;

  private String author;

  private String publisher;

  @OneToMany(mappedBy = "book")
  private List<CartItem> cartItems;

  @ManyToOne
  @JoinColumn(name = "catalog_id")
  private Catalog catalog;
}