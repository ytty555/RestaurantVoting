package com.ytty.restaurantvoting.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

    private Integer id;
    private int restaurantId;
    private LocalDate date;
    private Map<String, Double> dishes;
}
