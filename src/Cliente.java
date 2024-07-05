import com.sun.jdi.FloatValue;

/**
 * @author queiroga
 */

public class Cliente {

    private Integer codigo;
    private Long codigoMaior=1204050l;
    private Double valorDecimal=10.1;
    private Short shor;
    private Byte bi;
    private Character letra = 'A';

    public Cliente(Short shor, Byte bi) {
        this.shor = shor;
        this.bi = bi;
    }
}
