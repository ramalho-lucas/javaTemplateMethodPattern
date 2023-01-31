import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void executandoContratado(){
        Contratado contratado = new Contratado("Lucas", "Ramalho", "5444-4", "Conta-Corrente", 8.50, 160);

        contratado.pagamentoDeSalario();
        System.out.println(" ");
    }

    @Test
    void  executandoEfetivo(){
        Efetivo efetivo = new Efetivo("Lucas", "Ramalho", "5444-4", "Conta-Corrente", 15500, 3500, 480);

        efetivo.pagamentoDeSalario();
    }

}