package io.watts.SpringZapierDemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by iyasuwatts on 11/8/17.
 */
@Entity
@Table(name = "people")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @Setter
    @Getter
    private Integer id;

    @Column(name = "first_name")
    @Setter
    @Getter
    private String firstName;

    @Column(name = "last_name")
    @Setter
    @Getter
    private String lastName;

    @Column(name = "phone")
    @Setter
    @Getter
    private String phone;

    @Column(name = "email")
    @Setter
    @Getter
    private String email;


    public Person(){

    }


}
