
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bax
 */
public class hwExcersize_13 {

  hwExcersize_13() {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    System.out.println(dtf.format(now));

    now=now.plusHours(2);
    System.out.println(dtf.format(now));
    

  }

}
