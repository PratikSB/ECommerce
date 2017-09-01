package com.ecommerce.entity;
// Generated 8 Aug, 2017 10:53:27 AM by Hibernate Tools 5.2.3.Final

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.stereotype.Component;


/**
 * Category generated by hbm2java
 */
@Entity
@Table(name = "category", catalog = "e_commerce_1")
@Component
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long categoryId;
	private String categoryName;
	private String imageUrl;
	/*private Set<SubCategory> subCategories = new HashSet<SubCategory>(0);*/

	public Category() {
	}


	@Id
	@Column(name = "categoryId", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "categoryName", length = 50)
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Column(name = "imageURL", length = 100)
	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/*@OneToMany(fetch = FetchType.EAGER, mappedBy = "category")
	public Set<SubCategory> getSubCategories() {
		return this.subCategories;
	}

	public void setSubCategories(Set<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}*/

	
}
