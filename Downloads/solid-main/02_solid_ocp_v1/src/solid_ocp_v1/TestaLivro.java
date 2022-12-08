package solid_ocp_v1;

import java.util.ArrayList;
import java.util.List;

public class TestaLivro {
    public static void main(String[] args) {


        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("A arte da arte", "Ruan", 2000, 200, "1324151"));
        Fatura fatura = new Fatura(new Livro("A arte da arte", "Ruan", 2000, 200, "1324151"),1,0.1,0.1);

        ImpressaoDeFatura impressaoDeFatura = new ImpressaoDeFatura(fatura);


        impressaoDeFatura.imprimir();

    }
}