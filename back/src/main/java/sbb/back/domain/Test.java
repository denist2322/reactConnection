package sbb.back.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String content;
}
