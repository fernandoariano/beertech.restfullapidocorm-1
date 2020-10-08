package br.com.beertech.restfullapidocorm.util;

import br.com.beertech.restfullapidocorm.exception.ValidationException;
import org.springframework.http.ResponseEntity;

import static br.com.beertech.restfullapidocorm.constantes.Constantes.Messages.REGISTRY_NOT_FOUND;
import static br.com.beertech.restfullapidocorm.util.CheckerUtils.isNotNullOrEmpty;
import static java.util.Optional.ofNullable;
import static org.springframework.http.ResponseEntity.ok;

public class ReturnUtils {

    public static <T> ResponseEntity<T> okOrThrow(T returnedObject, String message) {
        return ofNullable(ok(returnedObject)).orElseThrow(() -> throwExceptionIfObjectIsNull(getMessage(message)));
    }

    public static <T> ResponseEntity<T> okOrThrow(T returnedObject) {
        return ofNullable(ok(returnedObject)).orElseThrow(() -> throwExceptionIfObjectIsNull(REGISTRY_NOT_FOUND));
    }

    public static ValidationException throwExceptionIfObjectIsNull(String message) {
        return new ValidationException(message);
    }

    private static String getMessage(String message) {
        return isNotNullOrEmpty(message) ? message : REGISTRY_NOT_FOUND;
    }

}