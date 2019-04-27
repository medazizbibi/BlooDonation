package insat.bibiboussaid.bloodonation.Repositories;

import insat.bibiboussaid.bloodonation.Domain.Donation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRepository extends CrudRepository<Donation,String> {
}
