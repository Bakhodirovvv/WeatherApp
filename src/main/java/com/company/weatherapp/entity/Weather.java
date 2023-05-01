package com.company.weatherapp.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Integer temperature;  //harorat selsiyda
    @Column(nullable = false)
    private Double precipitation; // yog`ingarchilik foizda
    @Column(nullable = false)
    private Double wind;  // shamol km/h
    @Column(nullable = false)
    private Double humidity; //namlik foizda
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Week week;  // hafta kuni

}
enum Week{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
