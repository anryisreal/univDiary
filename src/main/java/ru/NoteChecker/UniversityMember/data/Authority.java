/*
package ru.NoteChecker.UniversityMember.data;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "authorities")
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String authority;

    public Authority() {}

    public Authority(String username, String authority) {
        this.username = username;
        this.authority = authority;
    }
}*/
