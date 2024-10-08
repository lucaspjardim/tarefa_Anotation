import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TabelaAnotation {
    String nome();
    String descricao() default "";
    String dataCriacao();
    String autor();
}
