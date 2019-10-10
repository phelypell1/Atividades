package mobile.fasam.edu.br;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlunoActivity extends DebugActivity {

    EditText txtNomeAluno;
    EditText txtNota1;
    EditText txtNota2;
    EditText txtNota3;
    ListView ListView;

    List<HashMap<String, Double>> lista = new ArrayList<>();

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_aluno);
    }


    public void AdicionarAluno(View view) {

        txtNomeAluno = findViewById(R.id.txtNomeAluno);
        txtNota1 = findViewById(R.id.txtNota1);
        txtNota2 = findViewById(R.id.txtNota2);
        txtNota3 = findViewById(R.id.txtNota3);

        String NomeAluno;
        double Nota1;
        double Nota2;
        double Nota3;

        NomeAluno = txtNomeAluno.getText().toString();
        Nota1 = Double.parseDouble(txtNota1.getText().toString());
        Nota2 = Double.parseDouble(txtNota2.getText().toString());
        Nota3 = Double.parseDouble(txtNota3.getText().toString());

        double media = Nota1+Nota2+Nota3/3;

        String dados = String.format("Os dados informados foram %s  %s", NomeAluno, Nota1, Nota2,Nota3);

        HashMap<String, String> map = new HashMap<>();
        map.put("Nome Aluno", NomeAluno);

        HashMap<String, Double> list = new HashMap<>();
        list.put("Nota 1", Nota1);
        list.put("Nota 2", Nota2);
        list.put("Nota3", Nota3);

        lista.add(map);
        lista.add(list);





    }
}
