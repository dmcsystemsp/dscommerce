package com.dmcsystemsp.dmccommerce.dto;

import com.dmcsystemsp.dmccommerce.entities.Product;
import jakarta.persistence.Column;
import jakarta.validation.constraints.*;

public class ProductDTO {

    private Long id;
    @Size(min = 3, max = 80, message = "O nome precisa ter de 3 a 80 caracteres!")
    @NotBlank(message = "Campo requerido")
    private String name;
    @Size(min = 10, message = "A descrição deve ter no mínimo 10 caracteres")
    @NotBlank(message = "Campo requerido")
    private String description;
    @Positive(message = "O preço tem que ser positivo!")
    private Double price;
    private String imgUrl;

    public ProductDTO() {}

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {

        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

}
