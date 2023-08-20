package com.d24hostels.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class University {
    @Id
    private String uniName;
    @OneToMany(mappedBy = "university")
    private List<Student> students;

    public University(String uniName) {
        this.uniName=uniName;
    }
}
