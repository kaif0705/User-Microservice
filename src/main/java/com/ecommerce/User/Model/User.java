package com.ecommerce.User.Model;

import com.ecommerce.User.Enums.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table( name= "users",
        uniqueConstraints= {
                @UniqueConstraint(columnNames= "username"),
                @UniqueConstraint(columnNames= "email")
        }
)
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name= "user_id")
    private Long id;

    @NotBlank
    @Size(max = 20)
    @Column(name= "first_name")
    private String firstName;

    @NotBlank
    @Size(max = 20)
    @Column(name= "last_name")
    private String lastName;

    @Size(max = 120)
    @Column(name= "password")
    private String password;

    @NotBlank
    @Size(max = 50)
    @Email
    @Column(name= "email")
    private String email;

    @NotBlank
    @Column(name= "phone")
    private String phone;

    @Column(name= "zipcode")
    private String zipcode;

    public User(String firstName, String lastName, String email, String password) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
    }

    private UserRole role= UserRole.USER;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}
