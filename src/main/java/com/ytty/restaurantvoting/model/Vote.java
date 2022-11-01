package com.ytty.restaurantvoting.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vote {

    private Integer id;
    private LocalDate date;
    private int userId;
    private int restaurantId;
}
