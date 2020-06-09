
import com.alprime.alerta.TemperaturaAlerta;
import com.alprime.bancoDados.Query.QueryBD;
import com.alprime.bancoDados.tabelas.Registro;
import com.alprime.log.Log;
import com.alprime.log.MensagemLog;
import com.alprime.telegram.BotTelegram;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gabriel Vieira
 */
public class teste {

    public static void main(String[] args) {
        int contadorAlerta = 0;
        int contadorPerigo = 0;
        for (int i = 0; i < 10; i++) {
            if (contadorPerigo % 3 == 0) {
                System.out.println("true");
            }
            contadorPerigo++;
        }
    }
}
