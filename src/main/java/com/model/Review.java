package com.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    @ManyToOne
    private Account accountCCDV;
    @ManyToOne
    private Account accountUser;
    private long rating;
    @Lob
    private String content;
    private Boolean isActive;
}
