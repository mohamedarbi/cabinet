package com.funsoft.cabinet.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.List;

// POJO -----> ENTITY
// @Getter @Setter @AllArgsConstructor ... ==> @Data
@Data
@Entity
public class Doctor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 30, nullable = false)
    @NotBlank(message = "firstname is mondatory")
    @Pattern(regexp = "[a-zA-Z]+", message = "firstname name sould be contains only alphabets")
    private String firstname;

    @NotBlank(message = "lastname is mondatory")
    @Pattern(regexp = "[a-zA-Z]+", message = "lastname name sould be contains only alphabets")
    @Column(length = 30, nullable = false)
    private String lastname;

    @Column(nullable = false, unique = true)
    @Email(message = "Email invalid")
    private String email;

    @NotBlank(message = "adress is mondatory")
    @Column(nullable = false)
    private String address;

  //  @NotBlank(message = "speciality name is mondatory")
    @Enumerated(EnumType.STRING)
    private Speciality speciality;
 /*   @OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY, cascade = {CascadeType.REMOVE,CascadeType.PERSIST})
    private List<Appointment>appointments;

*/
}
