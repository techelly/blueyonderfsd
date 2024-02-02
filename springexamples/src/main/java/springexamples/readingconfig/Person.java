package springexamples.readingconfig;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {
	private Long adharCardNumber;
	private String personName;
	private Address residentialAddress;
	private Address permanentAddress;
}
