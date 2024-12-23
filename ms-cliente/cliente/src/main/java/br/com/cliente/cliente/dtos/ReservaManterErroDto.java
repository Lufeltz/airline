package br.com.cliente.cliente.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReservaManterErroDto {
    private ReservaManterDto reservaManterDto;
    private String errorMessage;
}
