package net.proselyte.app.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "event")
@Getter
@Setter
@ToString
public class Event extends BaseEntity {

    @Column(name = "client_id")
    private Integer client_id;

    @Column(name = "dish_id")
    private Integer dish_id;
}
