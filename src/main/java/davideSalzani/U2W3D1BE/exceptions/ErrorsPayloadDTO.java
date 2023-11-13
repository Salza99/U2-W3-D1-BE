package davideSalzani.U2W3D1BE.exceptions;

import java.time.LocalDate;

public record ErrorsPayloadDTO(
        String message,
        LocalDate timeStamp
) {
}
