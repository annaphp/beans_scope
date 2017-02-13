package beans;

import org.springframework.stereotype.Component;

@Component // this bean will have id='redSox'
public class RedSox implements Team{

	public String getName() {
		return "RedSox";
	}

}
