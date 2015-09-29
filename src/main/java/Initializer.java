/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'florint' at '9/15/15 4:22 PM' with Gradle 2.6
 *
 * @author florint, @date 9/15/15 4:22 PM
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@EnableAutoConfiguration
@ImportResource("context.xml")
public class Initializer {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(Initializer.class, args);
  }
}