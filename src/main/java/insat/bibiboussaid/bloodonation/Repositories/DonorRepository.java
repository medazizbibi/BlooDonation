package insat.bibiboussaid.bloodonation.Repositories;

import insat.bibiboussaid.bloodonation.Domain.Donor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonorRepository extends CrudRepository<Donor, String> {


}
