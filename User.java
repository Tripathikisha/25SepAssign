        package com.example.demo.Entity;

        import jakarta.validation.constraints.*;
        import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;

        import java.time.LocalDateTime;


        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        public class User {

            @NotNull
            private Integer userId;

            @NotBlank
            private String userName;


            @Email
            private String userEmail;


            @Size(min=10,max=10)
            @Pattern(regexp = "^[0-9]+$", message = "contacts should be just numbers!!")
            private String userContact;

            private LocalDateTime userDOB;
              private LocalDateTime DateTime;

        }
