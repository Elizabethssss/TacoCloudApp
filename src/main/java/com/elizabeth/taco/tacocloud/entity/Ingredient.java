package com.elizabeth.taco.tacocloud.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@RequiredArgsConstructor
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @Column(name = "id")
    private final String id;

    @Column(name = "name")
    private final String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE;
    }
}
