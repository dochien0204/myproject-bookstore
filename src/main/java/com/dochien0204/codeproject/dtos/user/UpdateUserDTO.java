package com.dochien0204.codeproject.dtos.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserDTO {

  private String password;

  @Nationalized
  private String address;

  private String email;

  private String phone;

  private Integer age;

  @Nationalized
  private String fullName;

  private MultipartFile file;
}
