package solid_srp_v1;


import java.util.ArrayList;
import java.util.List;

public class TestaLivro {
    public static void main(String[] args) {

        List<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Ruan", "Ruan", 2043, 176.98, "5131532"));
        livros.add(new Livro("Lauren", "Cassel", 1986, 300, "634262"));
        livros.add(new Livro("Marilene", "Marvin", 1987, 176.98, "7437537"));
        livros.add(new Livro("Ruan", "Ruan", 2000, 132, "98908760"));
        livros.add(new Livro("Loverin", "kuait", 1999, 1780.89, "865684"));


        for (int i = 0; i < livros.size(); i++) {
            System.out.println(livros.get(i).getNome() + " | " + livros.get(i).getNomeAutor() + " | " + livros.get(i).getAno()
                    + " | " + livros.get(i).getPreco() + " | " + livros.get(i).getIsbn());
        }

    }
}

