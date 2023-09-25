package Control;

import lombok.Data;

import java.sql.DataTruncation;
import java.time.format.DateTimeFormatter;
@Data

public class UserControler {
          Integer UserId;
           String username;
           DataTruncation DateOfBirth;
            String email;
             String Phone_Number;
             DateTimeFormatter DateTime;

}
