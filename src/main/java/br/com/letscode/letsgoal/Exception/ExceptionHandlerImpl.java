package br.com.letscode.letsgoal.Exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;

@ControllerAdvice
@Slf4j
public class ExceptionHandlerImpl {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleValidationExceptions(DataIntegrityViolationException ex) {
        log.error("Erro ao processar request: ", ex.getLocalizedMessage());
        return ResponseEntity.badRequest().body("Informação inválida, verifique seus dados");
    }

    @ExceptionHandler(PatrocinadorNotFoundException.class)
    public ResponseEntity<String> handlePatrocinadorNotFound(PatrocinadorNotFoundException ex) {
        log.error("Erro ao encontrar patrocinador: ", ex.getLocalizedMessage());
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(JogadorNotFoundException.class)
    public ResponseEntity<String> handleJogadorNotFound(JogadorNotFoundException ex) {
        log.error("Erro ao encontrar Jogador: ", ex.getLocalizedMessage());
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(EscudoNotFoundException.class)
    public ResponseEntity<String> handleEscudoNotFound(EscudoNotFoundException ex) {
        log.error("Erro ao encontrar escudo: ", ex.getLocalizedMessage());
        return ResponseEntity.notFound().build();
    }
    @ExceptionHandler(ClubeNotFoundException.class)
    public ResponseEntity<String> handleClubeNotFound(ClubeNotFoundException ex) {
        log.error("Erro ao encontrar clube: ", ex.getLocalizedMessage());
        return ResponseEntity.notFound().build();
    }
    @ExceptionHandler(PosicaoNotFoundException.class)
    public ResponseEntity<String> handlePosicaoNotFound() {
        log.error("Erro ao encontrar posicao: ");
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(FormacaoNotFoundException.class)
    public ResponseEntity<String> handleFormacaoNotFound() {
        log.error("Erro ao encontrar formacao: ");
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> handleConstraintViolationException(ConstraintViolationException ex) {
        log.error("Erro ao processar request: ", ex.getLocalizedMessage());
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
