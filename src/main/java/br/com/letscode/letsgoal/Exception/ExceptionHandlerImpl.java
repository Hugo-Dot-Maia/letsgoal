package br.com.letscode.letsgoal.Exception;

import br.com.letscode.letsgoal.Controller.PatrocinadorController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;

@ControllerAdvice
public class ExceptionHandlerImpl {
    private final Logger logger = LoggerFactory.getLogger(PatrocinadorController.class);

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleValidationExceptions(DataIntegrityViolationException ex) {
        logger.error("Erro ao processar request: ", ex.getLocalizedMessage());
        return ResponseEntity.badRequest().body("Informação inválida, verifique seus dados");
    }

    @ExceptionHandler(PatrocinadorNotFoundException.class)
    public ResponseEntity<String> handlePatrocinadorNotFound(PatrocinadorNotFoundException ex) {
        logger.error("Erro ao encontrar patrocinador: ", ex.getLocalizedMessage());
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(JogadorNotFoundException.class)
    public ResponseEntity<String> handleJogadorNotFound(JogadorNotFoundException ex) {
        logger.error("Erro ao encontrar Jogador: ", ex.getLocalizedMessage());
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(EscudoNotFoundException.class)
    public ResponseEntity<String> handleEscudoNotFound(EscudoNotFoundException ex) {
        logger.error("Erro ao encontrar escudo: ", ex.getLocalizedMessage());
        return ResponseEntity.notFound().build();
    }
    @ExceptionHandler(ClubeNotFoundException.class)
    public ResponseEntity<String> handleClubeNotFound(ClubeNotFoundException ex) {
        logger.error("Erro ao encontrar clube: ", ex.getLocalizedMessage());
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> handleConstraintViolationException(ConstraintViolationException ex) {
        logger.error("Erro ao processar request: ", ex.getLocalizedMessage());
        return ResponseEntity.badRequest().body(ex.getMessage());
    }


}
