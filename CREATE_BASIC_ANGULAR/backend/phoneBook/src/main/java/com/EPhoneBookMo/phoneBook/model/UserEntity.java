package com.EPhoneBookMo.phoneBook.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phonebook_user_id")
    private Long id;


    @Column(name = "phonebook_user_name")
    private String name;

    @Column(name = "phonebook_user_email")
    private String email;

    @Column(name = "phonebook_user_image")
    private String image;

    @Column(name = "phonebook_user_number")
    private String number;

    @Column(name = "phonebook_user_address")
    private String address;
}
