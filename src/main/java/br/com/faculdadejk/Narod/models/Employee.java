package br.com.faculdadejk.Narod.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Setter
@Getter
@Table
@NoArgsConstructor
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column("id")
    private Long id;

    @Column("name")
    private String name;

    @Column("cpf")
    private String cpf;

    @Column("date_birth")
    private Date dateBirth;

    @Column("team")
    private String team;

    @Column("function")
    private String function;

    @Column("email")
    private String email;

    @Column("password")
    private String password;

    @Column("phone_number")
    private Long phoneNumber;

    @Column("status")
    private Boolean status;


}
