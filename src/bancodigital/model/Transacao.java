package bancodigital.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transacao {

    private TipoTransacao tipo;
    private BigDecimal valor;
    private LocalDateTime dataHora;

    public Transacao(TipoTransacao tipo, BigDecimal valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = LocalDateTime.now();
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}
