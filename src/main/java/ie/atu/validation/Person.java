package ie.atu.validation;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message =  "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @Min(value = 2, message = "Name cannot be smaller then two Characters")
    private int age;

    // @Max(value = 50, message = "Name cannot be larger than fifty characters")
   // private int age;

    @Email(message = "Invalid email address")
    private String email;

    //@PositiveOrZero
    @NotBlank(message = "Title cannot be blank")
    private String title;

    @NotBlank(message = "ID cannot be blank")
    private String employeeId;

    @NotBlank(message = "Position cannot be blank")
    private String position;

    @NotBlank(message = "department cannot be blank")
    private String department;

}
