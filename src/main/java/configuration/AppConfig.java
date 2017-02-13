package configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * Only exists to enable component scan.
 * Component scan = @Component on beans + @ComponentScan on configuration(here).
 * 
 * In autowiring we have 2 options: constructor injection & setter injection.
 * 
 * @author anna
 *
 */
@Configuration
@ComponentScan(basePackages={"beans"}) // tells which packages to scan. default scan is current package and subpackages.
public class AppConfig {}
