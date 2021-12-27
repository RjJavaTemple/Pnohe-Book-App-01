package In.Ranjan.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import In.Ranjan.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Serializable> {

}
