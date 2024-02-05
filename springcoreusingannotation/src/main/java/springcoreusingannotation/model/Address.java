package springcoreusingannotation.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component("address")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Address{
	
	@Value("1")
	private Integer addressId;
	@Value("BLR")
	private String city;
	@Value("KA")
	private String state;
	@Value("IN")
	private String country;
}
