package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballGame implements Game{
	
	private Team homeTeam;
	private Team awayTeam;
	
	public BaseballGame(){}
	

	public BaseballGame(  Team homeTeam,  Team awayTeam){
		
		if(homeTeam == awayTeam) System.out.println("home and away are the same object on the heap");
		
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
	}
	
	

	@Autowired //Without qualifier Spring cannot decide between two Teams
	@Qualifier("redSox")
	public void setHomeTeam(Team team) {
		homeTeam = team;
		
	}

	public Team getHomeTeam() {
		// TODO Auto-generated method stub
		return homeTeam;
	}
	
	@Autowired
	@Qualifier("cubs")
	public void setAwayTeam(Team team) {
		awayTeam=team;
	}

	public Team getAwayTeam() {
		// TODO Auto-generated method stub
		return awayTeam;
	}

	public String playGame() {
		// TODO Auto-generated method stub
		return Math.random() < 0.5 ? getHomeTeam().getName() : getAwayTeam().getName();
	}


	@Override
	public String toString() {
		return "BaseballGame [homeTeam=" + homeTeam.getName() + ", awayTeam=" + awayTeam.getName() + "]";
	}
	
	

}
