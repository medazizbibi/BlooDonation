package insat.bibiboussaid.bloodonation.Domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class MedicalCenter {
    @Id
    private String medicalCenterId;

    private String medicalCenterDescription;
    private String medicalCenterEmail;
    private String medicalCenterPhoneNumber;
    private String medicalCenterAdress;

    @OneToMany(mappedBy = "medicalCenter",fetch = FetchType.LAZY)
    private List<DonationRequest> donationRequestList;

}
