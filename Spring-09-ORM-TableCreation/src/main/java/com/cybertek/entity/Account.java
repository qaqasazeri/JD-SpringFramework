package com.cybertek.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@MappedSuperclass
public class Account {

    @Id
    private Long id;
    private String owner;
    private BigDecimal balance;
    private BigDecimal interestRate;


}
