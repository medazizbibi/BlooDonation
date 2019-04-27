package insat.bibiboussaid.bloodonation.Repositories;

import insat.bibiboussaid.bloodonation.Domain.Recipient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipientRepository extends CrudRepository <Recipient,String> {
}
