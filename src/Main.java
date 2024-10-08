import java.lang.annotation.Annotation;

@TabelaAnotation(nome = "Tabela", descricao = "Classe principal do projeto", dataCriacao = "07/10/2024", autor = "Lucas Jardim")
public class Main {
    public static void main(String[] args) {
        ReflectionExecute();
    }

    private static void ReflectionExecute() {
        Class<?> clazz = Main.class;
        Annotation[] annotations = clazz.getAnnotations();

        if (clazz.isAnnotationPresent(TabelaAnotation.class)) {
            TabelaAnotation anotacao = clazz.getAnnotation(TabelaAnotation.class);
            System.out.println("O valor da anotação nome é: " + anotacao.nome());
            System.out.println("O valor da anotação descrição é: " + anotacao.descricao());
            System.out.println("O valor da anotação data de criação é: " + anotacao.dataCriacao());
            System.out.println("O valor da anotação autor é: " + anotacao.autor());
        } else {
            System.out.println("A anotação TabelaAnotation não está presente.");
        }
    }
}
