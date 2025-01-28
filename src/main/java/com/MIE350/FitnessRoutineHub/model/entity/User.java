package com.MIE350.FitnessRoutineHub.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    private Long id;

    private String username;

    private String description;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    @Column(nullable = false)
    private Instant createdAt;

    private Instant updateAt;

}
