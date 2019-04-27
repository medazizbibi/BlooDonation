package insat.bibiboussaid.bloodonation.Repositories;

import insat.bibiboussaid.bloodonation.Domain.MedicalCenter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalCenterRepository  extends CrudRepository<MedicalCenter,String> {
}
