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

    @Column
    private Integer quantity;

    @Column
    // TODO: 20/06/2022 - pamiętaj o odpowiedniej adnotacji????
    private Category category;

    @Column
    // TODO: 20/06/2022 - pamiętaj o odpowiedniej adnotacji????
    private Institution institution;

    @Column
    private String street;

    @Column
    private String city;

    @Column
    private String zipCode;

    @Column
    private LocalDate pickUpDate;

    @Column
    private LocalTime pickUpTime;

    @Column
    private String pickUpComment;









}
