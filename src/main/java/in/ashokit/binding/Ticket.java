package in.ashokit.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Ticket {
	@Id
	@GeneratedValue
  private Integer ticketId;
  private String ticketStatus;
  private String trainNum;
  private String name;
	private String dob;
	private String gender;
	private String doj;
	private String source;
	private String destination;

}
