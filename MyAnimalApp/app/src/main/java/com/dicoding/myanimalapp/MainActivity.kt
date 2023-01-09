package com.dicoding.myanimalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.animalapp.Animal
import android.net.Uri



class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_DETAIL = "intent_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val AnimalList = listOf<Animal>(
                Animal(
                        "Kucing",
                        "Kucing disebut juga kucing domestik atau kucing rumah (nama ilmiah: Felis silvestris catus atau Felis catus) adalah sejenis mamalia karnivora dari keluarga Felidae. Kata \\\"kucing\\\" biasanya merujuk kepada \\\"kucing\\\" yang telah dijinakkan, tetapi bisa juga merujuk kepada \\\"kucing besar\\\" seperti singa dan harimau. Saat ini, kucing adalah salah satu hewan peliharaan terpopuler di dunia.Kucing yang garis keturunannya tercatat secara resmi sebagai kucing trah atau galur murni (pure breed), seperti persia, siam, manx, dan sphinx. Kucing seperti ini biasanya dibiakkan di tempat pemeliharaan hewan resmi. Jumlah kucing ras hanyalah 1% dari seluruh kucing di dunia, sisanya adalah kucing dengan keturunan campuran seperti kucing liar atau kucing kampung",
                        R.drawable.kucing
                ),
                Animal(
                        "Anjing",
                        "Anjing adalah mamalia yang telah mengalami domestikasi dari serigala sejak 15.000 tahun yang lalu, bahkan kemungkinan sudah sejak 100.000 tahun yang lalu berdasarkan bukti genetik berupa penemuan fosil dan tes DNA. Penelitian lain mengungkap sejarah domestikasi anjing yang belum begitu lama.\n. Anjing telah berkembang menjadi ratusan ras dengan berbagai macam variasi. Warna rambut anjing bisa beraneka ragam, mulai dari putih sampai hitam, juga merah, abu-abu (sering disebut \"biru\"), dan cokelat. Selain itu, anjing memiliki berbagai jenis rambut. Rambut anjing bisa lurus atau keriting, dan bertekstur kasar hingga lembut seperti benang wol.",
                        R.drawable.anjing
                ),
                Animal(
                        "Kelinci",
                        "Kelinci adalah hewan mamalia dari famili Leporidae, yang dapat ditemukan di banyak bagian bumi. Kelinci berkembangbiak dengan cara beranak yang disebut vivipar. Dulunya, hewan ini adalah hewan liar yang hidup di Afrika hingga ke daratan Eropa. Pada perkembangannya, tahun 1912, kelinci diklasifikasikan dalam ordo Lagomorpha. Ordo ini dibedakan menjadi dua famili, yakni Ochtonidae (jenis pika yang pandai bersiul) dan Leporidae (termasuk di dalamnya jenis kelinci dan terwelu). Asal kata kelinci berasal dari bahasa Belanda, yaitu konijntje yang berarti \"anak kelinci\". Hal ini menunjukkan bahwa masyarakat Nusantara mulai mengenali kelinci saat masa kolonial, padahal di Pulau Sumatra ada satu spesies asli kelinci sumatera (Nesolagus netscheri) yang baru ditemukan pada tahun 1972.",
                        R.drawable.kelinci
                ),
                Animal(
                        "Singa",
                        "Singa (bahasa Sanskerta: Siṃha, atau nama ilmiahnya Panthera leo) adalah spesies hewan dari keluarga felidae atau jenis kucing. Singa merupakan hewan yang hidup berkelompok. Biasanya terdiri dari seekor jantan dan banyak betina. Kelompok ini menjaga daerah kekuasaannya. Umur singa antara 10 sampai 15 tahun di alam bebas, tetapi dalam penangkaran memungkinkan lebih dari 20 tahun.\n",
                        R.drawable.singa
                ),
                Animal(
                        "Rusa",
                        "Rusa, sambar, atau menjangan (bahasa Inggris: deer) adalah hewan mamalia pemamah biak (ruminan) yang termasuk famili Cervidae. Salah satu ciri khas rusa adalah adanya antler (tanduk rusa), dan bukan tanduk, yang merupakan pertumbuhan tulang yang berkembang setiap tahun (biasanya pada musim panas) terutama pada rusa jantan (walaupun ada beberapa pengecualian). Ada sekitar 34 spesies rusa di seluruh dunia yang terbagi menjadi dua kelompok besar: kelompok rusa dunia lama yang termasuk subfamilia Muntiacinae dan Cervinae; serta kelompok rusa dunia baru, Hydropotinae dan Odocoilinae.",
                        R.drawable.rusa
                ),
                Animal(
                        "Kanguru",
                        "Kanguru (atau kangguru) adalah hewan mamalia yang memiliki kantung (marsupialia). Hewan ini termasuk hewan khas Australia. Kata kanguru diambil dari bahasa Aborigin gangguru. Kanguru mempunyai dua kaki belakang yang kuat, telapak kakinya yang besar didesain untuk meloncat. Kanguru biasa melompat dengan kecepatan 20–25 km/jam. Tapi mereka bisa melompat hingga kecepatannya menjadi 70 km/jam. Harapan hidup kanguru sekitar 9-18 tahun. Walau kadang-kadang ada kanguru yang bisa bertahan hidup hingga 28 tahun.",
                        R.drawable.kangguru
                ),
                Animal(
                        "Ayam",
                        "Ayam (Gallus gallus domesticus) adalah unggas yang biasa dipelihara orang untuk dimanfaatkan untuk keperluan hidup pemeliharanya. Ayam peliharaan (selanjutnya disingkat \"ayam\" saja) merupakan keturunan langsung dari salah satu subspesies ayam hutan yang dikenal sebagai ayam hutan merah (Gallus gallus) atau ayam bangkiwa (bankiva fowl). Semua ayam merupakan theropoda seperti tyrannosaurus. Kawin silang antarras ayam telah menghasilkan ratusan galur unggul atau galur murni dengan bermacam-macam fungsi; yang paling umum adalah ayam potong (untuk dipotong) dan ayam petelur (untuk diambil telurnya). Ayam biasa dapat pula dikawin silang dengan kerabat dekatnya, ayam hutan hijau, yang menghasilkan hibrida mandul yang jantannya dikenal sebagai ayam bekisar.",
                        R.drawable.ayam
                ),
                Animal(
                        "Kambing",
                        "Kambing ternak (Capra aegagrus hircus) merupakan salah satu subspesies kambing yang dipelihara atau dijinakkan dari kambing liar Asia Barat Daya dan Eropa Timur. Kambing merupakan anggota dari keluarga Bovidae dan bersaudara dengan biri-biri karena keduanya tergolong dalam sub famili Caprinae. Terdapat lebih 300 jenis kambing yang berbeda-beda. Kambing adalah salah satu di antara spesies yang paling lama di ternakkan, yaitu untuk susu, daging, bulu, dan kulit di seluruh dunia. Pada tahun 2011, populasi kambing yang hidup di seluruh dunia mencapai 924 juta menurut Organisasi Pangan dan Pertanian Perserikatan Bangsa-Bangsa.",
                        R.drawable.kambing
                ),
                Animal(
                        "Sapi",
                        "Sapi adalah hewan ternak anggota suku Bovidae dan anak suku Bovinae. Sapi yang telah dikebiri dan biasanya digunakan untuk membajak sawah dinamakan lembu. Sapi dipelihara terutama untuk dimanfaatkan susu dan dagingnya sebagai pangan manusia. Hasil sampingannya seperti kulit, jeroan, tanduk, dan kotorannya juga dimanfaatkan untuk berbagai keperluan manusia. Di sejumlah tempat, sapi juga dipakai sebagai penggerak alat transportasi, pengolahan lahan tanam (bajak), dan alat industri lain (seperti peremas tebu). Karena banyak kegunaan ini, sapi telah menjadi bagian dari berbagai kebudayaan manusia sejak lama",
                        R.drawable.sapi
                ),
                Animal(
                        "Kuda",
                        "Kuda (Equus caballus atau Equus ferus caballus) adalah salah satu dari sepuluh spesies modern mamalia dari genus Equus. Hewan ini telah lama merupakan salah satu hewan peliharaan yang penting secara ekonomis dan historis, dan telah memegang peranan penting dalam pengangkutan orang dan barang selama ribuan tahun.",
                        R.drawable.kuda
                ),
                Animal(
                        "Komodo",
                        "Komodo, atau juga disebut biawak komodo (Varanus komodoensis), adalah spesies biawak besar yang terdapat di Pulau Komodo, Rinca, Flores, Gili Motang, dan Gili Dasami di Provinsi Nusa Tenggara Timur, Indonesia. Biawak ini oleh penduduk asli pulau Komodo juga disebut dengan nama setempat ora. Tubuhnya yang besar dan reputasinya yang mengerikan membuat mereka menjadi salah satu hewan paling terkenal di dunia. Sekarang, habitat komodo yang sesungguhnya telah menyusut akibat aktivitas manusia, sehingga lembaga IUCN memasukkan komodo sebagai spesies yang rentan terhadap kepunahan. Biawak komodo telah ditetapkan sebagai hewan yang dilindungi oleh pemerintah Indonesia dan habitanya dijadikan taman nasional, yaitu Taman Nasional Komodo, yang tujuannya didirikan untuk melindungi mereka.",
                        R.drawable.komodo
                )
        )


        var rvAnimal = findViewById<RecyclerView>(R.id.rv_animals)
        rvAnimal.layoutManager = LinearLayoutManager(this)
        rvAnimal.setHasFixedSize(true)
        rvAnimal.adapter = AnimalAdapter(this, AnimalList) {
            val intent = Intent(this, DetailAnimalActivity::class.java)
            intent.putExtra(INTENT_DETAIL, it)
            startActivity(intent)
        }


    }
    override fun onCreateOptionsMenu(menu : Menu) : Boolean{
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if(id == R.id.about_me_activity){
                val moveIntent = Intent(this@MainActivity, AboutMe::class.java)
                startActivity(moveIntent)
            }
        return super.onOptionsItemSelected(item)
    }
}