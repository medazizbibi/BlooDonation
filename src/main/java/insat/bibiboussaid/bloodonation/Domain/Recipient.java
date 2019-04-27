package insat.bibiboussaid.bloodonation.Domain;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Recipient extends Person  {

    @OneToMany(mappedBy = "person",fetch = FetchType.LAZY)
    @JsonBackReference
    List<DonationRequest> donationRequestList;
}
