package insat.bibiboussaid.bloodonation.Domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Person {

    @Id
    public String personId;
    public int cin;

    private String firstName;
    private String lastName;
    private String adress;
    private String email;
    private String phoneNumber;
    private String gender;
    private BloodGroup bloodGroup;

    private double weight;
    private double height;



}
