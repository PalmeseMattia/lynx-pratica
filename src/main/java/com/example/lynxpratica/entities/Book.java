package com.example.lynxpratica.entities;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="book")
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "price")
	private BigDecimal price;
	
	@Column(name = "stock")
	private Integer stock;

	@ManyToOne
	@JsonIgnore
	private Category category;
	
	@ManyToMany(mappedBy = "wishList")
	@JsonIgnore
	private List<User> list;

}
