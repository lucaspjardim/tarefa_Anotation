import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TabelaAnotation {
    String nome();
    String descricao() default ""; // Atributo opcional
    String dataCriacao();
    String autor();
}
