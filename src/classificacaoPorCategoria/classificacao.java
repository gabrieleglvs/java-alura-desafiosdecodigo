package classificacaoPorCategoria;

public class classificacao {
    public static void main(String[] args) {
        String produto;
        double preco = 201.00;

        if(preco <= 50.00){
            produto = "Econômico";
        } else if (preco <= 200.00){
            produto = "Intermediário";
        } else {
            produto = "Premium";
        }

        System.out.println("Categoria do produto: " + produto);
    }
}
