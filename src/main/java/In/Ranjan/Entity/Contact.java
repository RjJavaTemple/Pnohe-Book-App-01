package In.Ranjan.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "Contact_Tab1")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ContactId;
	private String ContactName;
	private String ContactEmail;
	private Long ContactNumber;
	private String ContactActiveSwitch;
	@CreationTimestamp
	private LocalDate ContactSaveTime;
	@UpdateTimestamp
	private LocalDate ContactUpdateTime;
}
