package lk.ijse.gdse.springtest01.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private Integer id;
    private String custName;
    private String custAddress;
    private String custPhone;
    private String custEmail;
}
