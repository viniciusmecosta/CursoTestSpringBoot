package com.curso.user.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import java.io.Serializable;
import java.util.UUID;


@RequiredArgsConstructor @NoArgsConstructor //Lombok Constructors
@Getter @Setter @ToString //Lombok Getters e Setters
@Entity @Table(name = "users") //JPA
public class UserModel implements Serializable {

    //Propriedade de Serializable
    private static final long serialVersionUID = 1L;

    //Propriedades
    @Id @GeneratedValue(strategy = GenerationType.UUID) //JPA
    @Column(name = "id_user", nullable = false) //JPA
    private UUID userId;

    @Column(nullable = false, columnDefinition = "varchar(50)") //JPA
    //@NotBlank //Validation
    @NonNull //Lombok
    private String name;

    @Column(nullable = false, columnDefinition = "varchar(70)") //JPA
    //@NotBlank @Email //Validation
    @NonNull //Lombok
    private String mail;
}
