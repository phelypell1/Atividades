package mobile.fasam.edu.br;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends DebugActivity {

    EditText txtNome;
    EditText txtTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void exibir(View view) {

        txtNome = findViewById(R.id.txtNome);
        txtTelefone = findViewById(R.id.txtTelefone);

        String nome,telefone;
        nome = txtNome.getText().toString();
        telefone = txtTelefone.getText().toString();

        String dados = String.format("O texto digitado foi: %s %s", nome, telefone);




    }
}
