package com.example.destinasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2016/07/sembalun-via-eben_m.zain_-740x555.jpg");
        mNames.add("Bukit Pergasingan");
        mDesc.add("Bisa jadi ini adalah pemandangan paling spektakuler yang akan Anda temukan di Lombok. Petak-petak sawah dan kebun-kebun warga yang berwarna-warni dan dikelilingi deretan pegunungan tinggi, ditambah langit biru yang membentang amat sangat menyejukkan mata. Bahkan sekarang bukit ini telah dimanfaatkan sebagai lokasi berbagai aktivitas menantang, seperti paralayang, sepeda gunung, dan lain sebagainya. Kami sarankan Anda untuk sempatkan diri bermalam dan mendirikan tenda di sini supaya bisa menangkap panorama sunrise nan indah yang muncul dari balik Gunung Rinjani. Dari tempat yang kini telah menjadi taman wisata alam ini Anda bahkan dapat melihat kemegahan Gunung Rinjani.\n" +
                "Berdiri di ketinggian 1.670 meter di atas permukaan laut atau sekitar 673 meter dari dataran Sembalun, Bukit Pergasingan  bisa didaki selama 2 – 2,5 jam dan sering dijadikan tempat latihan sebelum mendaki Gunung Rinjani.");

        mImageUrls.add("https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2018/02/3c-1-via-indonesianomad-740x740.jpg");
        mNames.add("Air Terjun Penimbungan");
        mDesc.add("Apakah Anda sudah merencanakan liburan dengan mendaki Gunung Rinjani? Jika iya, pastikan menambahkan kunjungan ke spot pandang Air Terjun Penimbungan ke dalam perjalanan Anda.\n" +
                "Meskipun mencapai puncak Rinjani saat matahari terbit adalah tujuan akhir Anda, pemandangan Air terjun Penimbungan dari pintu masuk Torean juga nggak kalah kok dengan keindahan Rinjani.\n" +
                "Jalur dari Torean adalah jalan yang jarang dilalui jika dibandingkan dengan pintu masuk Sembalun dan Senaru dalam perjalanan mendaki Rinjani. Bahkan nama Air Terjun Penimbungan sendiri belum banyak yang pernah mendengarnya.\n" +
                "Setelah menempuh pendakian selama 2 jam dari pintu masuk Torean, Anda akan mencapai spot sempurna untuk menyaksikan air terjun setinggi 75 meter ini. Pemandangan di sekitarnya begitu liar dan alami, persis seperti di masa prasejarah.");

        mImageUrls.add("https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2019/03/22376468262_f19e88c870_b.jpg");
        mNames.add("Air Terjun Benang Kelambu");
        mDesc.add("Sesuai namanya, air terjun ini memang unik dan lain daripada air terjun lain umum Anda jumpai. Aliran air yang jatuh dari ketinggian tebing tidak langsung terhempas ke bawah, melainkan melewati celah-celah tanaman merambat yang tumbuh lebat di tebing sehingga tampak bagai kelambu atau tirai yang menggantung di udara. Jalan menuju air terjun ini memang sudah beraspal, namun sayang kondisinya kurang bagus. Sepanjang perjalanan Anda akan melalui jalan pedesaan yang sedikit berliku dan naik turun dengan hamparan sawah di kiri kanan. Sebelum tiba di lokasi air terjun yang airnya bersumber dari Danau Segara Anak, Gunung Rinjani ini Anda bakal memasuki kawasan perkebunan kopi dan coklat dengan udara pegunungan yang sejuk. Konon, menurut cerita yang diyakini warga setempat, jika mandi di air terjun ini Anda bisa terbebas dari segala macam penyakit dan juga awet muda!\n" +
                "Puas dari sini, jangan langsung pulang. Anda bisa mampir sejenak ke Air Terjun Benang Stokel yang berjarak 500 meter atau sekitar 30 menit perjalanan.");

        mImageUrls.add("https://indonesia.tripcanvas.co/wp-content/uploads/2018/01/22299244816_11613cf303_b.jpg");
        mNames.add("Mentigi Bay Dome Villas");
        mDesc.add("Resort menawan ini bertengger di atas sebuah bukit menghadap langsung ke arah laut biru.Begitu melangkahkan diri ke dalam, Anda seolah langsung dibawa menuju negeri fantasi yang berisi bangunan-bangunan berasitektur unik yang sepintas akan mengingatkan pada rumah-rumah bangsa Hobbit di film Lord of the Rings.Meskipun dari luar vila-vila berbentuk kubah (dome) ini terlihat aneh, namun di dalamnya Anda akan menemukan kenyamanan sekaligus kemewahan. Ya, Anda bisa menikmati panorama alam langsung dari atas tempat tidur! Anda bahkan bisa menginap di connecting dome villas yang dilengkapi dengan kolam renang pribadi yang menghadap laut.");

        mImageUrls.add("https://indonesia.tripcanvas.co/wp-content/uploads/2016/02/2-gili-air-lagoon-resort-via-courtsjoe-1.jpg");
        mNames.add("Gili Air Lagoon Resort");
        mDesc.add("Kalau Anda ingin membuat pengalaman berlibur di Gili Air tidak terlupakan, maka Gili Air Lagoon Resort adalah tempat yang paling sempurna.Resort ini berbentuk lingkaran dengan pondok-pondok kayu berjajar mengelilingi kolam biru di tengahnya. Kalau Anda kurang suka bermain air laut, maka melompat langsung dari kamar ke kolam ini tentu bisa jadi pilihan.Anda juga dapat menikmati fasilitas istimewa dari resort ini berupa kayak yang sengaja dibuat transparan. Ya! Jadi sambil mengayuh dayung, Anda juga bisa melihat langsung keindahan panorama alam bawah laut.Anda bahkan tak perlu basah-basahan untuk bisa menikmatinya – ya, kecuali kalau Anda memang tak pandai mengayuh dayung. Tapi kami yakin Anda pasti bisa! ");

        mImageUrls.add("https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2019/03/22350643672_f5701e4ee2_b.jpg");
        mNames.add("Gunung Rinjani");
        mDesc.add("Semua orang yang mengaku traveler sejati mestinya memasukkan ini ke dalam bucket list mereka: mendaki gunung berapi.\n" +
                "Ibaratnya seorang perokok berat, Gunung Rinjani merupakan gunung berapi aktif yang tak henti-hentinya mengeluarkan asap. Namun demikian, keindahan alam yang memukau membuat siapapun tetap tergoda untuk menaklukkannya.Keindahan panoramanya yang begitu luar biasa ini pula yang menjadikan Gunung Rinjani sebagai salah satu destinasi wisata alam gunung berapi paling terkenal di dunia.\n" +
                "Dengan tinggi menjulang hingga 3.726 meter, gunung ini juga menjadi gunung tertinggi kedua di Indonesia. Sehingga wajar saja, untuk mendakinya termasuk sangat menantang dan membutuhkan waktu setidaknya 4 hari 3 malam.Oleh sebab itu diperlukan kondisi fisik yang benar-benar prima sebelum Anda memutuskan untuk mendakinya. Ada baiknya, persiapkan diri sebelumnya dangan latihan fisik seperti berjalan kaki setidaknya 5 kilometer setiap hari agar nanti Anda tidak syok ketika menghadapi trek yang sesungguhnya.Walaupun untuk menuju puncak bakal menguras banyak sekali tenaga dan keringat, namun pemandangan yang menyambut Anda setibanya di sana akan membuat semua lelah lenyap seketika. Siapa yang membutuhkan hotel bintang 5 kalau di sini Anda bisa tidur di bawah milyaran bintang sambil memandangi gugusan bintang yang spektakuler?");

        mImageUrls.add("https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2017/06/1-2-pool-by-sarasester-740x506.jpg");
        mNames.add("Katamaran Resort");
        mDesc.add("Jika mencari tempat menginap yang membuat Anda bak seorang raja, kami yakin Anda akan menyukai Katamaran Resort.Terletak di jantung Senggigi, penginapan ini terbebas dari hiruk-pikuk keramaian. Sebuah tempat yang tenang dan damai, Katamaran menawarkan pemandangan lautan yang menakjubkan tepat ketika Anda melangkah keluar dari villa pribadi.Berita bagus untuk para penyuka pantai, pasir pantai hanya selangkah dari pintu, jadi Anda tinggal “ngesot” saja kalau mau ke pantai.Bila Anda lelah dan bosan akan laut jernih dan pantai berpasir putih (walaupun kami meragukan itu!), Anda dapat menghabiskan waktu di Soul Bliss Spa atau di kolam renang, dengan berjemur di pinggiran infinity pool menikmati pemandangan laut lepas.Jika ingin lebih menggerakkan kaki, Anda dapat pergi dengan taksi ke pusat Senggigi (dengan tarif di bawah Rp30.000,-) untuk seharian berbelanja dan berjalan-jalan.\n" +
                "Anda dapat pulang menjelang senja, ketika dua restoran tepi pantai mulai menata tempat romantis menghadap lautan lepas. Anda dapat menikmati makan malam sembari melihat matahari terbenam dengan cara yang tidak terlupakan!");

        mImageUrls.add("https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2019/03/22200413150_9f32e6a0d2_b.jpg");
        mNames.add("Pantai Semeti");
        mDesc.add("Pernah menonton film Superman? Ya, suasana di sekitar pantai ini mirip sekilas mirip sekali dengan Planet Krypton? Formasi bebatuan dan karang di sekelilingnya meruncing dan berlapis-lapis layaknya dinding kristal yang terdapat di Panet Krypton. Itulah mengapa pantai ini juga dijuluki Pantai Krypton.Bahkan ada beberapa formasi karang yang bentuknya menyerupai piramida yang mencuat dari permukaan air laut.");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls,mDesc);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}






















