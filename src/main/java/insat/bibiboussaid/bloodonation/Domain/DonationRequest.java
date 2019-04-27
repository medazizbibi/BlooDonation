package insat.bibiboussaid.bloodonation.Domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class DonationRequest {

    @Id
    private String donationRequestId;

    private String donationRequestDate;

    @ManyToOne(fetch= FetchType.LAZY)
    @JsonManagedReference
    private Donor requestDonor;

    @ManyToOne(fetch=FetchType.LAZY)
    @JsonManagedReference
    private Recipient requestRecipient;

    @OneToOne(mappedBy = "donationRequest",fetch=FetchType.LAZY)
    @JsonBackReference
    private Donation donation;

    @ManyToOne(fetch=FetchType.LAZY)
    @JsonManagedReference
    private MedicalCenter medicalCenter;

}
