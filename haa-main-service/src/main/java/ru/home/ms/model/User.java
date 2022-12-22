package ru.home.ms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity (name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    public static final String ID_COLUMN_NAME = "user_id";
    public static final String NAME_COLUMN_NAME = "name";

    @Id
    @Column(name = ID_COLUMN_NAME)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = NAME_COLUMN_NAME)
    private String username;
}
