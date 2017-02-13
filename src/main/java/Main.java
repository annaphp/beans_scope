import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.AppConfig;
import beans.Cubs;
import beans.Game;
import beans.Team;


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
	
		Game game = context.getBean("baseballGame", Game.class);
		Game game2 = context.getBean("baseballGame", Game.class);
		
		/**
		 * here game and game2 are two separate objects
		 * because we used @Scope("prototype") on BaseballGame class
		 * this forces Spring create a new instance every time we need a new reference
		 */
		System.out.println(game2);
		game.setAwayTeam(context.getBean("redSox",Team.class));
		System.out.println(game2);
		System.out.println(game);
		
		
		


	}

}
