package id.ac.umn.nicotiana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class DiagnosaActivity extends AppCompatActivity {

    CheckBox ChckSesakNafas, ChckBeratBadanMenurun, ChckBatukBerdarah, ChckNyeriDada,ChckPusing,
            ChckLemas, ChckMual, ChckKesadaranMenurun, ChckKesulitanBerbicara, ChckSeringBuangAir,
            ChckLukaSulitSembuh, ChckJantungBerdebar, ChckMimisan;

    Button btnDiagnosa, btnSolusi;
    TextView tvOutputPenyakit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);

        ChckSesakNafas = (CheckBox)findViewById(R.id.sesakNafas);
        ChckBeratBadanMenurun = (CheckBox)findViewById(R.id.beratBadan);
        ChckBatukBerdarah = (CheckBox)findViewById(R.id.batukBerdarah);
        ChckNyeriDada = (CheckBox)findViewById(R.id.nyeriDada);
        ChckPusing = (CheckBox)findViewById(R.id.pusing);
        ChckLemas = (CheckBox)findViewById(R.id.lemas);
        ChckMual = (CheckBox)findViewById(R.id.mual);
        ChckKesadaranMenurun = (CheckBox)findViewById(R.id.kesadaranMenurun);
        ChckKesulitanBerbicara = (CheckBox)findViewById(R.id.sulitBicara);
        ChckSeringBuangAir = (CheckBox)findViewById(R.id.buangAir);
        ChckLukaSulitSembuh = (CheckBox)findViewById(R.id.lukaSulitsembuh);
        ChckJantungBerdebar = (CheckBox)findViewById(R.id.detakJantung);
        ChckMimisan = (CheckBox)findViewById(R.id.mimisan);

        btnDiagnosa = (Button)findViewById(R.id.diagnosaBtn);
        btnSolusi = (Button)findViewById(R.id.solusiBtn);

        tvOutputPenyakit = (TextView)findViewById(R.id.textDiagnosa);

        btnDiagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NamaDiagnosa = "Anda terkena : ";
                //100% diagnosa

                if(ChckSesakNafas.isChecked() && ChckBeratBadanMenurun.isChecked() && ChckBatukBerdarah.isChecked() && ChckNyeriDada.isChecked()){
                    NamaDiagnosa += "\n100% Kanker Paru-Paru";
                }
                else if(ChckSesakNafas.isChecked() && ChckNyeriDada.isChecked() && ChckPusing.isChecked() && ChckMual.isChecked() && ChckMimisan.isChecked()) {
                    NamaDiagnosa += "\n100% Hipertensi";
                }
                else if(ChckBeratBadanMenurun.isChecked() && ChckPusing.isChecked() && ChckLemas.isChecked() && ChckSeringBuangAir.isChecked() && ChckLukaSulitSembuh.isChecked()) {
                    NamaDiagnosa += "\n100% Diabetes";
                }
                else if(ChckNyeriDada.isChecked() && ChckPusing.isChecked() && ChckLemas.isChecked() && ChckMual.isChecked() && ChckJantungBerdebar.isChecked()) {
                    NamaDiagnosa += "\n100% Serangan Jantung";
                }
                else if(ChckPusing.isChecked() && ChckMual.isChecked() && ChckKesadaranMenurun.isChecked() && ChckKesulitanBerbicara.isChecked()) {
                    NamaDiagnosa += "\n100% Stroke";
                }

                //75% diagnosa

                else if(ChckSesakNafas.isChecked() && ChckBeratBadanMenurun.isChecked() && ChckBatukBerdarah.isChecked()) {
                    NamaDiagnosa += "\n75% Kanker Paru-Paru";
                }
                else if(ChckSesakNafas.isChecked() && ChckBeratBadanMenurun.isChecked() && ChckNyeriDada.isChecked()) {
                    NamaDiagnosa += "\n75% Kanker Paru-Paru";
                }
                else if(ChckSesakNafas.isChecked() && ChckBatukBerdarah.isChecked() && ChckNyeriDada.isChecked()) {
                    NamaDiagnosa += "\n75% Kanker Paru-Paru";
                }
                else if(ChckBeratBadanMenurun.isChecked() && ChckBatukBerdarah.isChecked() && ChckNyeriDada.isChecked()) {
                    NamaDiagnosa += "\n75% Kanker Paru-Paru";
                }


                else if(ChckSesakNafas.isChecked() && ChckNyeriDada.isChecked() && ChckPusing.isChecked() && ChckMual.isChecked()) {
                    NamaDiagnosa += "\n75% Hipertensi";
                }
                else if(ChckSesakNafas.isChecked() && ChckNyeriDada.isChecked() && ChckPusing.isChecked() && ChckMimisan.isChecked()) {
                    NamaDiagnosa += "\n75% Hipertensi";
                }
                else if(ChckSesakNafas.isChecked() && ChckNyeriDada.isChecked() && ChckMual.isChecked() && ChckMimisan.isChecked()) {
                    NamaDiagnosa += "\n75% Hipertensi";
                }
                else if(ChckSesakNafas.isChecked() && ChckPusing.isChecked() && ChckMual.isChecked() && ChckMimisan.isChecked()) {
                    NamaDiagnosa += "\n75% Hipertensi";
                }
                else if(ChckNyeriDada.isChecked() && ChckPusing.isChecked() && ChckMual.isChecked() && ChckMimisan.isChecked()) {
                    NamaDiagnosa += "\n75% Hipertensi";
                }


                else if(ChckBeratBadanMenurun.isChecked() && ChckPusing.isChecked() && ChckLemas.isChecked() && ChckSeringBuangAir.isChecked()) {
                    NamaDiagnosa += "\n75% Diabetes";
                }
                else if(ChckBeratBadanMenurun.isChecked() && ChckPusing.isChecked() && ChckLemas.isChecked() && ChckLukaSulitSembuh.isChecked()) {
                    NamaDiagnosa += "\n75% Diabetes";
                }
                else if(ChckBeratBadanMenurun.isChecked() && ChckPusing.isChecked() && ChckSeringBuangAir.isChecked() && ChckLukaSulitSembuh.isChecked()) {
                    NamaDiagnosa += "\n75% Diabetes";
                }
                else if(ChckBeratBadanMenurun.isChecked() && ChckLemas.isChecked() && ChckSeringBuangAir.isChecked() && ChckLukaSulitSembuh.isChecked()) {
                    NamaDiagnosa += "\n75% Diabetes";
                }
                else if(ChckPusing.isChecked() && ChckLemas.isChecked() && ChckSeringBuangAir.isChecked() && ChckLukaSulitSembuh.isChecked()) {
                    NamaDiagnosa += "\n75% Diabetes";
                }


                else if(ChckNyeriDada.isChecked() && ChckPusing.isChecked() && ChckLemas.isChecked() && ChckMual.isChecked()) {
                    NamaDiagnosa += "\n75% Serangan Jantung";
                }
                else if(ChckNyeriDada.isChecked() && ChckPusing.isChecked() && ChckLemas.isChecked() && ChckJantungBerdebar.isChecked()) {
                    NamaDiagnosa += "\n75% Serangan Jantung";
                }
                else if(ChckNyeriDada.isChecked() && ChckPusing.isChecked() && ChckMual.isChecked() && ChckJantungBerdebar.isChecked()) {
                    NamaDiagnosa += "\n75% Serangan Jantung";
                }
                else if(ChckNyeriDada.isChecked() && ChckLemas.isChecked() && ChckMual.isChecked() && ChckJantungBerdebar.isChecked()) {
                    NamaDiagnosa += "\n75% Serangan Jantung";
                }
                else if(ChckPusing.isChecked() && ChckLemas.isChecked() && ChckMual.isChecked() && ChckJantungBerdebar.isChecked()) {
                    NamaDiagnosa += "\n75% Serangan Jantung";
                }


                else if(ChckPusing.isChecked() && ChckMual.isChecked() && ChckKesadaranMenurun.isChecked()) {
                    NamaDiagnosa += "\n75% Stroke";
                }
                else if(ChckPusing.isChecked() && ChckMual.isChecked() && ChckKesulitanBerbicara.isChecked()) {
                    NamaDiagnosa += "\n75% Stroke";
                }
                else if(ChckPusing.isChecked() && ChckKesadaranMenurun.isChecked() && ChckKesulitanBerbicara.isChecked()) {
                    NamaDiagnosa += "\n75% Stroke";
                }
                else if(ChckMual.isChecked() && ChckKesadaranMenurun.isChecked() && ChckKesulitanBerbicara.isChecked()) {
                    NamaDiagnosa += "\n75% Stroke";
                }

                //diagnosa 50%

                else if(ChckSesakNafas.isChecked() && ChckBeratBadanMenurun.isChecked()) {
                    NamaDiagnosa += "\n50% Kanker Paru-Paru";
                }
                else if(ChckSesakNafas.isChecked() && ChckBatukBerdarah.isChecked()) {
                    NamaDiagnosa += "\n50% Kanker Paru-Paru";
                }
                else if(ChckBeratBadanMenurun.isChecked() && ChckBatukBerdarah.isChecked()) {
                    NamaDiagnosa += "\n50% Kanker Paru-Paru";
                }
                else if(ChckBeratBadanMenurun.isChecked() && ChckNyeriDada.isChecked()) {
                    NamaDiagnosa += "\n50% Kanker Paru-Paru";
                }
                else if(ChckBatukBerdarah.isChecked() && ChckNyeriDada.isChecked()) {
                    NamaDiagnosa += "\n50% Kanker Paru-Paru";
                }


                else if(ChckSesakNafas.isChecked() && ChckNyeriDada.isChecked() && ChckPusing.isChecked()) {
                    NamaDiagnosa += "\n50% Hipertensi";
                }
                else if(ChckSesakNafas.isChecked() && ChckNyeriDada.isChecked() && ChckMual.isChecked()) {
                    NamaDiagnosa += "\n50% Hipertensi";
                }
                else if(ChckSesakNafas.isChecked() && ChckNyeriDada.isChecked() && ChckMimisan.isChecked()) {
                    NamaDiagnosa += "\n50% Hipertensi";
                }
                else if(ChckSesakNafas.isChecked() && ChckPusing.isChecked() && ChckMual.isChecked()) {
                    NamaDiagnosa += "\n50% Hipertensi";
                }
                else if(ChckSesakNafas.isChecked() && ChckPusing.isChecked() && ChckMimisan.isChecked()) {
                    NamaDiagnosa += "\n50% Hipertensi";
                }
                else if(ChckNyeriDada.isChecked() && ChckMual.isChecked() && ChckMimisan.isChecked()) {
                    NamaDiagnosa += "\n50% Hipertensi";
                }
                else if(ChckPusing.isChecked() && ChckMual.isChecked() && ChckMimisan.isChecked()) {
                    NamaDiagnosa += "\n50% Hipertensi";
                }


                else if(ChckBeratBadanMenurun.isChecked() && ChckPusing.isChecked() && ChckLemas.isChecked()) {
                    NamaDiagnosa += "\n50% Diabetes";
                }
                else if(ChckBeratBadanMenurun.isChecked() && ChckPusing.isChecked() && ChckSeringBuangAir.isChecked()) {
                    NamaDiagnosa += "\n50% Diabetes";
                }
                else if(ChckBeratBadanMenurun.isChecked() && ChckPusing.isChecked() && ChckLukaSulitSembuh.isChecked()) {
                    NamaDiagnosa += "\n50% Diabetes";
                }
                else if(ChckBeratBadanMenurun.isChecked() && ChckLemas.isChecked() && ChckSeringBuangAir.isChecked()) {
                    NamaDiagnosa += "\n50% Diabetes";
                }
                else if(ChckBeratBadanMenurun.isChecked() && ChckLemas.isChecked() && ChckLukaSulitSembuh.isChecked()) {
                    NamaDiagnosa += "\n50% Diabetes";
                }
                else if(ChckPusing.isChecked() && ChckLemas.isChecked() && ChckSeringBuangAir.isChecked()) {
                    NamaDiagnosa += "\n50% Diabetes";
                }
                else if(ChckPusing.isChecked() && ChckLemas.isChecked() && ChckLukaSulitSembuh.isChecked()) {
                    NamaDiagnosa += "\n50% Diabetes";
                }
                else if(ChckLemas.isChecked() && ChckSeringBuangAir.isChecked() && ChckLukaSulitSembuh.isChecked()) {
                    NamaDiagnosa += "\n50% Diabetes";
                }


                else if(ChckNyeriDada.isChecked() && ChckPusing.isChecked() && ChckLemas.isChecked()) {
                    NamaDiagnosa += "\n50% Serangan Jantung";
                }
                else if(ChckNyeriDada.isChecked() && ChckPusing.isChecked() && ChckJantungBerdebar.isChecked()) {
                    NamaDiagnosa += "\n50% Serangan Jantung";
                }
                else if(ChckNyeriDada.isChecked() && ChckLemas.isChecked() && ChckMual.isChecked()) {
                    NamaDiagnosa += "\n50% Serangan Jantung";
                }
                else if(ChckNyeriDada.isChecked() && ChckLemas.isChecked() && ChckJantungBerdebar.isChecked()) {
                    NamaDiagnosa += "\n50% Serangan Jantung";
                }
                else if(ChckPusing.isChecked() && ChckLemas.isChecked() && ChckMual.isChecked()) {
                    NamaDiagnosa += "\n50% Serangan Jantung";
                }
                else if(ChckPusing.isChecked() && ChckMual.isChecked() && ChckJantungBerdebar.isChecked()) {
                    NamaDiagnosa += "\n50% Serangan Jantung";
                }
                else if(ChckLemas.isChecked() && ChckMual.isChecked() && ChckJantungBerdebar.isChecked()) {
                    NamaDiagnosa += "\n50% Serangan Jantung";
                }


                else if(ChckPusing.isChecked() && ChckKesadaranMenurun.isChecked()) {
                    NamaDiagnosa += "\n50% Stroke";
                }
                else if(ChckPusing.isChecked() && ChckKesulitanBerbicara.isChecked()) {
                    NamaDiagnosa += "\n50% Stroke";
                }
                else if(ChckMual.isChecked() && ChckKesadaranMenurun.isChecked()) {
                    NamaDiagnosa += "\n50% Stroke";
                }
                else if(ChckMual.isChecked() && ChckKesulitanBerbicara.isChecked()) {
                    NamaDiagnosa += "\n50% Stroke";
                }
                else if(ChckKesadaranMenurun.isChecked() && ChckKesulitanBerbicara.isChecked()) {
                    NamaDiagnosa += "\n50% Stroke";
                }

                //diagnosa 2 50%

                else if(ChckNyeriDada.isChecked() && ChckPusing.isChecked() && ChckMual.isChecked()) {
                    NamaDiagnosa += "\n50% Serangan Jantung & 50% Hipertensi";
                }

                //diagnosa 50% dan 25%

                else if(ChckSesakNafas.isChecked() && ChckNyeriDada.isChecked()) {
                    NamaDiagnosa += "\n50% Kanker Paru=Paru & 25% Hipertensi";
                }

                //diagnosa 50% dan 2 diagnosa 25%

                else if(ChckPusing.isChecked() && ChckMual.isChecked()) {
                    NamaDiagnosa += "\n50% Stroke & 25% Hipertensi & 25% Serangan Jantung";
                }

                //diagnosa 25%

                else if(ChckSesakNafas.isChecked() && ChckPusing.isChecked()) {
                    NamaDiagnosa += "\n25% Hipertensi";
                }
                else if(ChckSesakNafas.isChecked() && ChckMual.isChecked()) {
                    NamaDiagnosa += "\n25% Hipertensi";
                }
                else if(ChckSesakNafas.isChecked() && ChckMimisan.isChecked()) {
                    NamaDiagnosa += "\n25% Hipertensi";
                }
                else if(ChckNyeriDada.isChecked() && ChckMimisan.isChecked()) {
                    NamaDiagnosa += "\n25% Hipertensi";
                }
                else if(ChckPusing.isChecked() && ChckMimisan.isChecked()) {
                    NamaDiagnosa += "\n25% Hipertensi";
                }
                else if(ChckMual.isChecked() && ChckMimisan.isChecked()) {
                    NamaDiagnosa += "\n25% Hipertensi";
                }


                else if(ChckBeratBadanMenurun.isChecked() && ChckPusing.isChecked()) {
                    NamaDiagnosa += "\n25% Diabetes";
                }
                else if(ChckBeratBadanMenurun.isChecked() && ChckLemas.isChecked()) {
                    NamaDiagnosa += "\n25% Diabetes";
                }
                else if(ChckBeratBadanMenurun.isChecked() && ChckSeringBuangAir.isChecked()) {
                    NamaDiagnosa += "\n25% Diabetes";
                }
                else if(ChckBeratBadanMenurun.isChecked() && ChckLukaSulitSembuh.isChecked()) {
                    NamaDiagnosa += "\n25% Diabetes";
                }
                else if(ChckPusing.isChecked() && ChckSeringBuangAir.isChecked()) {
                    NamaDiagnosa += "\n25% Diabetes";
                }
                else if(ChckPusing.isChecked() && ChckLukaSulitSembuh.isChecked()) {
                    NamaDiagnosa += "\n25% Diabetes";
                }
                else if(ChckLemas.isChecked() && ChckSeringBuangAir.isChecked()) {
                    NamaDiagnosa += "\n25% Diabetes";
                }
                else if(ChckLemas.isChecked() && ChckLukaSulitSembuh.isChecked()) {
                    NamaDiagnosa += "\n25% Diabetes";
                }
                else if(ChckSeringBuangAir.isChecked() && ChckLukaSulitSembuh.isChecked()) {
                    NamaDiagnosa += "\n25% Diabetes";
                }


                else if(ChckNyeriDada.isChecked() && ChckLemas.isChecked()) {
                    NamaDiagnosa += "\n25% Serangan Jantung";
                }
                else if(ChckNyeriDada.isChecked() && ChckJantungBerdebar.isChecked()) {
                    NamaDiagnosa += "\n25% Serangan Jantung";
                }
                else if(ChckPusing.isChecked() && ChckMual.isChecked()) {
                    NamaDiagnosa += "\n25% Serangan Jantung";
                }
                else if(ChckPusing.isChecked() && ChckJantungBerdebar.isChecked()) {
                    NamaDiagnosa += "\n25% Serangan Jantung";
                }
                else if(ChckLemas.isChecked() && ChckMual.isChecked()) {
                    NamaDiagnosa += "\n25% Serangan Jantung";
                }
                else if(ChckLemas.isChecked() && ChckJantungBerdebar.isChecked()) {
                    NamaDiagnosa += "\n25% Serangan Jantung";
                }
                else if(ChckMual.isChecked() && ChckJantungBerdebar.isChecked()) {
                    NamaDiagnosa += "\n25% Serangan Jantung";
                }

                //diagnosa 2 25%

                else if(ChckNyeriDada.isChecked() && ChckPusing.isChecked()) {
                    NamaDiagnosa += "\n25% Hipertensi & 25% Serangan Jantung";
                }
                else if(ChckNyeriDada.isChecked() && ChckMual.isChecked()) {
                    NamaDiagnosa += "\n25% Hipertensi & 25% Serangan Jantung";
                }
                else if(ChckPusing.isChecked() && ChckLemas.isChecked()) {
                    NamaDiagnosa += "\n25% Diabetes & 25% Serangan Jantung";
                }

                //
                else {
                    NamaDiagnosa += "\nTidak Bisa Menemukan Diagnosa";
                }

                tvOutputPenyakit.setText(""+NamaDiagnosa);
            }

        });//getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnSolusi.setOnClickListener(v ->{
            Intent intent = new Intent(this, JenisPenyakitActivity.class);
            startActivity(intent);
        });
    }

    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        String str="";

        switch(view.getId()) {
            case R.id.sesakNafas:
                str =  checked?"Gejala Sesak Nafas Diseleksi ":"Gejala Sesak Nafas Tidak Diseleksi";
                break;
            case R.id.beratBadan:
                str =  checked?"Gejala Berat Badan Menurun Diseleksi ":"Gejala Berat Badan Tidak Diseleksi";
                break;
            case R.id.batukBerdarah:
                str =  checked?"Gejala Batuk Berdarah Diseleksi ":"Gejala Batuk Berdarah Tidak Diseleksi";
                break;
            case R.id.nyeriDada:
                str =  checked?"Gejala Nyeri Dada Diseleksi ":"Gejala Nyeri Dada Tidak Diseleksi";
                break;
            case R.id.pusing:
                str =  checked?"Gejala Pusing Diseleksi ":"Gejala Pusing Tidak Diseleksi";
                break;
            case R.id.lemas:
                str =  checked?"Gejala Lemas Diseleksi ":"Gejala Lemas Tidak Diseleksi";
                break;
            case R.id.mual:
                str =  checked?"Gejala Mual Diseleksi ":"Gejala Mual Tidak Diseleksi";
                break;
            case R.id.kesadaranMenurun:
                str =  checked?"Gejala Kesadaran Menurun Diseleksi ":"Gejala Kesadaran Menurun Tidak Diseleksi";
                break;
            case R.id.sulitBicara:
                str =  checked?"Gejala Kesulitan Berbicara Diseleksi ":"Gejala Kesulitan Berbicara Tidak Diseleksi";
                break;
            case R.id.buangAir:
                str =  checked?"Gejala Sering Buang Air Kecil Diseleksi ":"Gejala Sering Buang Air Kecil Tidak Diseleksi";
                break;
            case R.id.lukaSulitsembuh:
                str =  checked?"Gejala Luka Sulit Sembuh Diseleksi ":"Gejala Luka Sulit Sembuh Tidak Diseleksi";
                break;
            case R.id.detakJantung:
                str =  checked?"Gejala Detak Jantung Berdebar Diseleksi ":"Gejala Detak Jantung Berdebar Tidak Diseleksi";
                break;
            case R.id.mimisan:
                str =  checked?"Gejala Mimisan Diseleksi ":"Gejala Mimisan Tidak Diseleksi";
                break;
        }

        Toast.makeText(getApplicationContext(),str, Toast.LENGTH_SHORT).show();

    }
}