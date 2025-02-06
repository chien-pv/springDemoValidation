package newdemo.newdemo.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder.Default;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Student {
    @Email(message = "Không đúng định dạng email!!")
    String email;

    @NotBlank(message = "Không được để trống!!")
    String name;
    
    String password;

    Integer age;
}
