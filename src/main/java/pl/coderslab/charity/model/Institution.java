package pl.coderslab.charity.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Institution {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String description;


}
