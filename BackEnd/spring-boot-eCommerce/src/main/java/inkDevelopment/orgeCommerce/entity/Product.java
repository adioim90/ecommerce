package inkDevelopment.orgeCommerce.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="product")
@Data
public class Product {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(name="Id")
private Long id;

@Column(name="sku")
private String sku;

@Column(name="name")
private String name;

@Column(name="description")
private String description;

@Column(name="unitPrice")
private BigDecimal unitPrice;

@Column(name="unitsInStock")
private BigDecimal unitsInStock;

@Column(name="imageUrl")
private String imageUrl;

@Column(name="active")
private boolean active;

@Column(name="date_created")
@CreationTimestamp
private Date dateCreated;

@Column(name="last_updated")
@UpdateTimestamp
private Date lastUpdated;

@ManyToOne
@JoinColumn(name="category_id",nullable=false)
private ProductCategory category;
}
