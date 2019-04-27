package insat.bibiboussaid.bloodonation.Domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class Donation {

    @Id
    private String donationId;

    private String donationDate;

    @OneToOne(mappedBy = "donation",fetch = FetchType.LAZY)
    @JsonManagedReference
    private DonationRequest donationRequest;
}
