package In.Ranjan.Binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ContactForm {
	private Integer ContactId;
	private String ContactName;
	private String ContactEmail;
	private Long ContactNumber;
	private String ContactActiveSwitch;
	private LocalDate ContactSaveTime;
	private LocalDate ContactUpdateTime;

}
