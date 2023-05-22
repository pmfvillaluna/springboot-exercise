package com.exist.ecc.core.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_person_id")
    private Name name;
    @Column(name = "address")
    private List<Address> address;
    @Column
    private Date birthday;
    @Column
    private double gwa;
    @Column(name = "date_hired")
    private Date dateHired;
    @Column
    private boolean employed;

    @OneToOne
    @JoinColumn(name = "fk_contact_info")
    private ContactInformation contactInformation;
    @ManyToMany
    @JoinTable(
            name = "person_roles",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"
            )
    )
    private List<Role> role;

}
