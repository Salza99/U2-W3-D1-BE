package DavideSalzani.ProgettoU2W2D5BE.exceptions;

import org.springframework.validation.ObjectError;

import java.time.LocalDate;
import java.util.List;

public record ErrorsListDTO(
        String message,
        LocalDate timestamp,
        List<String> messageList
) {
}
