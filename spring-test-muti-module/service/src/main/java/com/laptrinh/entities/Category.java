package com.laptrinh.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Category {
    Integer id;

    String name;

    String nameVN;
}
