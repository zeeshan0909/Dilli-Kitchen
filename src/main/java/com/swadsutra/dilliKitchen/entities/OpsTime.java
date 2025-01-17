package com.swadsutra.dilliKitchen.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "OpsTime")
public class OpsTime {

    @CreationTimestamp
    private LocalDateTime createdOn;
    @CreationTimestamp
    private LocalDateTime modifiedOn;
    @CreationTimestamp
    private LocalDateTime deletedOn;

}
