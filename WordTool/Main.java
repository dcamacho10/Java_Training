package WordTool;

public class Main {


    /**
     * @param args not applicable for that case
     */
    public static void main(String[] args) {

        WordTool wt = new WordTool();
        String text = "Um teste de contagem de palavras e letras";

        System.out.println("Analizando o texto: " + text);
        System.out.println("Total de palavras: " + wt.wordCount(text));
        System.out.println("Total de letras ou simbolos com espaco em branco: " + wt.symbolCount(text, true));
        System.out.println("Total de letras ou simbolos sem espaco em branco: " + wt.symbolCount(text, false));


    }

}