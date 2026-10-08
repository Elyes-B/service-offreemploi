package com.iset.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter 
public class Offre {

@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
long code;

public Offre(String intitulé, String specialité, String société, int nbpostes, String pays) {
        this.intitulé = intitulé;
        this.specialité = specialité;
        this.société = société;
        this.nbpostes = nbpostes;
        this.pays = pays;
}



String intitulé;
String specialité;
String société;
int nbpostes;
String pays;
}
