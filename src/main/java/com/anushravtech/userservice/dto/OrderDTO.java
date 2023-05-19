package com.anushravtech.userservice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private int id;
    private String name;
    private String category;
    private String color;
    private double price;
//
//    public OrderDTO(int id,String name,String category,String color,double price){
//        this.id =id;
//        this.name =name;
//        this.category = category;
//        this.color = color;
//        this.price =price;
//    }
}
