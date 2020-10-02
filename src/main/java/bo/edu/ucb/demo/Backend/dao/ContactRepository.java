package bo.edu.ucb.demo.Backend.dao;

import bo.edu.ucb.demo.Backend.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
