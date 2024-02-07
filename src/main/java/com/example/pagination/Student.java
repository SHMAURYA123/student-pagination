package com.example.pagination;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    private String name;
    private int rollNo;


}
