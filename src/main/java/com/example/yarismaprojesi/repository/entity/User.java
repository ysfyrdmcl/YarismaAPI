package com.example.yarismaprojesi.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "tbluser")
@Entity
public class User extends SuperClass{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "user_name",nullable = false)
    String username;
    @Column(nullable = false)
    String password;

    @Enumerated(EnumType.STRING)
    @Column(name="role")
    UserType userType;

}
