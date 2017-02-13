package beans;

import org.springframework.stereotype.Component;

@Component // this bean will have id='cubs'
public class Cubs implements Team{

	public String getName() {
		// TODO Auto-generated method stub
		return "Cubs";
	}

}
