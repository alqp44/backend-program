package me.ksm.springdeveloper;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor
@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", updatable = false)
    private Long id;
    @Column(name="name", nullable = false)
    @Setter(AccessLevel.PUBLIC)
    private String name;

    public Member(String name) {
        this.name = name;
    }


}
