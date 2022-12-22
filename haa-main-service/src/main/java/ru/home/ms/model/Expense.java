package ru.home.ms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "expenses")
@NoArgsConstructor
@AllArgsConstructor
public class Expense {

    public static final String ID_COLUMN_NAME = "expense_id";
    public static final String CATEGORY_COLUMN_NAME = "category_id";
    public static final String USER_COLUMN_NAME = "user_id";
    public static final String FAMILY_COLUMN_NAME = "family";
    public static final String AMOUNT_COLUMN_NAME = "amount";
    public static final String DATE_COLUMN_NAME = "date";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ID_COLUMN_NAME)
    private Long id;
    @Column(name = CATEGORY_COLUMN_NAME)
    private Category category;
    @ManyToOne(optional = false)
    @JoinColumn(name = USER_COLUMN_NAME, nullable = false)
    private User user;
    @Column(name = AMOUNT_COLUMN_NAME)
    private long amount;
    @Column(name = FAMILY_COLUMN_NAME)
    private String familyName;
    @Column(name = DATE_COLUMN_NAME)
    private LocalDateTime date;
}
