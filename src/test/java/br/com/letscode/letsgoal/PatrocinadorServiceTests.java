package br.com.letscode.letsgoal;

import Mock.MockPatrocinadores;
import br.com.letscode.letsgoal.Model.Patrocinador.Patrocinador;
import br.com.letscode.letsgoal.Repository.PatrocinadorRepository;
import br.com.letscode.letsgoal.Service.PatrocinadorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Collections;
import java.util.List;

@DisplayName("Patrocinador Service Test")
@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
public class PatrocinadorServiceTests {
    @MockBean
    private PatrocinadorRepository patrocinadorRepository;
    @InjectMocks
    private PatrocinadorService patrocinadorService;

    private final MockPatrocinadores mockPatrocinadores = new MockPatrocinadores();

    @BeforeEach
    public void setupTests(){
        patrocinadorService = new PatrocinadorService(patrocinadorRepository);
    }


    @Test
    public void getFiltrosPatrocinador(){
        Mockito.when(patrocinadorRepository.findAll()).thenReturn(mockPatrocinadores.TodosPatrocinadores());

        var patrocinadorFiltro = patrocinadorService.fildAllPatrocinadorFiltro();

        assertTrue(patrocinadorFiltro.isEmpty());

    }
}
