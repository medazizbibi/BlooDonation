package insat.bibiboussaid.bloodonation.Repositories;

import insat.bibiboussaid.bloodonation.Domain.DonationRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRequestRepository extends CrudRepository<DonationRequest,String> {

}
