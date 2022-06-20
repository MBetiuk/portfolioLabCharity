package pl.coderslab.charity.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Category {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String name;


}
