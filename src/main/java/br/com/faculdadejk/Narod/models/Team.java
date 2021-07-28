package br.com.faculdadejk.Narod.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Setter
@Getter
@Table
@NoArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column("")
    private Long id;

    @Column("")
    private String name;

    @Column("")
    private String description;

    @Column("")
    private List<Post> posts;

    @Column("")
    private List<Employee> employeeList;
}
