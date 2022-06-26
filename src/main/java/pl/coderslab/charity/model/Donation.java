package pl.coderslab.charity.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table
public class Donation {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;


    private Integer quantity;



//    private Category category;



//    private Institution institution;


    private String street;


    private String city;


    private String zipCode;


    private LocalDate pickUpDate;


    private LocalTime pickUpTime;


    private String pickUpComment;









}
