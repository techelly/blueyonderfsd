package springexamples.readingconfig;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Customer {

	private Integer customerId;
	private String customerName;
	private Address homeAddress;
	private Address resAddress;

}
